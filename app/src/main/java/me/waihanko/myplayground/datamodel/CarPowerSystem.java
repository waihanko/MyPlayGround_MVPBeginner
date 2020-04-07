package me.waihanko.myplayground.datamodel;

import me.waihanko.myplayground.presenter.CarResponsibilityPresenter;

public class CarPowerSystem {
    private static CarPowerSystem instance;
    private CarPowerSystem(){
    }

    public static CarPowerSystem getInstance(){
        if(instance == null){
            instance = new CarPowerSystem();
        }
        return instance;
    }

    public void unlock(CarResponsibilityPresenter crp){
        crp.StartPowerSystem("Power System Is Starting");
        crp.DoFrontGear();
        crp.DoTurnOnLight();
    }
}
