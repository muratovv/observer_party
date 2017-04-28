package usage;

import api.Result;
import api.ResultEnd;
import api.Subscriber;

/**
 * @author @muratovv
 * @date 28.04.17
 */
public class SubscriberResult implements Subscriber<Result<Integer, ResultEnd<String>>> {
    @Override
    public void notify(Result<Integer, ResultEnd<String>> result) {
        if (result.get() != null) {
            System.out.println(String.format("%d", result.get()));
        }
        if (result.getNext() != null &&
                result.getNext().get() != null) {
            System.out.println(String.format("%s", result.getNext().get().get()));
        }
    }
}
