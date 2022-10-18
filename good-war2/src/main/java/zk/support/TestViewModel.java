package zk.support;

import org.zkoss.bind.annotation.*;
import org.zkoss.zk.ui.util.Clients;
import zk.support.zkform.entity.MyPojo;

public class TestViewModel {

	private boolean editing = false;

	private MyPojo myPojo;

	@Init
	public void init() {
		myPojo = new MyPojo();
	}

	@Command
	@NotifyChange("editing")
	public void edit() {
		editing = !editing;
	}

	@Command
	public void cancel() {
		Clients.log("cancelled: " + myPojo.getDebugString());
	}

	@Command
	public void save() {
		Clients.log("saved: " + myPojo.getDebugString());
	}

	public boolean isEditing() {
		return editing;
	}

	public MyPojo getMyPojo() {
		return myPojo;
	}

	public Size[] getSize(){
		return Size.values();
	}
}

