package creational.singleton;

/**
 * @author unufolio unufolio@gmail.com
 * @date 2020/09/12
 */
public class StaticBlockSingleton {
    private static StaticBlockSingleton instance = null;

    private StaticBlockSingleton() {
    }

    // static block initialization for exception handling
    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
