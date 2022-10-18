package zk.support;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.*;

public class MyComposer extends SelectorComposer {

    @Wire
    private Listbox box;

    @Override
    public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp);
        box.setModel(new ListModelList<>(Size.values()));
    }
}
