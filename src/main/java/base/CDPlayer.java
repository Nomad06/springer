package base;

import org.springframework.beans.factory.annotation.Autowired;

public class CDPlayer {

    private CompactDisc compactDisc;

    public CDPlayer(CompactDisc cd){
        this.compactDisc = cd;
    }

    public CDPlayer() {
    }

    public CompactDisc getCd() {
        return compactDisc;
    }

    public void setCd(CompactDisc cd) {
        this.compactDisc = cd;
    }
}
