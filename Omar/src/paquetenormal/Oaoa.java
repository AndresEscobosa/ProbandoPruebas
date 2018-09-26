package paquetenormal;

public class Oaoa {
	int edad;
	String apodo;
	
	public Oaoa(int edad) {
		this.edad=edad;
	}
	
	public  int dobleEdad(int edad) {
		int dobleEdad= edad*2;
		return dobleEdad;
	}
	public void setApodo(String apodo) {
		this.apodo=apodo;
	}
	public String getApodo(){
		return apodo;
	}

	@Override
	public String toString() {
		return "Oaoa [edad=" + edad + ", apodo=" + apodo + "]";
	}
	

}
