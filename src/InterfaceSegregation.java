interface IHuman{
    void teaBreak();
    void lunch();
}

interface IRobot{
    void recharge();
    void oilCheck();
}

class HumanWorker implements IHuman{

    @Override
    public void teaBreak() {
    }

    @Override
    public void lunch() {
    }

}

class RobotWorker implements IRobot{

    @Override
    public void recharge() {
    }


    @Override
    public void oilCheck() {
    }
}