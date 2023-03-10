package zk.support;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zul.Label;
import zk.support.zkform.entity.MyPojo;

import java.util.List;

public class ClassLoaderComposer extends SelectorComposer {

    @Override
    public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp);
        printClassLoaders(this.getClass());
        printClassLoaders(MyPojo.class);
    }

    void printClassLoaders(Class baseClass){
        List<ClassLoader> classLoaders = ClassLoaderTracer.getClassLoaders(baseClass);
        StringBuffer result = new StringBuffer();
        result.append("[" + baseClass.getName() + "]: ");
        classLoaders.forEach(classLoader -> result.append(classLoader.toString() + " ==> "));

        new Label(result.toString() + "\n").setPage(getPage());

    }
}
