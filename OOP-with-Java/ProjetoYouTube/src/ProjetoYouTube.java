
public class ProjetoYouTube {

	public static void main(String[] args) {
					
		Video v[] = new Video[3];
		
		v[0] = new Video("Aula 1 de POO");
		v[1] = new Video("Aula 12 de PHP");
		v[2] = new Video("Aula 10 de HTML5");
		
		
		Gafanhoto g[] = new Gafanhoto[2];
		g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
		g[1] = new Gafanhoto("Creuza", 23, "F", "loka");
		
		Visualizacao vis[] = new Visualizacao[5];
		vis[0] = new Visualizacao(g[0], v[2]);//Jubilei assiste HTML5
		vis[0].avaliar();
		System.out.println(vis[0].toString());
		
		vis[1] = new Visualizacao(g[0], v[1]); //Jubilei assiste PHP
		vis[0].avaliar(87.0f);
		System.out.println(vis[1].toString());
		
//		System.out.println("VIDEOS\n-----------------------");
//		System.out.println(v[0].toString());
//		System.out.println(v[1].toString());
//		System.out.println(v[2].toString());
//		System.out.println("\nGAFANHOTOS\n------------------");
//		System.out.println(g[0].toString());
//		System.out.println(g[1].toString());
		
		
		

	}

}
