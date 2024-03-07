public class Album {

    public String genero;
    public int ano;

    public String nome;

    public Pessoa artista;

    public Musica[] musicas;


    public void mostraTodosOsDados(){

        System.out.println(this.genero);
        System.out.println(this.ano);
        System.out.println(this.nome);
        System.out.println(this.artista.nome);
        System.out.println("musica: ");
        for(Musica musica: musicas){

            System.out.print(musica.titulo);

        }

    }




}
