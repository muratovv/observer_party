package usage;

import api.Subscriber;

/**
 * @author @muratovv
 * @date 28.04.17
 */
public class ModelSubscriber implements Subscriber<Integer> {
    @Override
    public void notify(Integer result) {
        System.out.println(String.format("Notified with %d", result));
    }
}
