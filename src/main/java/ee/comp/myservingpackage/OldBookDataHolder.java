package ee.comp.myservingpackage;

public class OldBookDataHolder {
    private String ot;
    private int ocp;

    public void setOt(String ot) {
        this.ot = ot;
    }

    public void setOcp(int ocp) {
        this.ocp = ocp;
    }

    public String modifyOldVolume(int volume){
        this.ot = this.ot+" "+volume;
        return this.ot;
    }

    public String getOt() {
        return ot;
    }

    public int getOcp() {
        return ocp;
    }
}
