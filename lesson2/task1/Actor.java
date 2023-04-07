package lesson2.task1;

public abstract class Actor implements ActorBehaviour {
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;
    String name;

    public abstract String getName();
}
