package Almacen;

public class product extends store{

	private generic<Double,Integer> dp;

	public product() {
		super();
		dp= new generic<>();	
	}
	public product(String code, String name, String descrip,double price,int stock) {
		super(code,name,descrip);
		dp=new generic<>(price,stock);
	}
	public Double getPrecio() {
		return dp.getA1();
	}
	public void setPrecio(Double price) {
		dp.setA1(price);
	}
	public int getStock() {
		return dp.getA3();
	}
	public void setStock(int stock) {
		dp.setA3(stock);
	}
	public String List() {
		return String.format("\n|Código: %s|Nombre: %s |Descripción: %s |Precio: %.2f|Stock: %d|",
				getCode(), getName(), getDescrip(), getPrecio(), getStock());
	}

	public boolean Sales(int sale) {
		int stock = getStock();
		if(stock>=sale) {
			int newstock=stock-sale;
			setStock(newstock);
			System.out.println("\nLa venta fue resgistrada");

			return true;
		}else {
			System.out.print("\nUnidades insuficiente\n");
			return false;
		}
	}
	
	public boolean  Newstock(int nuevo) {
		int stock = getStock();
		int newstock=stock+nuevo;
		setStock(newstock);
		System.out.println("\nUnidades ingresadas con éxito");
		return true;
	}
}
