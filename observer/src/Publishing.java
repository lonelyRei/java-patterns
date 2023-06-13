import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Publishing implements Observable{
    private Map<NewsTypes, List<Observer>> readers;
    private List<PieceOfNews> news;

    public Publishing(){
        this.readers = new HashMap<>();
        this.news = new ArrayList<>();
    }

    public void setNewPieceOfNews(PieceOfNews pieceOfNews) throws Exception {
        this.news.add(pieceOfNews);
        this.notifyObservers(pieceOfNews);
    }

    @Override
    public void registerObserver(Observer o, NewsTypes type) {
        List<Observer> oldObservers = this.readers.get(type);
        if (oldObservers == null) {
            oldObservers = new ArrayList<>();
        }
        oldObservers.add(o);
        this.readers.put(type, oldObservers);
    }

    @Override
    public void removeObserver(Observer o, NewsTypes type) {
        List<Observer> oldObservers = this.readers.get(type);
        oldObservers.remove(o);
        this.readers.put(type, oldObservers);
    }

    @Override
    public void notifyObservers(PieceOfNews pieceOfNews) throws Exception {
        List<Observer> observers = this.readers.get(pieceOfNews.type);
        for (Observer o: observers) {
            try {
                o.update(pieceOfNews);
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Укажите сообщение");
            }

        }
    }

}
