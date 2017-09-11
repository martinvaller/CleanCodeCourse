package ee.comp.myservingpackage;

public class NewBookInfo {
    private String nt;
    private int cp;

    public void setNt(String nt) {
        this.nt = nt;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String modifyNewTitleVolume(int volume){
        return this.nt+" "+volume;
    }

    public String getNt() {
        return nt;
    }

    public int getCp() {
        return cp;
    }
}