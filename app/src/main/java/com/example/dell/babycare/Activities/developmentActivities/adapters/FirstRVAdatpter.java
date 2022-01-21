package com.example.dell.babycare.Activities.developmentActivities.adapters;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.example.dell.babycare.Activities.developmentActivities.activities.HomeActivity;
import com.example.dell.babycare.Activities.developmentActivities.activities.ShowDetail;
import com.example.dell.babycare.Activities.developmentActivities.model.FragmentModel;
import com.example.dell.babycare.Activities.developmentActivities.model.PhotoModel;
import com.example.dell.babycare.R;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by DELL on 1/3/2018.
 */
public class FirstRVAdatpter extends RecyclerView.Adapter<FirstRVAdatpter.MyHolder> {
  public static ArrayList<String> favarraylist = new ArrayList<>();
    Context context;
    List<String> namelist,detaillist;
    public static ArrayList<FragmentModel> DevelopmentImageDetailData=new ArrayList<>();
    View v;
    Firebase firebase;
    OnItemClick onItemClick;
    public static boolean favClick;
    public static int development_position=0;
//    public static ArrayList<String> favdetaillist = new ArrayList<>();
    SharedPreferences sharedPreferences;
    String childKey;
    String imageUri="";
    int image;
    public FirstRVAdatpter(FragmentActivity activity, List<String> namelist, List<String> detaillist, String childKey,int image) {
        this.context = activity;
        this.namelist = namelist;
        this.detaillist = detaillist;
        this.childKey=childKey;
        this.image = image;
    }
    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       v = LayoutInflater.from(context).inflate(R.layout.firstcardview,parent,false);
        return new MyHolder(v);
    }
    @Override
    public void onBindViewHolder(final MyHolder holder, final int position) {
        development_position=position;
        favClick = false;

           holder.tdetail.setText(namelist.get(position));
           holder.progressBar.setVisibility(View.INVISIBLE);
           holder.fist_text.setText(namelist.get(position));
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,ShowDetail.class);
                Bundle bundle = new Bundle();
                bundle.putString("name",namelist.get(position));
                bundle.putString("detail",detaillist.get(position));
                bundle.putInt("pos",position);
                bundle.putString("key",childKey);
                intent.putExtras(bundle);
                context.startActivity(intent);
               // onItemClick.onclick(namelist.get(position),detaillist.get(position),holder.getAdapterPosition());
            }
        });
        try{
            Firebase.setAndroidContext(context);
            Firebase firebase=new Firebase("https://myschoolserver-dcae9.firebaseio.com/");
            firebase.child("BabyPhoto").child(childKey).addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {

                    for (DataSnapshot sh:dataSnapshot.getChildren()) {
                        if (sh.getValue(PhotoModel.class).getChildkey()==position)
                        imageUri = sh.getValue(PhotoModel.class).getImage();
                    }
                    if(imageUri==null)
                        holder.baby.setImageResource(image);
                    else {
                        try {
                            Glide.with(context).load(imageUri).diskCacheStrategy(DiskCacheStrategy.ALL)
                                    .listener(new RequestListener<String, GlideDrawable>() {
                                        @Override
                                        public boolean onException(Exception e, String model, Target<GlideDrawable> target, boolean isFirstResource) {
                                            holder.baby.setVisibility(View.INVISIBLE);
                                            holder.progressBar.setVisibility(View.GONE);
                                            holder.image_refresh.setVisibility(View.VISIBLE);
                                            return false;
                                        }

                                        @Override
                                        public boolean onResourceReady(GlideDrawable resource, String model, Target<GlideDrawable> target, boolean isFromMemoryCache, boolean isFirstResource) {
                                            holder.baby.setVisibility(View.VISIBLE);
                                            holder.progressBar.setVisibility(View.GONE);
                                            holder.image_refresh.setVisibility(View.GONE);
                                            return false;
                                        }
                                    }).into(holder.baby);
                        }catch (IllegalArgumentException ill){
                            holder.baby.setImageResource(R.drawable.develop);
                        }
                    }
                }
                @Override
                public void onCancelled(FirebaseError firebaseError) {

                }
            });
        }catch (Exception e){
            holder.baby.setImageResource(image);
        }


    }
    @Override
    public int getItemCount() {
       return namelist.size();
    }
    public void setOnitemClickListener(OnItemClick onItemClick){
        this.onItemClick = onItemClick;
    }
    public class MyHolder extends RecyclerView.ViewHolder {
        ImageView baby,favorite;
        TextView tdetail;
        CardView cardView;
        ImageView image_refresh;
        ProgressBar progressBar;
        TextView fist_text;
        public MyHolder(View itemView) {
            super(itemView);
            baby = (ImageView) itemView.findViewById(R.id.bimage);
            tdetail = (TextView) itemView.findViewById(R.id.tdetil);
           // favorite = (ImageView) itemView.findViewById(R.id.imgfav);
            cardView = (CardView) itemView.findViewById(R.id.card);
            image_refresh= (ImageView) itemView.findViewById(R.id.development_refresh);
            progressBar= (ProgressBar) itemView.findViewById(R.id.development_loading);
            fist_text = (TextView) itemView.findViewById(R.id.first_card_title);
        }
    }
    public interface OnItemClick{
        public void onclick(String name,String detail, int position);
    }
}