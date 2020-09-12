package creational.singleton;

/**
 * @author unufolio unufolio@gmail.com
 * @date 2020/09/12
 */
public class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance = null;

    private LazyInitializedSingleton() {
    }

    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
