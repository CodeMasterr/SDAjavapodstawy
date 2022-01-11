package JavaZaawansowana.dzien1;

public interface Flying<T> {

    T raise();
    void land();

    static int getPullUp(){
        return 10;
    }
    default int range(){
        return 10;
    }


}
