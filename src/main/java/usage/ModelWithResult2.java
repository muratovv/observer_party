package usage;

import api.Observable;
import api.Result2;
import api.Subscriber;

/**
 * @author @muratovv
 * @date 28.04.17
 */
public class ModelWithResult2 implements Observable<Result2<Integer, Result2<String, Result2<Float, Void>>>> {
    @Override
    public void subscribe(Subscriber<Result2<Integer, Result2<String, Result2<Float, Void>>>> subscriber) {
        subscriber.notify(new Result2<Integer, Result2<String, Result2<Float, Void>>>() {
            @Override
            public Integer get() {
                return 1;
            }
        });
    }

    @Override
    public void unsubscribe(Subscriber<Result2<Integer, Result2<String, Result2<Float, Void>>>> subscriber) {

    }
}
