package api;

/**
 * @author @muratovv
 * @date 28.04.17
 */
public interface Observable<T> {
    public void subscribe(Subscriber<T> subscriber);
    public void unsubscribe(Subscriber<T> subscriber);
}
