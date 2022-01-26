package com.example.valorantskinandcalculator;

import android.content.Context;
import android.content.res.Resources;

import androidx.core.content.res.ResourcesCompat;

public class Initializer {
    private void init(Context context){
        Resources res = context.getResources();
        initBattlepasses(res);
        initBlastX(res);
        initCelestial(res);
        initEgo(res);
        initElderflame(res);
        initForsaken(res);
        initGUN(res);
        initGiveBack(res);
        initGlitchpop(res);
        initGlitchpop2(res);
        initGo(res);
        initHorizon(res);
        initInfantry(res);
        initIon(res);
        initLuxe(res);
        initMagepunk(res);
        initMinima(res);
        initNebula(res);
        initOni(res);
        initOrigin(res);
        initPrime(res);
        initPrime2(res);
        initPrism(res);
        initPrism2(res);
        initReaver(res);
        initRecon(res);
        initRuination(res);
        initSensation(res);
        initRunItBack(res);
        initSOL(res);
        initSilvanus(res);
        initSingularity(res);
        initSmite(res);
        initSovereign(res);
        initSpline(res);
        initTetheredRealms(res);
        initWinterWonderland(res);
        initAristocrat(res);
        initAvalanche(res);
        initConvex(res);
        initGalleria(res);
        initImperium(res);
        initRonin(res);
        initRush(res);
        initSakura(res);
        initWasteland(res);

    }

    private void initBattlepasses(Resources res){
        initBattlepass1(res);
        initBattlepass2(res);
        initBattlepass3(res);
        initBattlepass4(res);
        initBattlepass5(res);
        initBattlepass6(res);
        initBattlepass7(res);
        initBattlepass8(res);
        initBattlepass9(res);
        initBattlepass10(res);
    }

    private void initWasteland(Resources res){
        Bundle bundle =  new Bundle(55,"Wasteland Collection",6375, null, ResourcesCompat.getDrawable(res, R.drawable.wasteland_bundle, null));
        //bundle.addGun(new Gun);
    }

    private void initSakura(Resources res){
        Bundle bundle = new Bundle(54,"Sakura Collection",6375, null, ResourcesCompat.getDrawable(res, R.drawable.sakura_bundle, null));

    }

    private void initRush(Resources res){
        Bundle bundle =  new Bundle(53,"Rush Collection",4375, null, ResourcesCompat.getDrawable(res, R.drawable.rush_bundle, null));

    }

    private void initRonin(Resources res){
        Bundle bundle = new Bundle(52,"Ronin Collection",null, null, ResourcesCompat.getDrawable(res, R.drawable.ronin_bundle, null));

    }

    private void initImperium(Resources res){
        Bundle bundle = new Bundle(51,"Imperium Collection",null, null, ResourcesCompat.getDrawable(res, R.drawable.imperium_bundle, null));

    }
    private void initGalleria(Resources res){
        Bundle bundle = new Bundle(50,"Galleria Collection",4375, null, ResourcesCompat.getDrawable(res, R.drawable.galleria_bundle, null));

    }

    private void initConvex(Resources res){
        Bundle bundle = new Bundle(49,"Convex Collection",4375, null, ResourcesCompat.getDrawable(res, R.drawable.convex_bundle, null));

    }

    private void initAvalanche(Resources res){
        Bundle bundle = new Bundle(48,"Avalanche Collection",6375, null, ResourcesCompat.getDrawable(res, R.drawable.avalanche_bundle, null));

    }

    private void initAristocrat(Resources res){
        Bundle bundle =  new Bundle(47,"Aristocrat Collection",6375, null, ResourcesCompat.getDrawable(res, R.drawable.aristocrat_bundle, null));

    }

    private void initWinterWonderland(Resources res){
        Bundle bundle = new Bundle(46,"Winter Wonderland",5100, null, ResourcesCompat.getDrawable(res, R.drawable.winter_wonderland_bundle, null));

    }

    private void initTetheredRealms(Resources res){
        Bundle bundle = new Bundle(45,"Tethered Realms",7100, null, ResourcesCompat.getDrawable(res, R.drawable.tethered_realms_bundle, null));

    }

    private void initSpline(Resources res){
        Bundle bundle =  new Bundle(44,"Spline",7100, null, ResourcesCompat.getDrawable(res, R.drawable.spline_bundle, null));

    }

    private void initSovereign(Resources res){
        Bundle bundle = new Bundle(43,"Sovereign",7100, null, ResourcesCompat.getDrawable(res, R.drawable.sovereign_bundle, null));

    }

    private void initSmite(Resources res){
        Bundle bundle = new Bundle(42,"Smite",3500, null, ResourcesCompat.getDrawable(res, R.drawable.smite_bundle, null));

    }

    private void initSingularity(Resources res){
        Bundle bundle =  new Bundle(41,"Singularity",8700, null, ResourcesCompat.getDrawable(res, R.drawable.singularity_bundle, null));

    }

    private void initSilvanus(Resources res){
        Bundle bundle =  new Bundle(40,"Silvanus",4270, null, ResourcesCompat.getDrawable(res, R.drawable.silvanus_bundle, null));

    }

    private void initSOL(Resources res){
        Bundle bundle =  new Bundle(39,"Sentinels Of Light",8700, null, ResourcesCompat.getDrawable(res, R.drawable.sentinels_of_light_bundle, null));

    }

    private void initSensation(Resources res){
        Bundle bundle =   new Bundle(38,"Sensation",2930, null, ResourcesCompat.getDrawable(res, R.drawable.sensation_bundle, null));

    }

    private void initRunItBack(Resources res){
        Bundle bundle =   new Bundle(37,"Run It Back",5960, null, ResourcesCompat.getDrawable(res, R.drawable.run_it_back_bundle, null));

    }

    private void initRuination(Resources res){
        Bundle bundle = new Bundle(36,"Ruination",8700, null, ResourcesCompat.getDrawable(res, R.drawable.ruination_bundle, null));

    }

    private void initRecon(Resources res){
        Bundle bundle =  new Bundle(35,"Recon",7100, null, ResourcesCompat.getDrawable(res, R.drawable.recon_bundle, null));

    }

    private void initReaver(Resources res){
        Bundle bundle = new Bundle(34,"Reaver",7100, null, ResourcesCompat.getDrawable(res, R.drawable.reaver_bundle, null));

    }

    private void initPrism2(Resources res){
        Bundle bundle = new Bundle(33,"Prism II",5100, null, ResourcesCompat.getDrawable(res, R.drawable.prism_2_bundle, null));

    }

    private void initPrism(Resources res){
        Bundle bundle =  new Bundle(32,"Prism",5100, null, ResourcesCompat.getDrawable(res, R.drawable.prism_bundle, null));

    }

    private void initPrime2(Resources res){
        Bundle bundle =  new Bundle(31,"Prime 2.0",7100, null, ResourcesCompat.getDrawable(res, R.drawable.prime_2_bundle, null));

    }

    private void initPrime(Resources res){
        Bundle bundle = new Bundle(30,"Prime",7100, null, ResourcesCompat.getDrawable(res, R.drawable.prime_bundle, null));

    }

    private void initOrigin(Resources res){
        Bundle bundle =  new Bundle(29,"Origin",7100, null, ResourcesCompat.getDrawable(res, R.drawable.origin_bundle, null));

    }

    private void initOni(Resources res){
        Bundle bundle =  new Bundle(28,"Oni",7100, null, ResourcesCompat.getDrawable(res, R.drawable.oni_bundle, null));

    }

    private void initNebula(Resources res){
        Bundle bundle =  new Bundle(27,"Nebula",7100, null, ResourcesCompat.getDrawable(res, R.drawable.nebula_bundle, null));

    }

    private void initMinima(Resources res){
        Bundle bundle =  new Bundle(26,"Minima",4270, null, ResourcesCompat.getDrawable(res, R.drawable.minima_bundle, null));

    }

    private void initMagepunk(Resources res){
        Bundle bundle =  new Bundle(25,"Magepunk",6734, null, ResourcesCompat.getDrawable(res, R.drawable.magepunk_bundle, null));

    }

    private void initLuxe(Resources res){
        Bundle bundle =  new Bundle(24,"Luxe",4375, null, ResourcesCompat.getDrawable(res, R.drawable.luxe_bundle, null));

    }

    private void initIon(Resources res){
        Bundle bundle = new Bundle(23,"Ion",7100, null, ResourcesCompat.getDrawable(res, R.drawable.ion_bundle, null));

    }

    private void initInfantry(Resources res){
        Bundle bundle =  new Bundle(22,"Infantry",2930, null, ResourcesCompat.getDrawable(res, R.drawable.infantry_bundle, null));

    }

    private void initHorizon(Resources res){
        Bundle bundle = new Bundle(21,"Horizon",4270, null, ResourcesCompat.getDrawable(res, R.drawable.horizon_bundle, null));

    }

    private void initGo(Resources res){
        Bundle bundle = new Bundle(20,"Valorant Go Vol 1",8700, null, ResourcesCompat.getDrawable(res, R.drawable.go_volume_1_bundle, null));

    }

    private void initGlitchpop2(Resources res){
        Bundle bundle = new Bundle(19,"Glitchpop II",8700, null, ResourcesCompat.getDrawable(res, R.drawable.glitchpop_2_bundle, null));

    }

    private void initGlitchpop(Resources res){
        Bundle bundle = new Bundle(18,"Glitchpop",8700, null, ResourcesCompat.getDrawable(res, R.drawable.glitchpop_bundle, null));

    }

    private void initGiveBack(Resources res){
        Bundle bundle =  new Bundle(17,"Give Back",6380, null, ResourcesCompat.getDrawable(res, R.drawable.go_volume_1_bundle, null));

    }

    private void initGUN(Resources res){
        Bundle bundle =  new Bundle(16,"G.U.N",7100, null, ResourcesCompat.getDrawable(res, R.drawable.gravitational_uranium_neuroblaster_bundle, null));

    }

    private void initForsaken(Resources res){
        Bundle bundle =  new Bundle(15,"Forsaken",7100, null, ResourcesCompat.getDrawable(res, R.drawable.forsaken_bundle, null));

    }

    private void initElderflame(Resources res){
        Bundle bundle = new Bundle(14,"Elderflame",9900, null, ResourcesCompat.getDrawable(res, R.drawable.elderflame_bundle, null));

    }

    private void initEgo(Resources res){
        Bundle bundle = new Bundle(13,"Ego",7100, null, ResourcesCompat.getDrawable(res, R.drawable.ego_bundle, null));

    }

    private void initCelestial(Resources res){
        Bundle bundle = new Bundle(12,"Celestial",7100, null, ResourcesCompat.getDrawable(res, R.drawable.celestial_bundle, null));

    }

    private void initBlastX(Resources res){
        Bundle bundle = new Bundle(11,"BlastX",8700, null, ResourcesCompat.getDrawable(res, R.drawable.blastx_bundle, null));

    }

    private void initBattlepass1(Resources res){
        Bundle bundle =  new Bundle(10,"Season 1 Act 1 Battle Pass",1000, null, ResourcesCompat.getDrawable(res, R.drawable.battlepass_1, null));

    }

    private void initBattlepass2(Resources res){
        Bundle bundle = new Bundle(9,"Season 1 Act 2 Battle Pass",1000, null, ResourcesCompat.getDrawable(res, R.drawable.battlepass_2, null));

    }

    private void initBattlepass3(Resources res){
        Bundle bundle = new Bundle(8,"Season 1 Act 3 Battle Pass",1000, null, ResourcesCompat.getDrawable(res, R.drawable.battlepass_3, null));

    }

    private void initBattlepass4(Resources res){
        Bundle bundle = new Bundle(7,"Season 2 Act 1 Battle Pass",1000, null, ResourcesCompat.getDrawable(res, R.drawable.battlepass_4, null));

    }
    private void initBattlepass5(Resources res){
        Bundle bundle = new Bundle(6,"Season 2 Act 2 Battle Pass",1000, null, ResourcesCompat.getDrawable(res, R.drawable.battlepass_5, null));

    }

    private void initBattlepass6(Resources res){
        Bundle bundle = new Bundle(5,"Season 2 Act 3 Battle Pass",1000, null, ResourcesCompat.getDrawable(res, R.drawable.battlepass_6, null));

    }

    private void initBattlepass7(Resources res){
        Bundle bundle = new Bundle(4,"Season 3 Act 1 Battle Pass",1000, null, ResourcesCompat.getDrawable(res, R.drawable.battlepass_7, null));

    }

    private void initBattlepass8(Resources res){
        Bundle bundle = new Bundle(3,"Season 3 Act 2 Battle Pass",1000, null, ResourcesCompat.getDrawable(res, R.drawable.battlepass_8, null));

    }

    private void initBattlepass9(Resources res){
        Bundle bundle = new Bundle(2,"Season 3 Act 3 Battle Pass",1000, null, ResourcesCompat.getDrawable(res, R.drawable.battlepass_9, null));

    }

    private void initBattlepass10(Resources res){
        Bundle bundle = new Bundle(1,"Season 4 Act 1 Battle Pass",1000, null, ResourcesCompat.getDrawable(res, R.drawable.battlepass_10, null));

    }
}
