package hsn.ibt.dataParsers;

public interface Callable<T1, T2> {
    T1 call(T2 p1, T1 p2);
}
