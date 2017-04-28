package api;

/**
 * @author @muratovv
 * @date 28.04.17
 */
public interface Result<T, V> {
    T get();

    Result<V, Void> getNext();
}
