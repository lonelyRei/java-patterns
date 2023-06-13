public class Reader implements  Observer{
    private String name;
    public Reader(String name) {
        this.name = name;
    }
    @Override
    public void update(PieceOfNews pieceOfNews) throws Exception {
        if (pieceOfNews.content.length() == 0) {
            throw new Exception("Длина новости должна быть больше 0");
        }
        System.out.println("====================================");
        System.out.println(this.name + " получает от издательства новость на тему: " + pieceOfNews.type);
        System.out.println("Содержание новости: " + pieceOfNews.content);
        System.out.println("====================================");
    }

}
