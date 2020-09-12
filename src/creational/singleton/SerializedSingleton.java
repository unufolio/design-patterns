package creational.singleton;

import java.io.Serializable;

/**
 * @author unufolio unufolio@gmail.com
 * @date 2020/09/12
 */
public class SerializedSingleton implements Serializable {

    private static final long serialVersionUID = -1578636613942129422L;

    private SerializedSingleton() {
    }

    private static class SingletonHolder {
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance() {
        return SingletonHolder.instance;
    }

    protected Object readResolve() {
        return getInstance();
    }
}
