package usage;

/**
 * @author @muratovv
 * @date 28.04.17
 */
public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        model.subscribe(new ModelSubscriber());
        model.notifySubscribers();
        model.notifySubscribers();
    }
}
