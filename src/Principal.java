
public class Principal {

	public static void main(String[] args) {
		Coordenada p1;
		p1 = new Coordenada();
		
		Coordenada p2 = new Coordenada(20,30);
		Rectangulo r1 = new Rectangulo(p1,p2);
		Rectangulo r2 = new Rectangulo (new Coordenada(-5,-10), new Coordenada(3.2,-7));
		
		System.out.println(p1);
		System.out.println(p2);
		//*VERIFICADOR PARTE//*
		verificador r1 = new verificador(),r1 = new verificador(),
				p2 = new verificador(),p2 = new verificador();
		p1.x= 0;p1.y= 10; p1.x= 10;p1.y=0;
		p2.x=5;p2.y=5; p2.x=15;p2.y=0;
		
			if (RectanguloSobre(r1, p2, r2)) 
			{
				System.out.println("Los rectangulo estan uno  sobre el otro");
			}else {
				System.out.println("Los rectangulo no estan uno sobre el otro");
			}
				
	}
}
