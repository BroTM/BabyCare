package com.example.dell.babycare.Activities.developmentActivities;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.dell.babycare.Activities.developmentActivities.burmese_frag.Ka_Kyi;

/**
 * Created by Aspire on 1/24/2018.
 */

class Myteach_Burmese extends FragmentStatePagerAdapter {
    public Myteach_Burmese(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment=new Ka_Kyi();
                break;
            case 1:
                fragment=new Ca_Chaway();
                break;
            case 2:
                fragment=new Ga_Nge();
                break;
             case 3:
                 fragment=new Ga_Gyi();
                 break;
             case 4:
                 fragment=new Nga();
                 break;
             case 5:
            fragment=new Sa_Lone();
            break;
             case 6:
            fragment=new Sa_Lane();
            break;
             case 7:
            fragment=new Za_Kawe();
            break;
             case 8:
            fragment=new Za_Myin();
            break;
             case 9:
            fragment=new Nya();
            break;
             case 10:
            fragment=new Ta_Ta_Linn();
            break;
             case 11:
            fragment=new Hta_Won_Bae();
            break;
             case 12:
            fragment=new Da_Yin();
            break;
             case 13:
            fragment=new Da_Yae_Mote();
            break;
             case 14:
            fragment=new Na_Gyi();
            break;
             case 15:
            fragment=new Ta_Won_Puu();
            break;
             case 16:
            fragment=new Hta_Sinn_To();
            break;
             case 17:
            fragment=new Da_Dway();
            break;
             case 18:
            fragment=new Da_Aut();
            break;
             case 19:
            fragment=new Na_Nge();
            break;
             case 20:
            fragment=new Pa_Saut();
            break;
             case 21:
            fragment=new Pha_Oo_Htoke();
            break;
             case 22:
            fragment=new Va_Lachite();
            break;
             case 23:
            fragment=new Ba_Kone();
            break;
             case 24:
            fragment=new Ma();
            break;
             case 25:
            fragment=new Ya_Palet();
            break;
            
            case 26:
            fragment=new Ya_Kaut();
            break;
            case 27:
            fragment=new La();
            break;
            case 28:
            fragment=new Wa();
            break;
            case 29:
            fragment=new Tha();
            break;
            case 30:
            fragment=new Ha();
            break;
            case 31:
            fragment=new La_Gyi();
            break;
            case 32:
            fragment=new A();
            break;
            
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 33;
    }
}
