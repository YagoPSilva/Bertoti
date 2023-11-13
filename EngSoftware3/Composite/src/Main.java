public class Main {
    public static void main(String[] args) {
        Jogos mario = new Jogo("Super Mario Bros.", "1985", "Plataforma");
        Jogos zelda = new Jogo("The Legend of Zelda", "1986", "Ação/Aventura");
        Jogos metroid = new Jogo("Metroid", "1986", "Ação/Plataforma");

        GrupoJogos grupoNintendo = new GrupoJogos();
        grupoNintendo.adicionarJogo(mario);
        grupoNintendo.adicionarJogo(zelda);
        grupoNintendo.adicionarJogo(metroid);

        Jogos donkeyKong = new Jogo("Donkey Kong", "1981", "Arcade/Plataforma");

        GrupoJogos todosJogos = new GrupoJogos();
        todosJogos.adicionarJogo(grupoNintendo);
        todosJogos.adicionarJogo(donkeyKong);

        System.out.println("Grupo de Jogos:");
        todosJogos.mostrarDetalhes();
    }
}
