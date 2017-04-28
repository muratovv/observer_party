package api;

/**
 * @author @muratovv
 * @date 28.04.17
 */
public interface Subscriber<T> {
    void notify(T result);
}
