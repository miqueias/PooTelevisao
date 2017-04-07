public class Aplicacao {
	public static void main(String[] args) {
		//criando objetos
		Televisao tv;
		tv = new Televisao();
		//. (ponto)
		tv.marca = "LG";
		tv.maisVolume();
		tv.maisVolume();
		tv.maisCanal();
		System.out.println("A marca da TV 1 é :" + tv.marca);
		System.out.println("O canal da TV 1 é :" + tv.canal);
		System.out.println("O volume da TV 1 é :" + tv.volume);
				
		Televisao tv2;
		tv2 = new Televisao();
		tv2.marca = "SONY";
		tv2.maisCanal();
		tv2.maisCanal();
		tv2.maisVolume();
		System.out.println("A marca da TV 2 é :" + tv2.marca);
		System.out.println("O canal da TV 2 é :" + tv2.canal);
		System.out.println("O volume da TV 2 é :" + tv2.volume);
		
		

	}

}
