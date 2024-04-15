package Almacen;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		ArrayList<product> productos = new ArrayList<>();
		int op;

		do {
			System.out.print("\n\t== Administración de inventario ==\n");
			System.out.print("\n1.- Agregar un nuevo producto");
			System.out.print("\n2.- Mostrar productos disponibles");
			System.out.print("\n3.- Registrar una venta");
			System.out.print("\n4.- Gestionar stock");
			System.out.print("\n0.- Salir");
			System.out.print("\n Ingrese una opcion: ");		
			op=leer.nextInt();
			switch(op) {
			case 1:
				System.out.print("\nIngrese el SKU: ");
				String code=leer.next();
				System.out.print("\nIngrese el nombre del producto: ");
				String name=leer.next();
				System.out.print("\nIngrese la Marca o modelo: ");
				String d=leer.next();			
				System.out.print("\nIngrese el precio: ");
				double price=leer.nextDouble();
				System.out.print("\nIngrese el Stock inicial: ");
				int s=leer.nextInt();

				product p1=new product(code,name,d,price,s);
				productos.add(p1);

				break;
			case 2:
				System.out.print("\nLista de productos:\n");
				for(product p: productos) {
					System.out.println(p.List());
				}
				break; 			
			case 3:
				System.out.print("\nCodigo del producto vendido: ");
				String sale=leer.next();
				for(product p:productos) {
					if(sale.equals(p.getCode())) {
						System.out.print("\nCantidad vendida: ");				
						int can=leer.nextInt();
						p.Sales(can);
					}else if(sale!=p.getCode()) {
						System.out.println("\nProducto no Encontrado\n");
					}
				}

				break;
			case 4:
				System.out.print("\nCodigo del producto: ");
				String codi=leer.next();
				for(product p:productos) {
					if(codi.equals(p.getCode())) {
						System.out.print("\nNueva cantidad en stock: ");				
						int can=leer.nextInt();
						p.Newstock(can);
					}
				}

				break;
			case 0:
				System.out.println("\n\nGracias por usar el programa");
				break;			
			default:
				System.out.println("\nError.. Ingrese una opcion valida\n");
			}
		}while(op!=0);
		leer.close();
	}

}	
