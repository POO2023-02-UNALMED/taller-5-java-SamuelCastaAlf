package zooAnimales;
import java.util.ArrayList;

public class Reptil extends Animal{
	private static ArrayList<Reptil> listado = new ArrayList<Reptil>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil(String nombre,int edad,String habitat,String genero,String colorEscamas,int largoCola){
		super(nombre,edad,habitat,genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);
	}
	public Reptil(){
		listado.add(this);
	}

	public static int cantidadReptiles(){
		return listado.size();
	}

	@Override
	public String movimiento(){
		return "reptar";
	}

	public static Reptil crearIguana(String nombre,int edad,String genero){
		Reptil iguana = new Reptil(nombre,edad,"humedal",genero,"verde",3);
		iguanas += 1;
		return iguana;
	}

	public static Reptil crearSerpiente(String nombre, int edad,String genero){
		Reptil serpiente = new Reptil(nombre,edad,"jungla",genero,"blanco",1);
		serpientes += 1;
		return serpiente;
	}

	public static ArrayList<Reptil> getListado(){
		return listado;
	}

	public static void setListado(ArrayList<Reptil> listado){
		Reptil.listado = listado;
	}

	public String getColorEscamas(){
		return this.colorEscamas;
	}

	public void setColorEscamas(String colorEscamas){
		this.colorEscamas = colorEscamas;
	}

	public int getLargoCola(){
		return this.largoCola;
	}

	public void setLargoCola(int largoCola){
		this.largoCola = largoCola;
	}
}