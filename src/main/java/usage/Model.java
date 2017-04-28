package usage;

import api.Observable;
import api.Subscriber;

import java.util.Random;

/**
 * @author @muratovv
 * @date 28.04.17
 */
public class Model implements Observable<Integer> {
    private Subscriber<Integer> subscriber;

    @Override
    public void subscribe(Subscriber<Integer> subscriber) {
        this.subscriber = subscriber;
    }

    @Override
    public void unsubscribe(Subscriber<Integer> subscriber) {
        if (this.subscriber == subscriber) {
            this.subscriber = null;
        }
    }

    public void notifySubscribers() {
        if (subscriber != null)
            subscriber.notify(new Random().nextInt());
    }
}
