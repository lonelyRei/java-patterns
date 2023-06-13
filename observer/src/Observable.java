public interface Observable {
    void registerObserver(Observer observer, NewsTypes newsType);

    void removeObserver(Observer observer, NewsTypes newsType);
    void notifyObservers(PieceOfNews pieceOfNews) throws Exception;
}
