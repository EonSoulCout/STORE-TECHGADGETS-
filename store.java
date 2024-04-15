package Almacen;

public class store {

	private generic<String,String> da;

	public store() {
		super();
		da= new generic<>();	
	}

	public store(String code, String name,String descrip) {
		da = new generic<>(code, name, descrip);

	}

	public store(String...data) {
		da=new generic<>(data[0],data[1],data[2]);

	}

	public String getCode() {
		return da.getA1();
	}
	public void setCode(String mcode) {
		da.setA1(mcode);
	}
	public String getName() {
		return da.getA2();
	}
	public void setName(String name) {
		da.setA2(name);
	}
	public String getDescrip() {
		return da.getA3();
	}
	public void setDescrip(String descrip) {
		da.setA3(descrip);
	}

}
