package usage;

/**
 * @author @muratovv
 * @date 28.04.17
 */
public class ResMain {
    public static void main(String[] args) {
        ModelWithResult m = new ModelWithResult();
        m.subscribe(new SubscriberResult());
        m.notifyInt();
        m.notifyString();
    }
}
