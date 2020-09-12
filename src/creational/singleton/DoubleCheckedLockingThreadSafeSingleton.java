package creational.singleton;

/**
 * @author unufolio unufolio@gmail.com
 * @date 2020/09/12
 */
public class DoubleCheckedLockingThreadSafeSingleton {
    private static DoubleCheckedLockingThreadSafeSingleton instance = null;

    private DoubleCheckedLockingThreadSafeSingleton() {
    }

    public static DoubleCheckedLockingThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
