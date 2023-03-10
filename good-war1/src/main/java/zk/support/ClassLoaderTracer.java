package zk.support;

import java.util.*;

public class ClassLoaderTracer {


    public static List<ClassLoader> getClassLoaders(Class baseClass){
        List list = new LinkedList<ClassLoader>();
        ClassLoader classLoader = baseClass.getClassLoader();
        do{
            list.add(classLoader);
            classLoader = classLoader.getParent();
        }while(classLoader != null);
        return list;
    }
    public static void main(String[] args) throws ClassNotFoundException {
        getClassLoaders(ClassLoaderTracer.class).forEach(System.out::println);

        System.out.println(">> " + System.getProperty("sun.boot.library.path"));
        System.out.println(">> " + System.getProperty("java.class.path"));
    }
}
