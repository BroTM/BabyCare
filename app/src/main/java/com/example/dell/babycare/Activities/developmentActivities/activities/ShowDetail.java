package com.example.dell.babycare.Activities.developmentActivities.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.example.dell.babycare.Activities.developmentActivities.model.FragmentModel;
import com.example.dell.babycare.Activities.developmentActivities.model.PhotoModel;
import com.example.dell.babycare.R;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

import java.util.ArrayList;

import static com.example.dell.babycare.Activities.developmentActivities.adapters.FirstRVAdatpter.DevelopmentImageDetailData;
import static com.example.dell.babycare.Activities.developmentActivities.adapters.FirstRVAdatpter.development_position;

public class ShowDetail extends AppCompatActivity  {

    Toolbar toolbar;
    Firebase firebase;
    int position =0;
    RecyclerView.Adapter adapter;
    ProgressBar progress;
    String detail;
    String key;
    ImageView detail_image;
    TextView textView;
    ProgressBar shop_loading;
    ImageView shop_refresh;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_detail);
        toolbar = (Toolbar) findViewById(R.id.show_detail_toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        detail_image = (ImageView) findViewById(R.id.detailimage);
        textView = (TextView) findViewById(R.id.textdetail);
        shop_loading= (ProgressBar) findViewById(R.id.detail_loading);
        shop_refresh= (ImageView) findViewById(R.id.detail_refresh);
        Bundle b = getIntent().getExtras();
        name = b.getString("name");
        detail=b.getString("detail");
        position=b.getInt("pos");
        key=b.getString("key");
//        image = b.getString("image");

        getSupportActionBar().setTitle(name);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        try{
            Firebase.setAndroidContext(ShowDetail.this);
            Firebase firebase=new Firebase("https://myschoolserver-dcae9.firebaseio.com/");
            firebase.child("BabyPhoto").child(key).addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {

                    String image="content://com.google.android.apps.photos.contentprovider/-1/1/content%3A%2F%2Fmedia%2Fexternal%2Fimages%2Fmedia%2F19013/ORIGINAL/NONE/1324140894";
                    for (DataSnapshot sh:dataSnapshot.getChildren()) {
                        if (sh.getValue(PhotoModel.class).getChildkey()==position)
                            image = sh.getValue(PhotoModel.class).getImage();
                    }
                    if(image==null) {
                        detail_image.setImageResource(R.drawable.develop);
                    }
                    else {
                        try {
                            Glide.with(ShowDetail.this).load(image).diskCacheStrategy(DiskCacheStrategy.ALL)
                                    .listener(new RequestListener<String, GlideDrawable>() {
                                        @Override
                                        public boolean onException(Exception e, String model, Target<GlideDrawable> target, boolean isFirstResource) {
                                            detail_image.setVisibility(View.INVISIBLE);
                                            shop_loading.setVisibility(View.GONE);
                                            shop_refresh.setVisibility(View.VISIBLE);
                                            return false;
                                        }

                                        @Override
                                        public boolean onResourceReady(GlideDrawable resource, String model, Target<GlideDrawable> target, boolean isFromMemoryCache, boolean isFirstResource) {
                                            detail_image.setVisibility(View.VISIBLE);
                                            shop_loading.setVisibility(View.GONE);
                                            shop_refresh.setVisibility(View.GONE);
                                            return false;
                                        }
                                    }).into(detail_image);
                        }catch (java.lang.IllegalArgumentException e){
                            detail_image.setImageResource(R.drawable.develop);
                        }
                    }
                }
                @Override
                public void onCancelled(FirebaseError firebaseError) {

                }
            });
        }catch (Exception e){
            detail_image.setImageResource(R.drawable.develop);
        }
        textView.setText(detail);
        shop_loading.setVisibility(View.INVISIBLE);

    }
}
