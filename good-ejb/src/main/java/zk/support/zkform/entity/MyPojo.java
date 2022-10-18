package zk.support.zkform.entity;

public class MyPojo {
	private String name = "";
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDebugString() {
		return "MyPojo{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
