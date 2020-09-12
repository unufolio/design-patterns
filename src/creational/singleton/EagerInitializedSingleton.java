package creational.singleton;

/**
 * @author unufolio unufolio@gmail.com
 * @date 2020/09/12
 */
public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    /**
     * private constructor to avoid client applications to use constructor
     */
    private EagerInitializedSingleton() {
    }

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}
