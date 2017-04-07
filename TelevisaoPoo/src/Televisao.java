//classe
public class Televisao {
	//atributos
	boolean status;
	String marca;
	double polegada;
	String qualidadeImagem;
	boolean smart;
	int volume;
	double canal;
	
	//construtor
	Televisao() {
		
	}
	
	//metodo
	//tipoDeRetorno nomeDoMetodo() {}
	double maisCanal() {
		//canal++
		canal = canal + 1;
		return canal;
	}
	
	double menosCanal() {
		//canal--
		canal = canal - 1;
		return canal;
	}
	
	int maisVolume() {
		volume = volume + 1;
		return volume;
	}
	
	int menosVolume() {
		volume = volume - 1;
		return volume;
	}
	
	boolean ligaTv() {
		status = true;
		return status;
	}
	
	boolean desligaTv() {
		status = false;
		return status;
	}
}
