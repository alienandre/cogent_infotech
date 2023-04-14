package cogent.infotech.com.service;

public class MovieNotFoundException extends Exception { 
    public MovieNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
