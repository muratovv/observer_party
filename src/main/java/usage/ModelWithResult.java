package usage;

import api.Observable;
import api.Result;
import api.ResultEnd;
import api.Subscriber;

/**
 * @author @muratovv
 * @date 28.04.17
 */
public class ModelWithResult implements Observable<Result<Integer, ResultEnd<String>>> {
    private Subscriber<Result<Integer, ResultEnd<String>>> subscriber;

    @Override
    public void subscribe(Subscriber<Result<Integer, ResultEnd<String>>> subscriber) {
        this.subscriber = subscriber;
    }

    @Override
    public void unsubscribe(Subscriber<Result<Integer, ResultEnd<String>>> subscriber) {
        this.subscriber = null;
    }

    public void notifyInt() {
        subscriber.notify(new Result<Integer, ResultEnd<String>>() {
            @Override
            public Integer get() {
                return 1;
            }

            @Override
            public Result<ResultEnd<String>, Void> getNext() {
                return null;
            }
        });
    }

    public void notifyString() {
        subscriber.notify(new Result<Integer, ResultEnd<String>>() {
            @Override
            public Integer get() {
                return null;
            }

            @Override
            public Result<ResultEnd<String>, Void> getNext() {
                return new Result<ResultEnd<String>, Void>() {
                    @Override
                    public ResultEnd<String> get() {
                        return new ResultEnd<String>() {
                            @Override
                            public String get() {
                                return "abc";
                            }

                            @Override
                            public Result<Void, Void> getNext() {
                                return null;
                            }
                        };
                    }

                    @Override
                    public Result<Void, Void> getNext() {
                        return null;
                    }
                };
            }
        });
    }
}
