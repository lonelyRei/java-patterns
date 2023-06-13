public class Main {
    public static void main(String[] args) throws Exception {
        Publishing publishing = new Publishing();

        Reader nikita = new Reader("Nikita");
        Reader daniil = new Reader("Daniil");
        Reader anon = new Reader("anon");
        Reader anon2 = new Reader("anon2");

        publishing.registerObserver(nikita, NewsTypes.MUSIC_NEWS);
        publishing.registerObserver(daniil, NewsTypes.SPORT_NEWS);
        publishing.registerObserver(anon, NewsTypes.POLITICAL_NEWS);
        publishing.registerObserver(anon2, NewsTypes.POLITICAL_NEWS);

        publishing.setNewPieceOfNews(new PieceOfNews(NewsTypes.POLITICAL_NEWS, ""));
        publishing.setNewPieceOfNews(new PieceOfNews(NewsTypes.MUSIC_NEWS, "Lil peep умер (грустно)"));
        publishing.setNewPieceOfNews(new PieceOfNews(NewsTypes.SPORT_NEWS, "Футболисты снова проиграли всем, кому можно (жалко)"));
        publishing.setNewPieceOfNews(new PieceOfNews(NewsTypes.MUSIC_NEWS, "JuiceWrld умер (грустно)"));
    }
}

