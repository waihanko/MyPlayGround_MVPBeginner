package me.waihanko.myplayground.presenter;

import me.waihanko.myplayground.datamodel.CarPowerSystem;
import me.waihanko.myplayground.view.PowerSystemResult;

public class CarResponsibilityImplement implements CarResponsibilityPresenter {
    PowerSystemResult cwd;
    CarPowerSystem car = CarPowerSystem.getInstance();

    public CarResponsibilityImplement(PowerSystemResult cwd) {
        this.cwd = cwd;
    }

    @Override
    public void DoUnlock() {
        car.unlock(this);
    }

    @Override
    public void StartPowerSystem(String message) {
        cwd.StartingPowerSystem(message);
    }

    @Override
    public void DoFrontGear() {
        cwd.GoForward();
    }

    @Override
    public void DoTurnOnLight() {
        cwd.OpenFrontLight();
    }
}
