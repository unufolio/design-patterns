package creational.singleton;

/**
 * @author unufolio unufolio@gmail.com
 * @date 2020/09/12
 */
public class BillPughSingleton {

    private BillPughSingleton() {
    }

    private static class LazyHolder {
        private static final BillPughSingleton instance = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return LazyHolder.instance;
    }
}
