package observerpattern.jdkobserver;

import java.util.Observable;

/**
 * @author tianyongpeng
 */
public class Watched extends Observable {

    private String data = "";

    public String getData() {
        return data;
    }

    public void setData(String data) {

        if(!this.data.equals(data)){
            this.data = data;
            setChanged();
        }
        notifyObservers();
    }


}