package pro.sky.skyprospringdemo.exeptions;

public class BadPersonNumberExeption extends RuntimeException {
    public BadPersonNumberExeption( String message ) {
        super(message);
    }
}
