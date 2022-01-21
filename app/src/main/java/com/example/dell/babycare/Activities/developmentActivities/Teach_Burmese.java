package com.example.dell.babycare.Activities.developmentActivities;

import android.media.MediaPlayer;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.dell.babycare.R;

public class Teach_Burmese extends AppCompatActivity {
    ImageView nextnext,prepre;
    ViewPager viewPager;
    MediaPlayer mone,mtwo,mthree,mfour,mfive,msix,mseven,meight,mnine,mten
                ,mone2,mtwo2,mthree2,mfour2,mfive2,msix2,mseven2,meight2,mnine2,mten2,mone3,mtwo3,mthree3,mfour3,mfive3,msix3,mseven3,meight3,mnine3,mten3,mone4,mtwo4,mthree4;
    boolean one=false,two=false,three=false,four=false,five=false,six=false,seven=false,eight=false,nine=false,ten=false,eleven=false,tweleve=false,thirthty=false,fourthy=false,fifthy=false,sixthy=false,
                seventhy=false,eighty=false,ninthy=false,twenty=false,
                twentyone=false,twentytwo=false,twentythree=false,twentyfour=false,twentyfive=false,twentysix=false,twentyseven=false,twentyeight=false,twentynine=false,thirty=false,thirtyone=false,thirtytwo=false,thirtythree=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teach__burmese);
        nextnext=(ImageView)findViewById(R.id.nextnext);
        nextnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(viewPager.getCurrentItem()+1);
            }
        });
        prepre=(ImageView)findViewById(R.id.prepre);
        prepre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(viewPager.getCurrentItem()-1);
            }
        });


        mone=MediaPlayer.create(this,R.raw.kagyi);
        mtwo=MediaPlayer.create(this,R.raw.khakway);
        mthree=MediaPlayer.create(this,R.raw.gangal);
        mfour=MediaPlayer.create(this,R.raw.gyagyi);
        mfive=MediaPlayer.create(this,R.raw.nga);
        msix=MediaPlayer.create(this,R.raw.salone);
        mseven=MediaPlayer.create(this,R.raw.salain);
        meight=MediaPlayer.create(this,R.raw.zakwel);
        mnine=MediaPlayer.create(this,R.raw.myintzwel);
        mten=MediaPlayer.create(this,R.raw.nya);
        mone2=MediaPlayer.create(this,R.raw.tatalingate);
        mtwo2=MediaPlayer.create(this,R.raw.htawinbel);
        mthree2=MediaPlayer.create(this,R.raw.dayingout);
        mfour2=MediaPlayer.create(this,R.raw.htayinhmote);
        mfive2=MediaPlayer.create(this,R.raw.nagyi);
        msix2=MediaPlayer.create(this,R.raw.tawanpu);
        mseven2=MediaPlayer.create(this,R.raw.htaseinhtoo);
        meight2=MediaPlayer.create(this,R.raw.dadway);
        mnine2=MediaPlayer.create(this,R.raw.dawachite);
        mten2=MediaPlayer.create(this,R.raw.ngangel);
        mone3=MediaPlayer.create(this,R.raw.pasout);
        mtwo3=MediaPlayer.create(this,R.raw.phwahtote);
        mthree3=MediaPlayer.create(this,R.raw.balashite);
        mfour3=MediaPlayer.create(this,R.raw.bagone);
        mfive3=MediaPlayer.create(this,R.raw.ma);
        msix3=MediaPlayer.create(this,R.raw.yaplat);
        mseven3=MediaPlayer.create(this,R.raw.yagout);
        meight3=MediaPlayer.create(this,R.raw.la);
        mnine3=MediaPlayer.create(this,R.raw.wa);
        mten3=MediaPlayer.create(this,R.raw.tha);
        mone4=MediaPlayer.create(this,R.raw.ha);
        mtwo4=MediaPlayer.create(this,R.raw.lagyi);
        mthree4=MediaPlayer.create(this,R.raw.ar);


        prepre.setVisibility(View.INVISIBLE);
        viewPager= (ViewPager) findViewById(R.id.teach_burmese_pager);
        Myteach_Burmese adapter=new Myteach_Burmese(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        if (viewPager.getCurrentItem()==0){
            mone.start();
            one=true;
        }
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override

            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                    switch (position){
                        case 0:
                            one=true;
                            prepre.setVisibility(View.INVISIBLE);
                            if (two){
                                mone.start();
                                mtwo.pause();
                                two=false;
                            }else if (three){
                                mone.start();
                                mthree.pause();
                                three=false;
                            }else if (four){
                                mone.start();
                                mfour.pause();
                                four=false;
                            }else if (five){
                                mone.start();
                                mfive.pause();
                                five=false;
                            }else if (six){
                                mone.start();
                                msix.pause();
                                six=false;
                            }else if (seven){
                                mseven.pause();
                                seven=false;
                            }else if (eight){
                                mone.start();
                                meight.pause();
                                eight=false;
                            }else if (nine){
                                mone.start();
                                mnine.pause();
                                nine=false;
                            }else if (ten){
                                mone.start();
                                mten.pause();
                                ten=false;
                            }else if (eleven){
                                mone.start();
                                mone2.pause();
                                eleven=false;
                            }else if (tweleve){
                                mone.start();
                                mtwo2.pause();
                                tweleve=false;
                            }else if (thirthty){
                                mone.start();
                                mthree2.pause();
                                thirthty=false;
                            }else if (fourthy){
                                mone.start();
                                mfour2.pause();
                                fourthy=false;
                            }else if (fifthy){
                                mone.start();
                                mfive2.pause();
                                fifthy=false;
                            }else if (sixthy){
                                mone.start();
                                msix2.pause();
                                sixthy=false;
                            }else if (seventhy){
                                mone.start();
                                mseven2.pause();
                                seventhy=false;
                            }else if (eighty){
                                mone.start();
                                meight2.pause();
                                eighty=false;
                            }else if (ninthy){
                                mone.start();
                                mnine2.pause();
                                ninthy=false;
                            }else if (twenty){
                                mone.start();
                                mten2.pause();
                                twenty=false;
                            }else if (twentyone){
                                mone.start();
                                mone3.pause();
                                twentyone=false;
                            }else if (twentytwo){
                                mone.start();
                                mtwo3.pause();
                                twentytwo=false;
                            }else if (twentythree){
                                mone.start();
                                mthree3.pause();
                                twentythree=false;
                            }else if (twentyfour){
                                mone.start();
                                mfour3.pause();
                                twentyfour=false;
                            }else if (twentyfive){
                                mone.start();
                                mfive3.pause();
                                twentyfive=false;
                            }else if (twentysix){
                                mone.start();
                                msix3.pause();
                                twentysix=false;
                            }else if (twentyseven){
                                mone.start();
                                mseven3.pause();
                                twentyseven=false;
                            }else if (twentyeight){
                                mone.start();
                                meight3.pause();
                                twentyeight=false;
                            }else if (twentynine){
                                mone.start();
                                mnine3.pause();
                                twentynine=false;
                            }else if (thirty){
                                mone.start();
                                mten3.pause();
                                thirty=false;
                            }else if (thirtyone){
                                mone4.pause();
                                thirtyone=false;
                            }else if (thirtytwo){
                                mtwo4.pause();
                                mone.start();
                                thirtytwo=false;
                            }else if (thirtythree){
                                mthree4.pause();
                                mone.start();
                                thirtythree=false;
                            }else
                            mone.start();
                            break;
                        case 1:
                            prepre.setVisibility(View.VISIBLE);
                            two=true;
                            if (one){
                                mtwo.start();
                                mone.pause();
                                one=false;
                            }else if (three){
                                mtwo.start();
                                mthree.pause();
                                three=false;
                            }else if (four){
                                mtwo.start();
                                mfour.pause();
                                four=false;
                            }else if (five){
                                mtwo.start();
                                mfive.pause();
                                five=false;
                            }else if (six){
                                mtwo.start();
                                msix.pause();
                                six=false;
                            }else if (seven){
                                mtwo.start();
                                mseven.pause();
                                seven=false;
                            }else if (eight){
                                mtwo.start();
                                meight.pause();
                                eight=false;
                            }else if (nine){
                                mtwo.start();
                                mnine.pause();
                                nine=false;
                            }else if (ten){
                                mtwo.start();
                                mten.pause();
                                ten=false;
                            }else if (eleven){
                                mtwo.start();
                                mone2.pause();
                                eleven=false;
                            }else if (tweleve){
                                mtwo.start();
                                mtwo2.pause();
                                tweleve=false;
                            }else if (thirthty){
                                mtwo.start();
                                mthree2.pause();
                                thirthty=false;
                            }else if (fourthy){
                                mtwo.start();
                                mfour2.pause();
                                fourthy=false;
                            }else if (fifthy){
                                mtwo.start();
                                mfive2.pause();
                                fifthy=false;
                            }else if (sixthy){
                                mtwo.start();
                                msix2.pause();
                                sixthy=false;
                            }else if (seventhy){
                                mtwo.start();
                                mseven2.pause();
                                seventhy=false;
                            }else if (eighty){
                                mtwo.start();
                                meight2.pause();
                                eighty=false;
                            }else if (ninthy){
                                mtwo.start();
                                mnine2.pause();
                                ninthy=false;
                            }else if (twenty){
                                mtwo.start();
                                mten2.pause();
                                twenty=false;
                            }else if (twentyone){
                                mone3.pause();
                                mtwo.start();
                                twentyone=false;
                            }else if (twentytwo){
                                mtwo3.pause();
                                mtwo.start();
                                twentytwo=false;
                            }else if (twentythree){
                                mthree3.pause();
                                mtwo.start();
                                twentythree=false;
                            }else if (twentyfour){
                                mfour3.pause();
                                mtwo.start();
                                twentyfour=false;
                            }else if (twentyfive){
                                mfive3.pause();
                                mtwo.start();
                                twentyfive=false;
                            }else if (twentysix){
                                msix3.pause();
                                mtwo.start();
                                twentysix=false;
                            }else if (twentyseven){
                                mseven3.pause();
                                mtwo.start();
                                twentyseven=false;
                            }else if (twentyeight){
                                meight3.pause();
                                mtwo.start();
                                twentyeight=false;
                            }else if (twentynine){
                                mnine3.pause();
                                mtwo.start();
                                twentynine=false;
                            }else if (thirty){
                                mten3.pause();
                                mtwo.start();
                                thirty=false;
                            }else if (thirtyone){
                                mone4.pause();
                                mtwo.start();
                                thirtyone=false;
                            }else if (thirtytwo){
                                mtwo4.pause();
                                mtwo.start();
                                thirtytwo=false;
                            }else if (thirtythree){
                                mthree4.pause();
                                mtwo.start();
                                thirtythree=false;
                            }else
                            mtwo.start();
                            break;
                        case 2:
                            three=true;
                            if (one){
                                mthree.start();
                                mone.pause();
                                one=false;
                            }else if (two){
                                mthree.start();
                                mtwo.pause();
                                two=false;
                            }else if (four){
                                mthree.start();
                                mfour.pause();
                                four=false;
                            }else if (five){
                                mthree.start();
                                mfive.pause();
                                five=false;
                            }else if (six){
                                mthree.start();
                                msix.pause();
                                six=false;
                            }else if (seven){
                                mthree.start();
                                mseven.pause();
                                seven=false;
                            }else if (eight){
                                mthree.start();
                                meight.pause();
                                eight=false;
                            }else if (nine){
                                mthree.start();
                                mnine.pause();
                                nine=false;
                            }else if (ten){
                                mthree.start();
                                mten.pause();
                                ten=false;
                            }else if (eleven){
                                mthree.start();
                                mone2.pause();
                                eleven=false;
                            }else if (tweleve){
                                mthree.start();
                                mtwo2.pause();
                                tweleve=false;
                            }else if (thirthty){
                                mthree.start();
                                mthree2.stop();
                                thirthty=false;
                            }else if (fourthy){
                                mthree.start();
                                mfour2.stop();
                                fourthy=false;
                            }else if (fifthy){
                                mthree.start();
                                mfive2.stop();
                                fifthy=false;
                            }else if (sixthy){
                                mthree.start();
                                msix2.stop();
                                sixthy=false;
                            }else if (seventhy){
                                mthree.start();
                                mseven2.stop();
                                seventhy=false;
                            }else if (eighty){
                                mthree.start();
                                meight2.stop();
                                eighty=false;
                            }else if (ninthy){
                                mthree.start();
                                mnine2.stop();
                                ninthy=false;
                            }else if (twenty){
                                mthree.start();
                                mten2.stop();
                                twenty=false;
                            }else if (twentyone){
                                mthree.start();
                                mone3.stop();
                                twentyone=false;
                            }else if (twentytwo){
                                mthree.start();
                                mtwo3.stop();
                                twentytwo=false;
                            }else if (twentythree){
                                mthree.start();
                                mthree3.stop();
                                twentythree=false;
                            }else if (twentyfour){
                                mthree.start();
                                mfour3.stop();
                                twentyfour=false;
                            }else if (twentyfive){
                                mthree.start();
                                mfive3.stop();
                                twentyfive=false;
                            }else if (twentysix){
                                mthree.start();
                                msix3.stop();
                                twentysix=false;
                            }else if (twentyseven){
                                mthree.start();
                                mseven3.stop();
                                twentyseven=false;
                            }else if (twentyeight){
                                mthree.start();
                                meight3.stop();
                                twentyeight=false;
                            }else if (twentynine){
                                mthree.start();
                                mnine3.stop();
                                twentynine=false;
                            }else if (thirty){
                                mthree.start();
                                mten3.stop();
                                thirty=false;
                            }else if (thirtyone){
                                mthree.start();
                                mone4.stop();
                                thirtyone=false;
                            }else if (thirtytwo){
                                mthree.start();
                                mtwo4.stop();
                                thirtytwo=false;
                            }else if (thirtythree){
                                mthree.start();
                                mthree4.stop();
                                thirtythree=false;
                            }else
                            mthree.start();
                            break;
                        case 3:
                            four=true;
                            if (one){
                                mfour.start();
                                mone.stop();
                                one=false;
                            }else if (two){
                                mfour.start();
                                mtwo.stop();
                                two=false;
                            }else if (three){
                                mthree.stop();
                                mfour.start();
                                three=false;
                            }else if (five){
                                mfour.start();
                                mfive.stop();
                                five=false;
                            }else if (six){
                                mfour.start();
                                msix.stop();
                                six=false;
                            }else if (seven){
                                mfour.start();
                                mseven.stop();
                                seven=false;
                            }else if (eight){
                                mfour.start();
                                meight.stop();
                                eight=false;
                            }else if (nine){
                                mfour.start();
                                mnine.stop();
                                nine=false;
                            }else if (ten){
                                mfour.start();
                                mten.stop();
                                ten=false;
                            }else if (eleven){
                                mfour.start();
                                mone2.stop();
                                eleven=false;
                            }else if (tweleve){
                                mfour.start();
                                mtwo2.stop();
                                tweleve=false;
                            }else if (thirthty){
                                mfour.start();
                                mthree2.stop();
                                thirthty=false;
                            }else if (fourthy){
                                mfour.start();
                                mfour2.stop();
                                fourthy=false;
                            }else if (fifthy){
                                mfour.start();
                                mfive2.stop();
                                fifthy=false;
                            }else if (sixthy){
                                mfour.start();
                                msix2.stop();
                                sixthy=false;
                            }else if (seventhy){
                                mfour.start();
                                mseven2.stop();
                                seventhy=false;
                            }else if (eighty){
                                mfour.start();
                                meight2.stop();
                                eighty=false;
                            }else if (ninthy){
                                mnine2.stop();
                                mfour.start();
                                ninthy=false;
                            }else if (twenty){
                                mfour.start();
                                mten2.stop();
                                twenty=false;
                            }else if (twentyone){
                                mfour.start();
                                mone3.stop();
                                twentyone=false;
                            }else if (twentytwo){
                                mfour.start();
                                mtwo3.stop();
                                twentytwo=false;
                            }else if (twentythree){
                                mfour.start();
                                mthree3.stop();
                                twentythree=false;
                            }else if (twentyfour){
                                mfour3.stop();
                                mfour.start();
                                twentyfour=false;
                            }else if (twentyfive){
                                mfive3.stop();
                                mfour.start();
                                twentyfive=false;
                            }else if (twentysix){
                                msix3.stop();
                                mfour.start();
                                twentysix=false;
                            }else if (twentyseven){
                                mseven3.stop();
                                mfour.start();
                                twentyseven=false;
                            }else if (twentyeight){
                                meight3.stop();
                                mfour.start();
                                twentyeight=false;
                            }else if (twentynine){
                                mnine3.stop();
                                mfour.start();
                                twentynine=false;
                            }else if (thirty){
                                mten3.stop();
                                mfour.start();
                                thirty=false;
                            }else if (thirtyone){
                                mone4.stop();
                                mfour.start();
                                thirtyone=false;
                            }else if (thirtytwo){
                                mtwo4.stop();
                                mfour.start();
                                thirtytwo=false;
                            }else if (thirtythree){
                                mthree4.stop();
                                mfour.start();
                                thirtythree=false;
                            }else
                               mfour.start();
                            break;
                        case 4:
                            five=true;
                            if (one){
                                mone.stop();
                                one=false;
                            }else if (two){
                                mtwo.stop();
                                two=false;
                            }else if (four){
                                mfour.stop();
                                four=false;
                            }else if (three){
                                mthree.stop();
                                three=false;
                            }else if (six){
                                msix.stop();
                                six=false;
                            }else if (seven){
                                mseven.stop();
                                seven=false;
                            }else if (eight){
                                meight.stop();
                                eight=false;
                            }else if (nine){
                                mnine.stop();
                                nine=false;
                            }else if (ten){
                                mten.stop();
                                ten=false;
                            }else if (eleven){
                                mone2.stop();
                                eleven=false;
                            }else if (tweleve){
                                mtwo2.stop();
                                tweleve=false;
                            }else if (thirthty){
                                mthree2.stop();
                                thirthty=false;
                            }else if (fourthy){
                                mfour2.stop();
                                fourthy=false;
                            }else if (fifthy){
                                mfive2.stop();
                                fifthy=false;
                            }else if (sixthy){
                                msix2.stop();
                                sixthy=false;
                            }else if (seventhy){
                                mseven2.stop();
                                seventhy=false;
                            }else if (eighty){
                                meight2.stop();
                                eighty=false;
                            }else if (ninthy){
                                mnine2.stop();
                                ninthy=false;
                            }else if (twenty){
                                mten2.stop();
                                twenty=false;
                            }else if (twentyone){
                                mone3.stop();
                                twentyone=false;
                            }else if (twentytwo){
                                mtwo3.stop();
                                twentytwo=false;
                            }else if (twentythree){
                                mthree3.stop();
                                twentythree=false;
                            }else if (twentyfour){
                                mfour3.stop();
                                twentyfour=false;
                            }else if (twentyfive){
                                mfive3.stop();
                                twentyfive=false;
                            }else if (twentysix){
                                msix3.stop();
                                twentysix=false;
                            }else if (twentyseven){
                                mseven3.stop();
                                twentyseven=false;
                            }else if (twentyeight){
                                meight3.stop();
                                twentyeight=false;
                            }else if (twentynine){
                                mnine3.stop();
                                twentynine=false;
                            }else if (thirty){
                                mten3.stop();
                                thirty=false;
                            }else if (thirtyone){
                                mone4.stop();
                                thirtyone=false;
                            }else if (thirtytwo){
                                mtwo4.stop();
                                thirtytwo=false;
                            }else if (thirtythree){
                                mthree4.stop();
                                thirtythree=false;
                            }
                            mfive.start();
                            break;
                        case 5:
                            six=true;
                            if (one){
                                mone.stop();
                                one=false;
                            }else if (two){
                                mtwo.stop();
                                two=false;
                            }else if (four){
                                mfour.stop();
                                four=false;
                            }else if (five){
                                mfive.stop();
                                five=false;
                            }else if (three){
                                mthree.stop();
                                three=false;
                            }else if (seven){
                                mseven.stop();
                                seven=false;
                            }else if (eight){
                                meight.stop();
                                eight=false;
                            }else if (nine){
                                mnine.stop();
                                nine=false;
                            }else if (ten){
                                mten.stop();
                                ten=false;
                            }else if (eleven){
                                mone2.stop();
                                eleven=false;
                            }else if (tweleve){
                                mtwo2.stop();
                                tweleve=false;
                            }else if (thirthty){
                                mthree2.stop();
                                thirthty=false;
                            }else if (fourthy){
                                mfour2.stop();
                                fourthy=false;
                            }else if (fifthy){
                                mfive2.stop();
                                fifthy=false;
                            }else if (sixthy){
                                msix2.stop();
                                sixthy=false;
                            }else if (seventhy){
                                mseven2.stop();
                                seventhy=false;
                            }else if (eighty){
                                meight2.stop();
                                eighty=false;
                            }else if (ninthy){
                                mnine2.stop();
                                ninthy=false;
                            }else if (twenty){
                                mten2.stop();
                                twenty=false;
                            }else if (twentyone){
                                mone3.stop();
                                twentyone=false;
                            }else if (twentytwo){
                                mtwo3.stop();
                                twentytwo=false;
                            }else if (twentythree){
                                mthree3.stop();
                                twentythree=false;
                            }else if (twentyfour){
                                mfour3.stop();
                                twentyfour=false;
                            }else if (twentyfive){
                                mfive3.stop();
                                twentyfive=false;
                            }else if (twentysix){
                                msix3.stop();
                                twentysix=false;
                            }else if (twentyseven){
                                mseven3.stop();
                                twentyseven=false;
                            }else if (twentyeight){
                                meight3.stop();
                                twentyeight=false;
                            }else if (twentynine){
                                mnine3.stop();
                                twentynine=false;
                            }else if (thirty){
                                mten3.stop();
                                thirty=false;
                            }else if (thirtyone){
                                mone4.stop();
                                thirtyone=false;
                            }else if (thirtytwo){
                                mtwo4.stop();
                                thirtytwo=false;
                            }else if (thirtythree){
                                mthree4.stop();
                                thirtythree=false;
                            }
                            msix.start();
                            break;
                        case 6:
                            seven=true;
                            if (one){
                                mone.stop();
                                one=false;
                            }else if (two){
                                mtwo.stop();
                                two=false;
                            }else if (four){
                                mfour.stop();
                                four=false;
                            }else if (five){
                                mfive.stop();
                                five=false;
                            }else if (six){
                                msix.stop();
                                six=false;
                            }else if (three){
                                mthree.stop();
                                three=false;
                            }else if (eight){
                                meight.stop();
                                eight=false;
                            }else if (nine){
                                mnine.stop();
                                nine=false;
                            }else if (ten){
                                mten.stop();
                                ten=false;
                            }else if (eleven){
                                mone2.stop();
                                eleven=false;
                            }else if (tweleve){
                                mtwo2.stop();
                                tweleve=false;
                            }else if (thirthty){
                                mthree2.stop();
                                thirthty=false;
                            }else if (fourthy){
                                mfour2.stop();
                                fourthy=false;
                            }else if (fifthy){
                                mfive2.stop();
                                fifthy=false;
                            }else if (sixthy){
                                msix2.stop();
                                sixthy=false;
                            }else if (seventhy){
                                mseven2.stop();
                                seventhy=false;
                            }else if (eighty){
                                meight2.stop();
                                eighty=false;
                            }else if (ninthy){
                                mnine2.stop();
                                ninthy=false;
                            }else if (twenty){
                                mten2.stop();
                                twenty=false;
                            }else if (twentyone){
                                mone3.stop();
                                twentyone=false;
                            }else if (twentytwo){
                                mtwo3.stop();
                                twentytwo=false;
                            }else if (twentythree){
                                mthree3.stop();
                                twentythree=false;
                            }else if (twentyfour){
                                mfour3.stop();
                                twentyfour=false;
                            }else if (twentyfive){
                                mfive3.stop();
                                twentyfive=false;
                            }else if (twentysix){
                                msix3.stop();
                                twentysix=false;
                            }else if (twentyseven){
                                mseven3.stop();
                                twentyseven=false;
                            }else if (twentyeight){
                                meight3.stop();
                                twentyeight=false;
                            }else if (twentynine){
                                mnine3.stop();
                                twentynine=false;
                            }else if (thirty){
                                mten3.stop();
                                thirty=false;
                            }else if (thirtyone){
                                mone4.stop();
                                thirtyone=false;
                            }else if (thirtytwo){
                                mtwo4.stop();
                                thirtytwo=false;
                            }else if (thirtythree){
                                mthree4.stop();
                                thirtythree=false;
                            }
                            mseven.start();
                            break;
                        case 7:
                            eight=true;
                            if (one){
                                mone.stop();
                                one=false;
                            }else if (two){
                                mtwo.stop();
                                two=false;
                            }else if (four){
                                mfour.stop();
                                four=false;
                            }else if (five){
                                mfive.stop();
                                five=false;
                            }else if (six){
                                msix.stop();
                                six=false;
                            }else if (seven){
                                mseven.stop();
                                seven=false;
                            }else if (three){
                                mthree.stop();
                                three=false;
                            }else if (nine){
                                mnine.stop();
                                nine=false;
                            }else if (ten){
                                mten.stop();
                                ten=false;
                            }else if (eleven){
                                mone2.stop();
                                eleven=false;
                            }else if (tweleve){
                                mtwo2.stop();
                                tweleve=false;
                            }else if (thirthty){
                                mthree2.stop();
                                thirthty=false;
                            }else if (fourthy){
                                mfour2.stop();
                                fourthy=false;
                            }else if (fifthy){
                                mfive2.stop();
                                fifthy=false;
                            }else if (sixthy){
                                msix2.stop();
                                sixthy=false;
                            }else if (seventhy){
                                mseven2.stop();
                                seventhy=false;
                            }else if (eighty){
                                meight2.stop();
                                eighty=false;
                            }else if (ninthy){
                                mnine2.stop();
                                ninthy=false;
                            }else if (twenty){
                                mten2.stop();
                                twenty=false;
                            }else if (twentyone){
                                mone3.stop();
                                twentyone=false;
                            }else if (twentytwo){
                                mtwo3.stop();
                                twentytwo=false;
                            }else if (twentythree){
                                mthree3.stop();
                                twentythree=false;
                            }else if (twentyfour){
                                mfour3.stop();
                                twentyfour=false;
                            }else if (twentyfive){
                                mfive3.stop();
                                twentyfive=false;
                            }else if (twentysix){
                                msix3.stop();
                                twentysix=false;
                            }else if (twentyseven){
                                mseven3.stop();
                                twentyseven=false;
                            }else if (twentyeight){
                                meight3.stop();
                                twentyeight=false;
                            }else if (twentynine){
                                mnine3.stop();
                                twentynine=false;
                            }else if (thirty){
                                mten3.stop();
                                thirty=false;
                            }else if (thirtyone){
                                mone4.stop();
                                thirtyone=false;
                            }else if (thirtytwo){
                                mtwo4.stop();
                                thirtytwo=false;
                            }else if (thirtythree){
                                mthree4.stop();
                                thirtythree=false;
                            }
                            meight.start();
                            break;
                        case 8:
                            nine=true;
                            if (one){
                                mone.stop();
                                one=false;
                            }else if (two){
                                mtwo.stop();
                                two=false;
                            }else if (four){
                                mfour.stop();
                                four=false;
                            }else if (five){
                                mfive.stop();
                                five=false;
                            }else if (six){
                                msix.stop();
                                six=false;
                            }else if (seven){
                                mseven.stop();
                                seven=false;
                            }else if (eight){
                                meight.stop();
                                eight=false;
                            }else if (three){
                                mthree.stop();
                                three=false;
                            }else if (ten){
                                mten.stop();
                                ten=false;
                            }else if (eleven){
                                mone2.stop();
                                eleven=false;
                            }else if (tweleve){
                                mtwo2.stop();
                                tweleve=false;
                            }else if (thirthty){
                                mthree2.stop();
                                thirthty=false;
                            }else if (fourthy){
                                mfour2.stop();
                                fourthy=false;
                            }else if (fifthy){
                                mfive2.stop();
                                fifthy=false;
                            }else if (sixthy){
                                msix2.stop();
                                sixthy=false;
                            }else if (seventhy){
                                mseven2.stop();
                                seventhy=false;
                            }else if (eighty){
                                meight2.stop();
                                eighty=false;
                            }else if (ninthy){
                                mnine2.stop();
                                ninthy=false;
                            }else if (twenty){
                                mten2.stop();
                                twenty=false;
                            }else if (twentyone){
                                mone3.stop();
                                twentyone=false;
                            }else if (twentytwo){
                                mtwo3.stop();
                                twentytwo=false;
                            }else if (twentythree){
                                mthree3.stop();
                                twentythree=false;
                            }else if (twentyfour){
                                mfour3.stop();
                                twentyfour=false;
                            }else if (twentyfive){
                                mfive3.stop();
                                twentyfive=false;
                            }else if (twentysix){
                                msix3.stop();
                                twentysix=false;
                            }else if (twentyseven){
                                mseven3.stop();
                                twentyseven=false;
                            }else if (twentyeight){
                                meight3.stop();
                                twentyeight=false;
                            }else if (twentynine){
                                mnine3.stop();
                                twentynine=false;
                            }else if (thirty){
                                mten3.stop();
                                thirty=false;
                            }else if (thirtyone){
                                mone4.stop();
                                thirtyone=false;
                            }else if (thirtytwo){
                                mtwo4.stop();
                                thirtytwo=false;
                            }else if (thirtythree){
                                mthree4.stop();
                                thirtythree=false;
                            }
                            mnine.start();
                            break;
                        case 9:
                            ten=true;
                            if (one){
                                mone.stop();
                                one=false;
                            }else if (two){
                                mtwo.stop();
                                two=false;
                            }else if (four){
                                mfour.stop();
                                four=false;
                            }else if (five){
                                mfive.stop();
                                five=false;
                            }else if (six){
                                msix.stop();
                                six=false;
                            }else if (seven){
                                mseven.stop();
                                seven=false;
                            }else if (eight){
                                meight.stop();
                                eight=false;
                            }else if (nine){
                                mnine.stop();
                                nine=false;
                            }else if (three){
                                mthree.stop();
                                three=false;
                            }else if (eleven){
                                mone2.stop();
                                eleven=false;
                            }else if (tweleve){
                                mtwo2.stop();
                                tweleve=false;
                            }else if (thirthty){
                                mthree2.stop();
                                thirthty=false;
                            }else if (fourthy){
                                mfour2.stop();
                                fourthy=false;
                            }else if (fifthy){
                                mfive2.stop();
                                fifthy=false;
                            }else if (sixthy){
                                msix2.stop();
                                sixthy=false;
                            }else if (seventhy){
                                mseven2.stop();
                                seventhy=false;
                            }else if (eighty){
                                meight2.stop();
                                eighty=false;
                            }else if (ninthy){
                                mnine2.stop();
                                ninthy=false;
                            }else if (twenty){
                                mten2.stop();
                                twenty=false;
                            }else if (twentyone){
                                mone3.stop();
                                twentyone=false;
                            }else if (twentytwo){
                                mtwo3.stop();
                                twentytwo=false;
                            }else if (twentythree){
                                mthree3.stop();
                                twentythree=false;
                            }else if (twentyfour){
                                mfour3.stop();
                                twentyfour=false;
                            }else if (twentyfive){
                                mfive3.stop();
                                twentyfive=false;
                            }else if (twentysix){
                                msix3.stop();
                                twentysix=false;
                            }else if (twentyseven){
                                mseven3.stop();
                                twentyseven=false;
                            }else if (twentyeight){
                                meight3.stop();
                                twentyeight=false;
                            }else if (twentynine){
                                mnine3.stop();
                                twentynine=false;
                            }else if (thirty){
                                mten3.stop();
                                thirty=false;
                            }else if (thirtyone){
                                mone4.stop();
                                thirtyone=false;
                            }else if (thirtytwo){
                                mtwo4.stop();
                                thirtytwo=false;
                            }else if (thirtythree){
                                mthree4.stop();
                                thirtythree=false;
                            }
                            mten.start();
                            break;
                        case 10:
                            eleven=true;
                            if (one){
                                mone.stop();
                                one=false;
                            }else if (two){
                                mtwo.stop();
                                two=false;
                            }else if (four){
                                mfour.stop();
                                four=false;
                            }else if (five){
                                mfive.stop();
                                five=false;
                            }else if (six){
                                msix.stop();
                                six=false;
                            }else if (seven){
                                mseven.stop();
                                seven=false;
                            }else if (eight){
                                meight.stop();
                                eight=false;
                            }else if (nine){
                                mnine.stop();
                                nine=false;
                            }else if (ten){
                                mten.stop();
                                ten=false;
                            }else if (three){
                                mthree.stop();
                                three=false;
                            }else if (tweleve){
                                mtwo2.stop();
                                tweleve=false;
                            }else if (thirthty){
                                mthree2.stop();
                                thirthty=false;
                            }else if (fourthy){
                                mfour2.stop();
                                fourthy=false;
                            }else if (fifthy){
                                mfive2.stop();
                                fifthy=false;
                            }else if (sixthy){
                                msix2.stop();
                                sixthy=false;
                            }else if (seventhy){
                                mseven2.stop();
                                seventhy=false;
                            }else if (eighty){
                                meight2.stop();
                                eighty=false;
                            }else if (ninthy){
                                mnine2.stop();
                                ninthy=false;
                            }else if (twenty){
                                mten2.stop();
                                twenty=false;
                            }else if (twentyone){
                                mone3.stop();
                                twentyone=false;
                            }else if (twentytwo){
                                mtwo3.stop();
                                twentytwo=false;
                            }else if (twentythree){
                                mthree3.stop();
                                twentythree=false;
                            }else if (twentyfour){
                                mfour3.stop();
                                twentyfour=false;
                            }else if (twentyfive){
                                mfive3.stop();
                                twentyfive=false;
                            }else if (twentysix){
                                msix3.stop();
                                twentysix=false;
                            }else if (twentyseven){
                                mseven3.stop();
                                twentyseven=false;
                            }else if (twentyeight){
                                meight3.stop();
                                twentyeight=false;
                            }else if (twentynine){
                                mnine3.stop();
                                twentynine=false;
                            }else if (thirty){
                                mten3.stop();
                                thirty=false;
                            }else if (thirtyone){
                                mone4.stop();
                                thirtyone=false;
                            }else if (thirtytwo){
                                mtwo4.stop();
                                thirtytwo=false;
                            }else if (thirtythree){
                                mthree4.stop();
                                thirtythree=false;
                            }
                            mone2.start();
                            break;
                        case 11:
                            tweleve=true;
                            if (one){
                                mone.stop();
                                one=false;
                            }else if (two){
                                mtwo.stop();
                                two=false;
                            }else if (four){
                                mfour.stop();
                                four=false;
                            }else if (five){
                                mfive.stop();
                                five=false;
                            }else if (six){
                                msix.stop();
                                six=false;
                            }else if (seven){
                                mseven.stop();
                                seven=false;
                            }else if (eight){
                                meight.stop();
                                eight=false;
                            }else if (nine){
                                mnine.stop();
                                nine=false;
                            }else if (ten){
                                mten.stop();
                                ten=false;
                            }else if (eleven){
                                mone2.stop();
                                eleven=false;
                            }else if (three){
                                mthree.stop();
                                three=false;
                            }else if (thirthty){
                                mthree2.stop();
                                thirthty=false;
                            }else if (fourthy){
                                mfour2.stop();
                                fourthy=false;
                            }else if (fifthy){
                                mfive2.stop();
                                fifthy=false;
                            }else if (sixthy){
                                msix2.stop();
                                sixthy=false;
                            }else if (seventhy){
                                mseven2.stop();
                                seventhy=false;
                            }else if (eighty){
                                meight2.stop();
                                eighty=false;
                            }else if (ninthy){
                                mnine2.stop();
                                ninthy=false;
                            }else if (twenty){
                                mten2.stop();
                                twenty=false;
                            }else if (twentyone){
                                mone3.stop();
                                twentyone=false;
                            }else if (twentytwo){
                                mtwo3.stop();
                                twentytwo=false;
                            }else if (twentythree){
                                mthree3.stop();
                                twentythree=false;
                            }else if (twentyfour){
                                mfour3.stop();
                                twentyfour=false;
                            }else if (twentyfive){
                                mfive3.stop();
                                twentyfive=false;
                            }else if (twentysix){
                                msix3.stop();
                                twentysix=false;
                            }else if (twentyseven){
                                mseven3.stop();
                                twentyseven=false;
                            }else if (twentyeight){
                                meight3.stop();
                                twentyeight=false;
                            }else if (twentynine){
                                mnine3.stop();
                                twentynine=false;
                            }else if (thirty){
                                mten3.stop();
                                thirty=false;
                            }else if (thirtyone){
                                mone4.stop();
                                thirtyone=false;
                            }else if (thirtytwo){
                                mtwo4.stop();
                                thirtytwo=false;
                            }else if (thirtythree){
                                mthree4.stop();
                                thirtythree=false;
                            }
                            mtwo2.start();
                            break;
                        case 12:
                            thirthty=true;
                            if (one){
                                mone.stop();
                                one=false;
                            }else if (two){
                                mtwo.stop();
                                two=false;
                            }else if (four){
                                mfour.stop();
                                four=false;
                            }else if (five){
                                mfive.stop();
                                five=false;
                            }else if (six){
                                msix.stop();
                                six=false;
                            }else if (seven){
                                mseven.stop();
                                seven=false;
                            }else if (eight){
                                meight.stop();
                                eight=false;
                            }else if (nine){
                                mnine.stop();
                                nine=false;
                            }else if (ten){
                                mten.stop();
                                ten=false;
                            }else if (eleven){
                                mone2.stop();
                                eleven=false;
                            }else if (tweleve){
                                mtwo2.stop();
                                tweleve=false;
                            }else if (three){
                                mthree.stop();
                                three=false;
                            }else if (fourthy){
                                mfour2.stop();
                                fourthy=false;
                            }else if (fifthy){
                                mfive2.stop();
                                fifthy=false;
                            }else if (sixthy){
                                msix2.stop();
                                sixthy=false;
                            }else if (seventhy){
                                mseven2.stop();
                                seventhy=false;
                            }else if (eighty){
                                meight2.stop();
                                eighty=false;
                            }else if (ninthy){
                                mnine2.stop();
                                ninthy=false;
                            }else if (twenty){
                                mten2.stop();
                                twenty=false;
                            }else if (twentyone){
                                mone3.stop();
                                twentyone=false;
                            }else if (twentytwo){
                                mtwo3.stop();
                                twentytwo=false;
                            }else if (twentythree){
                                mthree3.stop();
                                twentythree=false;
                            }else if (twentyfour){
                                mfour3.stop();
                                twentyfour=false;
                            }else if (twentyfive){
                                mfive3.stop();
                                twentyfive=false;
                            }else if (twentysix){
                                msix3.stop();
                                twentysix=false;
                            }else if (twentyseven){
                                mseven3.stop();
                                twentyseven=false;
                            }else if (twentyeight){
                                meight3.stop();
                                twentyeight=false;
                            }else if (twentynine){
                                mnine3.stop();
                                twentynine=false;
                            }else if (thirty){
                                mten3.stop();
                                thirty=false;
                            }else if (thirtyone){
                                mone4.stop();
                                thirtyone=false;
                            }else if (thirtytwo){
                                mtwo4.stop();
                                thirtytwo=false;
                            }else if (thirtythree){
                                mthree4.stop();
                                thirtythree=false;
                            }
                            mthree2.start();
                            break;
                        case 13:
                            fourthy=true;
                            if (one){
                                mone.stop();
                                one=false;
                            }else if (two){
                                mtwo.stop();
                                two=false;
                            }else if (four){
                                mfour.stop();
                                four=false;
                            }else if (five){
                                mfive.stop();
                                five=false;
                            }else if (six){
                                msix.stop();
                                six=false;
                            }else if (seven){
                                mseven.stop();
                                seven=false;
                            }else if (eight){
                                meight.stop();
                                eight=false;
                            }else if (nine){
                                mnine.stop();
                                nine=false;
                            }else if (ten){
                                mten.stop();
                                ten=false;
                            }else if (eleven){
                                mone2.stop();
                                eleven=false;
                            }else if (tweleve){
                                mtwo2.stop();
                                tweleve=false;
                            }else if (thirthty){
                                mthree2.stop();
                                thirthty=false;
                            }else if (three){
                                mthree.stop();
                                three=false;
                            }else if (fifthy){
                                mfive2.stop();
                                fifthy=false;
                            }else if (sixthy){
                                msix2.stop();
                                sixthy=false;
                            }else if (seventhy){
                                mseven2.stop();
                                seventhy=false;
                            }else if (eighty){
                                meight2.stop();
                                eighty=false;
                            }else if (ninthy){
                                mnine2.stop();
                                ninthy=false;
                            }else if (twenty){
                                mten2.stop();
                                twenty=false;
                            }else if (twentyone){
                                mone3.stop();
                                twentyone=false;
                            }else if (twentytwo){
                                mtwo3.stop();
                                twentytwo=false;
                            }else if (twentythree){
                                mthree3.stop();
                                twentythree=false;
                            }else if (twentyfour){
                                mfour3.stop();
                                twentyfour=false;
                            }else if (twentyfive){
                                mfive3.stop();
                                twentyfive=false;
                            }else if (twentysix){
                                msix3.stop();
                                twentysix=false;
                            }else if (twentyseven){
                                mseven3.stop();
                                twentyseven=false;
                            }else if (twentyeight){
                                meight3.stop();
                                twentyeight=false;
                            }else if (twentynine){
                                mnine3.stop();
                                twentynine=false;
                            }else if (thirty){
                                mten3.stop();
                                thirty=false;
                            }else if (thirtyone){
                                mone4.stop();
                                thirtyone=false;
                            }else if (thirtytwo){
                                mtwo4.stop();
                                thirtytwo=false;
                            }else if (thirtythree){
                                mthree4.stop();
                                thirtythree=false;
                            }
                            mfour2.start();
                            break;
                        case 14:
                            fifthy=true;
                            if (one){
                                mone.stop();
                                one=false;
                            }else if (two){
                                mtwo.stop();
                                two=false;
                            }else if (four){
                                mfour.stop();
                                four=false;
                            }else if (five){
                                mfive.stop();
                                five=false;
                            }else if (six){
                                msix.stop();
                                six=false;
                            }else if (seven){
                                mseven.stop();
                                seven=false;
                            }else if (eight){
                                meight.stop();
                                eight=false;
                            }else if (nine){
                                mnine.stop();
                                nine=false;
                            }else if (ten){
                                mten.stop();
                                ten=false;
                            }else if (eleven){
                                mone2.stop();
                                eleven=false;
                            }else if (tweleve){
                                mtwo2.stop();
                                tweleve=false;
                            }else if (thirthty){
                                mthree2.stop();
                                thirthty=false;
                            }else if (fourthy){
                                mfour2.stop();
                                fourthy=false;
                            }else if (three){
                                mthree.stop();
                                three=false;
                            }else if (sixthy){
                                msix2.stop();
                                sixthy=false;
                            }else if (seventhy){
                                mseven2.stop();
                                seventhy=false;
                            }else if (eighty){
                                meight2.stop();
                                eighty=false;
                            }else if (ninthy){
                                mnine2.stop();
                                ninthy=false;
                            }else if (twenty){
                                mten2.stop();
                                twenty=false;
                            }else if (twentyone){
                                mone3.stop();
                                twentyone=false;
                            }else if (twentytwo){
                                mtwo3.stop();
                                twentytwo=false;
                            }else if (twentythree){
                                mthree3.stop();
                                twentythree=false;
                            }else if (twentyfour){
                                mfour3.stop();
                                twentyfour=false;
                            }else if (twentyfive){
                                mfive3.stop();
                                twentyfive=false;
                            }else if (twentysix){
                                msix3.stop();
                                twentysix=false;
                            }else if (twentyseven){
                                mseven3.stop();
                                twentyseven=false;
                            }else if (twentyeight){
                                meight3.stop();
                                twentyeight=false;
                            }else if (twentynine){
                                mnine3.stop();
                                twentynine=false;
                            }else if (thirty){
                                mten3.stop();
                                thirty=false;
                            }else if (thirtyone){
                                mone4.stop();
                                thirtyone=false;
                            }else if (thirtytwo){
                                mtwo4.stop();
                                thirtytwo=false;
                            }else if (thirtythree){
                                mthree4.stop();
                                thirtythree=false;
                            }
                            mfive2.start();
                            break;
                        case 15:
                            sixthy=true;
                            if (one){
                                mone.stop();
                                one=false;
                            }else if (two){
                                mtwo.stop();
                                two=false;
                            }else if (four){
                                mfour.stop();
                                four=false;
                            }else if (five){
                                mfive.stop();
                                five=false;
                            }else if (six){
                                msix.stop();
                                six=false;
                            }else if (seven){
                                mseven.stop();
                                seven=false;
                            }else if (eight){
                                meight.stop();
                                eight=false;
                            }else if (nine){
                                mnine.stop();
                                nine=false;
                            }else if (ten){
                                mten.stop();
                                ten=false;
                            }else if (eleven){
                                mone2.stop();
                                eleven=false;
                            }else if (tweleve){
                                mtwo2.stop();
                                tweleve=false;
                            }else if (thirthty){
                                mthree2.stop();
                                thirthty=false;
                            }else if (fourthy){
                                mfour2.stop();
                                fourthy=false;
                            }else if (fifthy){
                                mfive2.stop();
                                fifthy=false;
                            }else if (three){
                                mthree.stop();
                                three=false;
                            }else if (seventhy){
                                mseven2.stop();
                                seventhy=false;
                            }else if (eighty){
                                meight2.stop();
                                eighty=false;
                            }else if (ninthy){
                                mnine2.stop();
                                ninthy=false;
                            }else if (twenty){
                                mten2.stop();
                                twenty=false;
                            }else if (twentyone){
                                mone3.stop();
                                twentyone=false;
                            }else if (twentytwo){
                                mtwo3.stop();
                                twentytwo=false;
                            }else if (twentythree){
                                mthree3.stop();
                                twentythree=false;
                            }else if (twentyfour){
                                mfour3.stop();
                                twentyfour=false;
                            }else if (twentyfive){
                                mfive3.stop();
                                twentyfive=false;
                            }else if (twentysix){
                                msix3.stop();
                                twentysix=false;
                            }else if (twentyseven){
                                mseven3.stop();
                                twentyseven=false;
                            }else if (twentyeight){
                                meight3.stop();
                                twentyeight=false;
                            }else if (twentynine){
                                mnine3.stop();
                                twentynine=false;
                            }else if (thirty){
                                mten3.stop();
                                thirty=false;
                            }else if (thirtyone){
                                mone4.stop();
                                thirtyone=false;
                            }else if (thirtytwo){
                                mtwo4.stop();
                                thirtytwo=false;
                            }else if (thirtythree){
                                mthree4.stop();
                                thirtythree=false;
                            }
                            msix2.start();
                            break;
                        case 16:
                            seventhy=true;
                            if (one){
                                mone.stop();
                                one=false;
                            }else if (two){
                                mtwo.stop();
                                two=false;
                            }else if (four){
                                mfour.stop();
                                four=false;
                            }else if (five){
                                mfive.stop();
                                five=false;
                            }else if (six){
                                msix.stop();
                                six=false;
                            }else if (seven){
                                mseven.stop();
                                seven=false;
                            }else if (eight){
                                meight.stop();
                                eight=false;
                            }else if (nine){
                                mnine.stop();
                                nine=false;
                            }else if (ten){
                                mten.stop();
                                ten=false;
                            }else if (eleven){
                                mone2.stop();
                                eleven=false;
                            }else if (tweleve){
                                mtwo2.stop();
                                tweleve=false;
                            }else if (thirthty){
                                mthree2.stop();
                                thirthty=false;
                            }else if (fourthy){
                                mfour2.stop();
                                fourthy=false;
                            }else if (fifthy){
                                mfive2.stop();
                                fifthy=false;
                            }else if (sixthy){
                                msix2.stop();
                                sixthy=false;
                            }else if (three){
                                mthree.stop();
                                three=false;
                            }else if (eighty){
                                meight2.stop();
                                eighty=false;
                            }else if (ninthy){
                                mnine2.stop();
                                ninthy=false;
                            }else if (twenty){
                                mten2.stop();
                                twenty=false;
                            }else if (twentyone){
                                mone3.stop();
                                twentyone=false;
                            }else if (twentytwo){
                                mtwo3.stop();
                                twentytwo=false;
                            }else if (twentythree){
                                mthree3.stop();
                                twentythree=false;
                            }else if (twentyfour){
                                mfour3.stop();
                                twentyfour=false;
                            }else if (twentyfive){
                                mfive3.stop();
                                twentyfive=false;
                            }else if (twentysix){
                                msix3.stop();
                                twentysix=false;
                            }else if (twentyseven){
                                mseven3.stop();
                                twentyseven=false;
                            }else if (twentyeight){
                                meight3.stop();
                                twentyeight=false;
                            }else if (twentynine){
                                mnine3.stop();
                                twentynine=false;
                            }else if (thirty){
                                mten3.stop();
                                thirty=false;
                            }else if (thirtyone){
                                mone4.stop();
                                thirtyone=false;
                            }else if (thirtytwo){
                                mtwo4.stop();
                                thirtytwo=false;
                            }else if (thirtythree){
                                mthree4.stop();
                                thirtythree=false;
                            }
                            mseven2.start();
                            break;
                        case 17:
                            eighty=true;
                            if (one){
                                mone.stop();
                                one=false;
                            }else if (two){
                                mtwo.stop();
                                two=false;
                            }else if (four){
                                mfour.stop();
                                four=false;
                            }else if (five){
                                mfive.stop();
                                five=false;
                            }else if (six){
                                msix.stop();
                                six=false;
                            }else if (seven){
                                mseven.stop();
                                seven=false;
                            }else if (eight){
                                meight.stop();
                                eight=false;
                            }else if (nine){
                                mnine.stop();
                                nine=false;
                            }else if (ten){
                                mten.stop();
                                ten=false;
                            }else if (eleven){
                                mone2.stop();
                                eleven=false;
                            }else if (tweleve){
                                mtwo2.stop();
                                tweleve=false;
                            }else if (thirthty){
                                mthree2.stop();
                                thirthty=false;
                            }else if (fourthy){
                                mfour2.stop();
                                fourthy=false;
                            }else if (fifthy){
                                mfive2.stop();
                                fifthy=false;
                            }else if (sixthy){
                                msix2.stop();
                                sixthy=false;
                            }else if (seventhy){
                                mseven2.stop();
                                seventhy=false;
                            }else if (three){
                                mthree.stop();
                                three=false;
                            }else if (ninthy){
                                mnine2.stop();
                                ninthy=false;
                            }else if (twenty){
                                mten2.stop();
                                twenty=false;
                            }else if (twentyone){
                                mone3.stop();
                                twentyone=false;
                            }else if (twentytwo){
                                mtwo3.stop();
                                twentytwo=false;
                            }else if (twentythree){
                                mthree3.stop();
                                twentythree=false;
                            }else if (twentyfour){
                                mfour3.stop();
                                twentyfour=false;
                            }else if (twentyfive){
                                mfive3.stop();
                                twentyfive=false;
                            }else if (twentysix){
                                msix3.stop();
                                twentysix=false;
                            }else if (twentyseven){
                                mseven3.stop();
                                twentyseven=false;
                            }else if (twentyeight){
                                meight3.stop();
                                twentyeight=false;
                            }else if (twentynine){
                                mnine3.stop();
                                twentynine=false;
                            }else if (thirty){
                                mten3.stop();
                                thirty=false;
                            }else if (thirtyone){
                                mone4.stop();
                                thirtyone=false;
                            }else if (thirtytwo){
                                mtwo4.stop();
                                thirtytwo=false;
                            }else if (thirtythree){
                                mthree4.stop();
                                thirtythree=false;
                            }
                            meight2.start();
                            break;
                        case 18:
                            ninthy=true;
                            if (one){
                                mone.stop();
                                one=false;
                            }else if (two){
                                mtwo.stop();
                                two=false;
                            }else if (four){
                                mfour.stop();
                                four=false;
                            }else if (five){
                                mfive.stop();
                                five=false;
                            }else if (six){
                                msix.stop();
                                six=false;
                            }else if (seven){
                                mseven.stop();
                                seven=false;
                            }else if (eight){
                                meight.stop();
                                eight=false;
                            }else if (nine){
                                mnine.stop();
                                nine=false;
                            }else if (ten){
                                mten.stop();
                                ten=false;
                            }else if (eleven){
                                mone2.stop();
                                eleven=false;
                            }else if (tweleve){
                                mtwo2.stop();
                                tweleve=false;
                            }else if (thirthty){
                                mthree2.stop();
                                thirthty=false;
                            }else if (fourthy){
                                mfour2.stop();
                                fourthy=false;
                            }else if (fifthy){
                                mfive2.stop();
                                fifthy=false;
                            }else if (sixthy){
                                msix2.stop();
                                sixthy=false;
                            }else if (seventhy){
                                mseven2.stop();
                                seventhy=false;
                            }else if (eighty){
                                meight2.stop();
                                eighty=false;
                            }else if (three){
                                mthree.stop();
                                three=false;
                            }else if (twenty){
                                mten2.stop();
                                twenty=false;
                            }else if (twentyone){
                                mone3.stop();
                                twentyone=false;
                            }else if (twentytwo){
                                mtwo3.stop();
                                twentytwo=false;
                            }else if (twentythree){
                                mthree3.stop();
                                twentythree=false;
                            }else if (twentyfour){
                                mfour3.stop();
                                twentyfour=false;
                            }else if (twentyfive){
                                mfive3.stop();
                                twentyfive=false;
                            }else if (twentysix){
                                msix3.stop();
                                twentysix=false;
                            }else if (twentyseven){
                                mseven3.stop();
                                twentyseven=false;
                            }else if (twentyeight){
                                meight3.stop();
                                twentyeight=false;
                            }else if (twentynine){
                                mnine3.stop();
                                twentynine=false;
                            }else if (thirty){
                                mten3.stop();
                                thirty=false;
                            }else if (thirtyone){
                                mone4.stop();
                                thirtyone=false;
                            }else if (thirtytwo){
                                mtwo4.stop();
                                thirtytwo=false;
                            }else if (thirtythree){
                                mthree4.stop();
                                thirtythree=false;
                            }
                            mnine2.start();
                            break;
                        case 19:
                            twenty=true;
                            if (one){
                                mone.stop();
                                one=false;
                            }else if (two){
                                mtwo.stop();
                                two=false;
                            }else if (four){
                                mfour.stop();
                                four=false;
                            }else if (five){
                                mfive.stop();
                                five=false;
                            }else if (six){
                                msix.stop();
                                six=false;
                            }else if (seven){
                                mseven.stop();
                                seven=false;
                            }else if (eight){
                                meight.stop();
                                eight=false;
                            }else if (nine){
                                mnine.stop();
                                nine=false;
                            }else if (ten){
                                mten.stop();
                                ten=false;
                            }else if (eleven){
                                mone2.stop();
                                eleven=false;
                            }else if (tweleve){
                                mtwo2.stop();
                                tweleve=false;
                            }else if (thirthty){
                                mthree2.stop();
                                thirthty=false;
                            }else if (fourthy){
                                mfour2.stop();
                                fourthy=false;
                            }else if (fifthy){
                                mfive2.stop();
                                fifthy=false;
                            }else if (sixthy){
                                msix2.stop();
                                sixthy=false;
                            }else if (seventhy){
                                mseven2.stop();
                                seventhy=false;
                            }else if (eighty){
                                meight2.stop();
                                eighty=false;
                            }else if (ninthy){
                                mnine2.stop();
                                ninthy=false;
                            }else if (three){
                                mten2.stop();
                                three=false;
                            }else if (twentyone){
                                mone3.stop();
                                twentyone=false;
                            }else if (twentytwo){
                                mtwo3.stop();
                                twentytwo=false;
                            }else if (twentythree){
                                mthree3.stop();
                                twentythree=false;
                            }else if (twentyfour){
                                mfour3.stop();
                                twentyfour=false;
                            }else if (twentyfive){
                                mfive3.stop();
                                twentyfive=false;
                            }else if (twentysix){
                                msix3.stop();
                                twentysix=false;
                            }else if (twentyseven){
                                mseven3.stop();
                                twentyseven=false;
                            }else if (twentyeight){
                                meight3.stop();
                                twentyeight=false;
                            }else if (twentynine){
                                mnine3.stop();
                                twentynine=false;
                            }else if (thirty){
                                mten3.stop();
                                thirty=false;
                            }else if (thirtyone){
                                mone4.stop();
                                thirtyone=false;
                            }else if (thirtytwo){
                                mtwo4.stop();
                                thirtytwo=false;
                            }else if (thirtythree){
                                mthree4.stop();
                                thirtythree=false;
                            }
                            mten2.start();
                            break;
                        case 20:
                            twentyone=true;
                            if (one){
                                mone.stop();
                                one=false;
                            }else if (two){
                                mtwo.stop();
                                two=false;
                            }else if (four){
                                mfour.stop();
                                four=false;
                            }else if (five){
                                mfive.stop();
                                five=false;
                            }else if (six){
                                msix.stop();
                                six=false;
                            }else if (seven){
                                mseven.stop();
                                seven=false;
                            }else if (eight){
                                meight.stop();
                                eight=false;
                            }else if (nine){
                                mnine.stop();
                                nine=false;
                            }else if (ten){
                                mten.stop();
                                ten=false;
                            }else if (eleven){
                                mone2.stop();
                                eleven=false;
                            }else if (tweleve){
                                mtwo2.stop();
                                tweleve=false;
                            }else if (thirthty){
                                mthree2.stop();
                                thirthty=false;
                            }else if (fourthy){
                                mfour2.stop();
                                fourthy=false;
                            }else if (fifthy){
                                mfive2.stop();
                                fifthy=false;
                            }else if (sixthy){
                                msix2.stop();
                                sixthy=false;
                            }else if (seventhy){
                                mseven2.stop();
                                seventhy=false;
                            }else if (eighty){
                                meight2.stop();
                                eighty=false;
                            }else if (ninthy){
                                mnine2.stop();
                                ninthy=false;
                            }else if (twenty){
                                mten2.stop();
                                twenty=false;
                            }else if (three){
                                mthree.stop();
                                three=false;
                            }else if (twentytwo){
                                mtwo3.stop();
                                twentytwo=false;
                            }else if (twentythree){
                                mthree3.stop();
                                twentythree=false;
                            }else if (twentyfour){
                                mfour3.stop();
                                twentyfour=false;
                            }else if (twentyfive){
                                mfive3.stop();
                                twentyfive=false;
                            }else if (twentysix){
                                msix3.stop();
                                twentysix=false;
                            }else if (twentyseven){
                                mseven3.stop();
                                twentyseven=false;
                            }else if (twentyeight){
                                meight3.stop();
                                twentyeight=false;
                            }else if (twentynine){
                                mnine3.stop();
                                twentynine=false;
                            }else if (thirty){
                                mten3.stop();
                                thirty=false;
                            }else if (thirtyone){
                                mone4.stop();
                                thirtyone=false;
                            }else if (thirtytwo){
                                mtwo4.stop();
                                thirtytwo=false;
                            }else if (thirtythree){
                                mthree4.stop();
                                thirtythree=false;
                            }
                            mone3.start();
                            break;
                        case 21:
                            twentytwo=true;
                            if (one){
                                mone.stop();
                                one=false;
                            }else if (two){
                                mtwo.stop();
                                two=false;
                            }else if (four){
                                mfour.stop();
                                four=false;
                            }else if (five){
                                mfive.stop();
                                five=false;
                            }else if (six){
                                msix.stop();
                                six=false;
                            }else if (seven){
                                mseven.stop();
                                seven=false;
                            }else if (eight){
                                meight.stop();
                                eight=false;
                            }else if (nine){
                                mnine.stop();
                                nine=false;
                            }else if (ten){
                                mten.stop();
                                ten=false;
                            }else if (eleven){
                                mone2.stop();
                                eleven=false;
                            }else if (tweleve){
                                mtwo2.stop();
                                tweleve=false;
                            }else if (thirthty){
                                mthree2.stop();
                                thirthty=false;
                            }else if (fourthy){
                                mfour2.stop();
                                fourthy=false;
                            }else if (fifthy){
                                mfive2.stop();
                                fifthy=false;
                            }else if (sixthy){
                                msix2.stop();
                                sixthy=false;
                            }else if (seventhy){
                                mseven2.stop();
                                seventhy=false;
                            }else if (eighty){
                                meight2.stop();
                                eighty=false;
                            }else if (ninthy){
                                mnine2.stop();
                                ninthy=false;
                            }else if (twenty){
                                mten2.stop();
                                twenty=false;
                            }else if (twentyone){
                                mone3.stop();
                                twentyone=false;
                            }else if (three){
                                mthree.stop();
                                three=false;
                            }else if (twentythree){
                                mthree3.stop();
                                twentythree=false;
                            }else if (twentyfour){
                                mfour3.stop();
                                twentyfour=false;
                            }else if (twentyfive){
                                mfive3.stop();
                                twentyfive=false;
                            }else if (twentysix){
                                msix3.stop();
                                twentysix=false;
                            }else if (twentyseven){
                                mseven3.stop();
                                twentyseven=false;
                            }else if (twentyeight){
                                meight3.stop();
                                twentyeight=false;
                            }else if (twentynine){
                                mnine3.stop();
                                twentynine=false;
                            }else if (thirty){
                                mten3.stop();
                                thirty=false;
                            }else if (thirtyone){
                                mone4.stop();
                                thirtyone=false;
                            }else if (thirtytwo){
                                mtwo4.stop();
                                thirtytwo=false;
                            }else if (thirtythree){
                                mthree4.stop();
                                thirtythree=false;
                            }
                            mtwo3.start();
                            break;
                        case 22:
                            twentythree=true;
                            if (one){
                                mone.stop();
                                one=false;
                            }else if (two){
                                mtwo.stop();
                                two=false;
                            }else if (four){
                                mfour.stop();
                                four=false;
                            }else if (five){
                                mfive.stop();
                                five=false;
                            }else if (six){
                                msix.stop();
                                six=false;
                            }else if (seven){
                                mseven.stop();
                                seven=false;
                            }else if (eight){
                                meight.stop();
                                eight=false;
                            }else if (nine){
                                mnine.stop();
                                nine=false;
                            }else if (ten){
                                mten.stop();
                                ten=false;
                            }else if (eleven){
                                mone2.stop();
                                eleven=false;
                            }else if (tweleve){
                                mtwo2.stop();
                                tweleve=false;
                            }else if (thirthty){
                                mthree2.stop();
                                thirthty=false;
                            }else if (fourthy){
                                mfour2.stop();
                                fourthy=false;
                            }else if (fifthy){
                                mfive2.stop();
                                fifthy=false;
                            }else if (sixthy){
                                msix2.stop();
                                sixthy=false;
                            }else if (seventhy){
                                mseven2.stop();
                                seventhy=false;
                            }else if (eighty){
                                meight2.stop();
                                eighty=false;
                            }else if (ninthy){
                                mnine2.stop();
                                ninthy=false;
                            }else if (twenty){
                                mten2.stop();
                                twenty=false;
                            }else if (twentyone){
                                mone3.stop();
                                twentyone=false;
                            }else if (twentytwo){
                                mtwo3.stop();
                                twentytwo=false;
                            }else if (three){
                                mthree.stop();
                                three=false;
                            }else if (twentyfour){
                                mfour3.stop();
                                twentyfour=false;
                            }else if (twentyfive){
                                mfive3.stop();
                                twentyfive=false;
                            }else if (twentysix){
                                msix3.stop();
                                twentysix=false;
                            }else if (twentyseven){
                                mseven3.stop();
                                twentyseven=false;
                            }else if (twentyeight){
                                meight3.stop();
                                twentyeight=false;
                            }else if (twentynine){
                                mnine3.stop();
                                twentynine=false;
                            }else if (thirty){
                                mten3.stop();
                                thirty=false;
                            }else if (thirtyone){
                                mone4.stop();
                                thirtyone=false;
                            }else if (thirtytwo){
                                mtwo4.stop();
                                thirtytwo=false;
                            }else if (thirtythree){
                                mthree4.stop();
                                thirtythree=false;
                            }
                            mthree3.start();
                            break;
                        case 23:
                            twentyfour=true;
                            if (one){
                                mone.stop();
                                one=false;
                            }else if (two){
                                mtwo.stop();
                                two=false;
                            }else if (four){
                                mfour.stop();
                                four=false;
                            }else if (five){
                                mfive.stop();
                                five=false;
                            }else if (six){
                                msix.stop();
                                six=false;
                            }else if (seven){
                                mseven.stop();
                                seven=false;
                            }else if (eight){
                                meight.stop();
                                eight=false;
                            }else if (nine){
                                mnine.stop();
                                nine=false;
                            }else if (ten){
                                mten.stop();
                                ten=false;
                            }else if (eleven){
                                mone2.stop();
                                eleven=false;
                            }else if (tweleve){
                                mtwo2.stop();
                                tweleve=false;
                            }else if (thirthty){
                                mthree2.stop();
                                thirthty=false;
                            }else if (fourthy){
                                mfour2.stop();
                                fourthy=false;
                            }else if (fifthy){
                                mfive2.stop();
                                fifthy=false;
                            }else if (sixthy){
                                msix2.stop();
                                sixthy=false;
                            }else if (seventhy){
                                mseven2.stop();
                                seventhy=false;
                            }else if (eighty){
                                meight2.stop();
                                eighty=false;
                            }else if (ninthy){
                                mnine2.stop();
                                ninthy=false;
                            }else if (twenty){
                                mten2.stop();
                                twenty=false;
                            }else if (twentyone){
                                mone3.stop();
                                twentyone=false;
                            }else if (twentytwo){
                                mtwo3.stop();
                                twentytwo=false;
                            }else if (twentythree){
                                mthree3.stop();
                                twentythree=false;
                            }else if (three){
                                mthree.stop();
                                three=false;
                            }else if (twentyfive){
                                mfive3.stop();
                                twentyfive=false;
                            }else if (twentysix){
                                msix3.stop();
                                twentysix=false;
                            }else if (twentyseven){
                                mseven3.stop();
                                twentyseven=false;
                            }else if (twentyeight){
                                meight3.stop();
                                twentyeight=false;
                            }else if (twentynine){
                                mnine3.stop();
                                twentynine=false;
                            }else if (thirty){
                                mten3.stop();
                                thirty=false;
                            }else if (thirtyone){
                                mone4.stop();
                                thirtyone=false;
                            }else if (thirtytwo){
                                mtwo4.stop();
                                thirtytwo=false;
                            }else if (thirtythree){
                                mthree4.stop();
                                thirtythree=false;
                            }
                            mfour3.start();
                            break;
                        case 24:
                            twentyfive=true;
                            if (one){
                                mone.stop();
                                one=false;
                            }else if (two){
                                mtwo.stop();
                                two=false;
                            }else if (four){
                                mfour.stop();
                                four=false;
                            }else if (five){
                                mfive.stop();
                                five=false;
                            }else if (six){
                                msix.stop();
                                six=false;
                            }else if (seven){
                                mseven.stop();
                                seven=false;
                            }else if (eight){
                                meight.stop();
                                eight=false;
                            }else if (nine){
                                mnine.stop();
                                nine=false;
                            }else if (ten){
                                mten.stop();
                                ten=false;
                            }else if (eleven){
                                mone2.stop();
                                eleven=false;
                            }else if (tweleve){
                                mtwo2.stop();
                                tweleve=false;
                            }else if (thirthty){
                                mthree2.stop();
                                thirthty=false;
                            }else if (fourthy){
                                mfour2.stop();
                                fourthy=false;
                            }else if (fifthy){
                                mfive2.stop();
                                fifthy=false;
                            }else if (sixthy){
                                msix2.stop();
                                sixthy=false;
                            }else if (seventhy){
                                mseven2.stop();
                                seventhy=false;
                            }else if (eighty){
                                meight2.stop();
                                eighty=false;
                            }else if (ninthy){
                                mnine2.stop();
                                ninthy=false;
                            }else if (twenty){
                                mten2.stop();
                                twenty=false;
                            }else if (twentyone){
                                mone3.stop();
                                twentyone=false;
                            }else if (twentytwo){
                                mtwo3.stop();
                                twentytwo=false;
                            }else if (twentythree){
                                mthree3.stop();
                                twentythree=false;
                            }else if (twentyfour){
                                mfour3.stop();
                                twentyfour=false;
                            }else if (three){
                                mthree.stop();
                                three=false;
                            }else if (twentysix){
                                msix3.stop();
                                twentysix=false;
                            }else if (twentyseven){
                                mseven3.stop();
                                twentyseven=false;
                            }else if (twentyeight){
                                meight3.stop();
                                twentyeight=false;
                            }else if (twentynine){
                                mnine3.stop();
                                twentynine=false;
                            }else if (thirty){
                                mten3.stop();
                                thirty=false;
                            }else if (thirtyone){
                                mone4.stop();
                                thirtyone=false;
                            }else if (thirtytwo){
                                mtwo4.stop();
                                thirtytwo=false;
                            }else if (thirtythree){
                                mthree4.stop();
                                thirtythree=false;
                            }
                            mfive3.start();
                            break;
                        case 25:
                            twentysix=true;
                            if (one){
                                mone.stop();
                                one=false;
                            }else if (two){
                                mtwo.stop();
                                two=false;
                            }else if (four){
                                mfour.stop();
                                four=false;
                            }else if (five){
                                mfive.stop();
                                five=false;
                            }else if (six){
                                msix.stop();
                                six=false;
                            }else if (seven){
                                mseven.stop();
                                seven=false;
                            }else if (eight){
                                meight.stop();
                                eight=false;
                            }else if (nine){
                                mnine.stop();
                                nine=false;
                            }else if (ten){
                                mten.stop();
                                ten=false;
                            }else if (eleven){
                                mone2.stop();
                                eleven=false;
                            }else if (tweleve){
                                mtwo2.stop();
                                tweleve=false;
                            }else if (thirthty){
                                mthree2.stop();
                                thirthty=false;
                            }else if (fourthy){
                                mfour2.stop();
                                fourthy=false;
                            }else if (fifthy){
                                mfive2.stop();
                                fifthy=false;
                            }else if (sixthy){
                                msix2.stop();
                                sixthy=false;
                            }else if (seventhy){
                                mseven2.stop();
                                seventhy=false;
                            }else if (eighty){
                                meight2.stop();
                                eighty=false;
                            }else if (ninthy){
                                mnine2.stop();
                                ninthy=false;
                            }else if (twenty){
                                mten2.stop();
                                twenty=false;
                            }else if (twentyone){
                                mone3.stop();
                                twentyone=false;
                            }else if (twentytwo){
                                mtwo3.stop();
                                twentytwo=false;
                            }else if (twentythree){
                                mthree3.stop();
                                twentythree=false;
                            }else if (twentyfour){
                                mfour3.stop();
                                twentyfour=false;
                            }else if (twentyfive){
                                mfive3.stop();
                                twentyfive=false;
                            }else if (three){
                                mthree.stop();
                                three=false;
                            }else if (twentyseven){
                                mseven3.stop();
                                twentyseven=false;
                            }else if (twentyeight){
                                meight3.stop();
                                twentyeight=false;
                            }else if (twentynine){
                                mnine3.stop();
                                twentynine=false;
                            }else if (thirty){
                                mten3.stop();
                                thirty=false;
                            }else if (thirtyone){
                                mone4.stop();
                                thirtyone=false;
                            }else if (thirtytwo){
                                mtwo4.stop();
                                thirtytwo=false;
                            }else if (thirtythree){
                                mthree4.stop();
                                thirtythree=false;
                            }
                            msix3.start();
                            break;
                        case 26:
                            twentyseven=true;
                            if (one){
                                mone.stop();
                                one=false;
                            }else if (two){
                                mtwo.stop();
                                two=false;
                            }else if (four){
                                mfour.stop();
                                four=false;
                            }else if (five){
                                mfive.stop();
                                five=false;
                            }else if (six){
                                msix.stop();
                                six=false;
                            }else if (seven){
                                mseven.stop();
                                seven=false;
                            }else if (eight){
                                meight.stop();
                                eight=false;
                            }else if (nine){
                                mnine.stop();
                                nine=false;
                            }else if (ten){
                                mten.stop();
                                ten=false;
                            }else if (eleven){
                                mone2.stop();
                                eleven=false;
                            }else if (tweleve){
                                mtwo2.stop();
                                tweleve=false;
                            }else if (thirthty){
                                mthree2.stop();
                                thirthty=false;
                            }else if (fourthy){
                                mfour2.stop();
                                fourthy=false;
                            }else if (fifthy){
                                mfive2.stop();
                                fifthy=false;
                            }else if (sixthy){
                                msix2.stop();
                                sixthy=false;
                            }else if (seventhy){
                                mseven2.stop();
                                seventhy=false;
                            }else if (eighty){
                                meight2.stop();
                                eighty=false;
                            }else if (ninthy){
                                mnine2.stop();
                                ninthy=false;
                            }else if (twenty){
                                mten2.stop();
                                twenty=false;
                            }else if (twentyone){
                                mone3.stop();
                                twentyone=false;
                            }else if (twentytwo){
                                mtwo3.stop();
                                twentytwo=false;
                            }else if (twentythree){
                                mthree3.stop();
                                twentythree=false;
                            }else if (twentyfour){
                                mfour3.stop();
                                twentyfour=false;
                            }else if (twentyfive){
                                mfive3.stop();
                                twentyfive=false;
                            }else if (twentysix){
                                msix3.stop();
                                twentysix=false;
                            }else if (three){
                                mthree.stop();
                                three=false;
                            }else if (twentyeight){
                                meight3.stop();
                                twentyeight=false;
                            }else if (twentynine){
                                mnine3.stop();
                                twentynine=false;
                            }else if (thirty){
                                mten3.stop();
                                thirty=false;
                            }else if (thirtyone){
                                mone4.stop();
                                thirtyone=false;
                            }else if (thirtytwo){
                                mtwo4.stop();
                                thirtytwo=false;
                            }else if (thirtythree){
                                mthree4.stop();
                                thirtythree=false;
                            }
                            mseven3.start();
                            break;
                        case 27:
                            twentyeight=true;
                            if (one){
                                mone.stop();
                                one=false;
                            }else if (two){
                                mtwo.stop();
                                two=false;
                            }else if (four){
                                mfour.stop();
                                four=false;
                            }else if (five){
                                mfive.stop();
                                five=false;
                            }else if (six){
                                msix.stop();
                                six=false;
                            }else if (seven){
                                mseven.stop();
                                seven=false;
                            }else if (eight){
                                meight.stop();
                                eight=false;
                            }else if (nine){
                                mnine.stop();
                                nine=false;
                            }else if (ten){
                                mten.stop();
                                ten=false;
                            }else if (eleven){
                                mone2.stop();
                                eleven=false;
                            }else if (tweleve){
                                mtwo2.stop();
                                tweleve=false;
                            }else if (thirthty){
                                mthree2.stop();
                                thirthty=false;
                            }else if (fourthy){
                                mfour2.stop();
                                fourthy=false;
                            }else if (fifthy){
                                mfive2.stop();
                                fifthy=false;
                            }else if (sixthy){
                                msix2.stop();
                                sixthy=false;
                            }else if (seventhy){
                                mseven2.stop();
                                seventhy=false;
                            }else if (eighty){
                                meight2.stop();
                                eighty=false;
                            }else if (ninthy){
                                mnine2.stop();
                                ninthy=false;
                            }else if (twenty){
                                mten2.stop();
                                twenty=false;
                            }else if (twentyone){
                                mone3.stop();
                                twentyone=false;
                            }else if (twentytwo){
                                mtwo3.stop();
                                twentytwo=false;
                            }else if (twentythree){
                                mthree3.stop();
                                twentythree=false;
                            }else if (twentyfour){
                                mfour3.stop();
                                twentyfour=false;
                            }else if (twentyfive){
                                mfive3.stop();
                                twentyfive=false;
                            }else if (twentysix){
                                msix3.stop();
                                twentysix=false;
                            }else if (twentyseven){
                                mseven3.stop();
                                twentyseven=false;
                            }else if (three){
                                mthree.stop();
                                three=false;
                            }else if (twentynine){
                                mnine3.stop();
                                twentynine=false;
                            }else if (thirty){
                                mten3.stop();
                                thirty=false;
                            }else if (thirtyone){
                                mone4.stop();
                                thirtyone=false;
                            }else if (thirtytwo){
                                mtwo4.stop();
                                thirtytwo=false;
                            }else if (thirtythree){
                                mthree4.stop();
                                thirtythree=false;
                            }
                            meight3.start();
                            break;
                        case 28:
                            twentynine=true;
                            if (one){
                                mone.stop();
                                one=false;
                            }else if (two){
                                mtwo.stop();
                                two=false;
                            }else if (four){
                                mfour.stop();
                                four=false;
                            }else if (five){
                                mfive.stop();
                                five=false;
                            }else if (six){
                                msix.stop();
                                six=false;
                            }else if (seven){
                                mseven.stop();
                                seven=false;
                            }else if (eight){
                                meight.stop();
                                eight=false;
                            }else if (nine){
                                mnine.stop();
                                nine=false;
                            }else if (ten){
                                mten.stop();
                                ten=false;
                            }else if (eleven){
                                mone2.stop();
                                eleven=false;
                            }else if (tweleve){
                                mtwo2.stop();
                                tweleve=false;
                            }else if (thirthty){
                                mthree2.stop();
                                thirthty=false;
                            }else if (fourthy){
                                mfour2.stop();
                                fourthy=false;
                            }else if (fifthy){
                                mfive2.stop();
                                fifthy=false;
                            }else if (sixthy){
                                msix2.stop();
                                sixthy=false;
                            }else if (seventhy){
                                mseven2.stop();
                                seventhy=false;
                            }else if (eighty){
                                meight2.stop();
                                eighty=false;
                            }else if (ninthy){
                                mnine2.stop();
                                ninthy=false;
                            }else if (twenty){
                                mten2.stop();
                                twenty=false;
                            }else if (twentyone){
                                mone3.stop();
                                twentyone=false;
                            }else if (twentytwo){
                                mtwo3.stop();
                                twentytwo=false;
                            }else if (twentythree){
                                mthree3.stop();
                                twentythree=false;
                            }else if (twentyfour){
                                mfour3.stop();
                                twentyfour=false;
                            }else if (twentyfive){
                                mfive3.stop();
                                twentyfive=false;
                            }else if (twentysix){
                                msix3.stop();
                                twentysix=false;
                            }else if (twentyseven){
                                mseven3.stop();
                                twentyseven=false;
                            }else if (twentyeight){
                                meight3.stop();
                                twentyeight=false;
                            }else if (three){
                                mthree.stop();
                                three=false;
                            }else if (thirty){
                                mten3.stop();
                                thirty=false;
                            }else if (thirtyone){
                                mone4.stop();
                                thirtyone=false;
                            }else if (thirtytwo){
                                mtwo4.stop();
                                thirtytwo=false;
                            }else if (thirtythree){
                                mthree4.stop();
                                thirtythree=false;
                            }
                            mnine3.start();
                            break;
                        case 29:
                            thirty=true;
                            if (one){
                                mone.stop();
                                one=false;
                            }else if (two){
                                mtwo.stop();
                                two=false;
                            }else if (four){
                                mfour.stop();
                                four=false;
                            }else if (five){
                                mfive.stop();
                                five=false;
                            }else if (six){
                                msix.stop();
                                six=false;
                            }else if (seven){
                                mseven.stop();
                                seven=false;
                            }else if (eight){
                                meight.stop();
                                eight=false;
                            }else if (nine){
                                mnine.stop();
                                nine=false;
                            }else if (ten){
                                mten.stop();
                                ten=false;
                            }else if (eleven){
                                mone2.stop();
                                eleven=false;
                            }else if (tweleve){
                                mtwo2.stop();
                                tweleve=false;
                            }else if (thirthty){
                                mthree2.stop();
                                thirthty=false;
                            }else if (fourthy){
                                mfour2.stop();
                                fourthy=false;
                            }else if (fifthy){
                                mfive2.stop();
                                fifthy=false;
                            }else if (sixthy){
                                msix2.stop();
                                sixthy=false;
                            }else if (seventhy){
                                mseven2.stop();
                                seventhy=false;
                            }else if (eighty){
                                meight2.stop();
                                eighty=false;
                            }else if (ninthy){
                                mnine2.stop();
                                ninthy=false;
                            }else if (twenty){
                                mten2.stop();
                                twenty=false;
                            }else if (twentyone){
                                mone3.stop();
                                twentyone=false;
                            }else if (twentytwo){
                                mtwo3.stop();
                                twentytwo=false;
                            }else if (twentythree){
                                mthree3.stop();
                                twentythree=false;
                            }else if (twentyfour){
                                mfour3.stop();
                                twentyfour=false;
                            }else if (twentyfive){
                                mfive3.stop();
                                twentyfive=false;
                            }else if (twentysix){
                                msix3.stop();
                                twentysix=false;
                            }else if (twentyseven){
                                mseven3.stop();
                                twentyseven=false;
                            }else if (twentyeight){
                                meight3.stop();
                                twentyeight=false;
                            }else if (twentynine){
                                mnine3.stop();
                                twentynine=false;
                            }else if (three){
                                mthree.stop();
                                three=false;
                            }else if (thirtyone){
                                mone4.stop();
                                thirtyone=false;
                            }else if (thirtytwo){
                                mtwo4.stop();
                                thirtytwo=false;
                            }else if (thirtythree){
                                mthree4.stop();
                                thirtythree=false;
                            }
                            mten3.start();
                            break;
                        case 30:
                            thirtyone=true;
                            if (one){
                                mone.stop();
                                one=false;
                            }else if (two){
                                mtwo.stop();
                                two=false;
                            }else if (four){
                                mfour.stop();
                                four=false;
                            }else if (five){
                                mfive.stop();
                                five=false;
                            }else if (six){
                                msix.stop();
                                six=false;
                            }else if (seven){
                                mseven.stop();
                                seven=false;
                            }else if (eight){
                                meight.stop();
                                eight=false;
                            }else if (nine){
                                mnine.stop();
                                nine=false;
                            }else if (ten){
                                mten.stop();
                                ten=false;
                            }else if (eleven){
                                mone2.stop();
                                eleven=false;
                            }else if (tweleve){
                                mtwo2.stop();
                                tweleve=false;
                            }else if (thirthty){
                                mthree2.stop();
                                thirthty=false;
                            }else if (fourthy){
                                mfour2.stop();
                                fourthy=false;
                            }else if (fifthy){
                                mfive2.stop();
                                fifthy=false;
                            }else if (sixthy){
                                msix2.stop();
                                sixthy=false;
                            }else if (seventhy){
                                mseven2.stop();
                                seventhy=false;
                            }else if (eighty){
                                meight2.stop();
                                eighty=false;
                            }else if (ninthy){
                                mnine2.stop();
                                ninthy=false;
                            }else if (twenty){
                                mten2.stop();
                                twenty=false;
                            }else if (twentyone){
                                mone3.stop();
                                twentyone=false;
                            }else if (twentytwo){
                                mtwo3.stop();
                                twentytwo=false;
                            }else if (twentythree){
                                mthree3.stop();
                                twentythree=false;
                            }else if (twentyfour){
                                mfour3.stop();
                                twentyfour=false;
                            }else if (twentyfive){
                                mfive3.stop();
                                twentyfive=false;
                            }else if (twentysix){
                                msix3.stop();
                                twentysix=false;
                            }else if (twentyseven){
                                mseven3.stop();
                                twentyseven=false;
                            }else if (twentyeight){
                                meight3.stop();
                                twentyeight=false;
                            }else if (twentynine){
                                mnine3.stop();
                                twentynine=false;
                            }else if (thirty){
                                mten3.stop();
                                thirty=false;
                            }else if (three){
                                mthree.stop();
                                three=false;
                            }else if (thirtytwo){
                                mtwo4.stop();
                                thirtytwo=false;
                            }else if (thirtythree){
                                mthree4.stop();
                                thirtythree=false;
                            }
                            mone4.start();
                            break;
                        case 31:
                            thirtytwo=true;
                            if (one){
                                mone.stop();
                                one=false;
                            }else if (two){
                                mtwo.stop();
                                two=false;
                            }else if (four){
                                mfour.stop();
                                four=false;
                            }else if (five){
                                mfive.stop();
                                five=false;
                            }else if (six){
                                msix.stop();
                                six=false;
                            }else if (seven){
                                mseven.stop();
                                seven=false;
                            }else if (eight){
                                meight.stop();
                                eight=false;
                            }else if (nine){
                                mnine.stop();
                                nine=false;
                            }else if (ten){
                                mten.stop();
                                ten=false;
                            }else if (eleven){
                                mone2.stop();
                                eleven=false;
                            }else if (tweleve){
                                mtwo2.stop();
                                tweleve=false;
                            }else if (thirthty){
                                mthree2.stop();
                                thirthty=false;
                            }else if (fourthy){
                                mfour2.stop();
                                fourthy=false;
                            }else if (fifthy){
                                mfive2.stop();
                                fifthy=false;
                            }else if (sixthy){
                                msix2.stop();
                                sixthy=false;
                            }else if (seventhy){
                                mseven2.stop();
                                seventhy=false;
                            }else if (eighty){
                                meight2.stop();
                                eighty=false;
                            }else if (ninthy){
                                mnine2.stop();
                                ninthy=false;
                            }else if (twenty){
                                mten2.stop();
                                twenty=false;
                            }else if (twentyone){
                                mone3.stop();
                                twentyone=false;
                            }else if (twentytwo){
                                mtwo3.stop();
                                twentytwo=false;
                            }else if (twentythree){
                                mthree3.stop();
                                twentythree=false;
                            }else if (twentyfour){
                                mfour3.stop();
                                twentyfour=false;
                            }else if (twentyfive){
                                mfive3.stop();
                                twentyfive=false;
                            }else if (twentysix){
                                msix3.stop();
                                twentysix=false;
                            }else if (twentyseven){
                                mseven3.stop();
                                twentyseven=false;
                            }else if (twentyeight){
                                meight3.stop();
                                twentyeight=false;
                            }else if (twentynine){
                                mnine3.stop();
                                twentynine=false;
                            }else if (thirty){
                                mten3.stop();
                                thirty=false;
                            }else if (thirtyone){
                                mone4.stop();
                                thirtyone=false;
                            }else if (three){
                                mthree.stop();
                                three=false;
                            }else if (thirtythree){
                                mthree4.stop();
                                thirtythree=false;
                            }
                            mtwo4.start();
                            nextnext.setVisibility(View.VISIBLE);
                            break;
                        case 32:
                            thirtythree=true;
                            if (one){
                                mone.stop();
                                one=false;
                            }else if (two){
                                mtwo.stop();
                                two=false;
                            }else if (four){
                                mfour.stop();
                                four=false;
                            }else if (five){
                                mfive.stop();
                                five=false;
                            }else if (six){
                                msix.stop();
                                six=false;
                            }else if (seven){
                                mseven.stop();
                                seven=false;
                            }else if (eight){
                                meight.stop();
                                eight=false;
                            }else if (nine){
                                mnine.stop();
                                nine=false;
                            }else if (ten){
                                mten.stop();
                                ten=false;
                            }else if (eleven){
                                mone2.stop();
                                eleven=false;
                            }else if (tweleve){
                                mtwo2.stop();
                                tweleve=false;
                            }else if (thirthty){
                                mthree2.stop();
                                thirthty=false;
                            }else if (fourthy){
                                mfour2.stop();
                                fourthy=false;
                            }else if (fifthy){
                                mfive2.stop();
                                fifthy=false;
                            }else if (sixthy){
                                msix2.stop();
                                sixthy=false;
                            }else if (seventhy){
                                mseven2.stop();
                                seventhy=false;
                            }else if (eighty){
                                meight2.stop();
                                eighty=false;
                            }else if (ninthy){
                                mnine2.stop();
                                ninthy=false;
                            }else if (twenty){
                                mten2.stop();
                                twenty=false;
                            }else if (twentyone){
                                mone3.stop();
                                twentyone=false;
                            }else if (twentytwo){
                                mtwo3.stop();
                                twentytwo=false;
                            }else if (twentythree){
                                mthree3.stop();
                                twentythree=false;
                            }else if (twentyfour){
                                mfour3.stop();
                                twentyfour=false;
                            }else if (twentyfive){
                                mfive3.stop();
                                twentyfive=false;
                            }else if (twentysix){
                                msix3.stop();
                                twentysix=false;
                            }else if (twentyseven){
                                mseven3.stop();
                                twentyseven=false;
                            }else if (twentyeight){
                                meight3.stop();
                                twentyeight=false;
                            }else if (twentynine){
                                mnine3.stop();
                                twentynine=false;
                            }else if (thirty){
                                mten3.stop();
                                thirty=false;
                            }else if (thirtyone){
                                mone4.stop();
                                thirtyone=false;
                            }else if (thirtytwo){
                                mtwo4.stop();
                                thirtytwo=false;
                            }else if (three){
                                mthree.stop();
                                three=false;
                            }
                            mthree4.start();
                            nextnext.setVisibility(View.INVISIBLE);
                            break;
                    }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}
