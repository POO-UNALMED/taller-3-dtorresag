package taller3.televisores;

public class Control {
	TV tv;


	public void enlazar(TV tv) {
		this.tv = tv;
		this.tv.control=this;
	}


	public TV getTv() {
		return tv;
	}


	public void setTv(TV tv) {
		this.tv = tv;
	}
	
	public void turnOff() {
		tv.estado=false;
	}
	
	public void turnOn() {
		tv.estado=true;
	}
	
	public void canalUp() {
		int x=tv.canal+1;
		if(tv.estado&&x>=1&&x<=120) {
			tv.setCanal(x);
		}
	}
	
	public void canalDown() {
		int x=tv.canal-1;
		if(tv.estado&&x>=1&&x<=120) {
			tv.setCanal(x);
		}
	}
	
	public void volumenUp() {
		int x=tv.volumen+1;
		if(tv.estado&&x>=0&&x<=7) {
			tv.setVolumen(x);
		}
	}
	
	public void volumenDown() {
		int x=tv.volumen-1;
		if(tv.estado&&x>=0&&x<=7) {
			tv.setVolumen(x);
		}
	}
	
	public void setCanal(int x) {
		tv.setCanal(x);
	}
}
