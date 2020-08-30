package taller3.televisores;

public class TV {
	
	Marca marca;
	int canal=1;
	int precio=500;
	boolean estado;
	int volumen=1;
	Control control;
	static int numTV;
	
	public static int getNumTV() {
		return numTV;
	}
	
	public boolean getEstado() {
		return estado;
	}
	public TV(Marca marca, boolean estado) {
		super();
		this.marca = marca;
		this.estado = estado;
		numTV++;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getVolumen() {
		return volumen;
	}
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	public Control getControl() {
		return control;
	}
	public void setControl(Control control) {
		this.control = control;
	}
	
	public void turnOff() {
		estado=false;
	}
	
	public void turnOn() {
		estado=true;
	}
	
	public void canalUp() {
		int x=canal+1;
		if(estado&&x>=1&&x<=120) {
			setCanal(x);
		}
	}
	
	public void canalDown() {
		int x=canal-1;
		if(estado&&x>=1&&x<=120) {
			setCanal(x);
		}
	}
	
	public void volumenUp() {
		int x=volumen+1;
		if(estado&&x>=0&&x<=7) {
			setVolumen(x);
		}
	}
	
	public void volumenDown() {
		int x=volumen-1;
		if(estado&&x>=0&&x<=7) {
			setVolumen(x);
		}
	}

	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
	}
		
	
}
