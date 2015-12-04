package assi.rubydata.net.myapplication;

/**
 * Created by Ngoc on 12/3/2015.
 */
public class classObj {

    @Override
    public String toString() {
        return "Lớp: " + name + " -- " + "Niên khóa: " + years;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYears() {
        return years;
    }

    public void setYears(String years) {
        this.years = years;
    }

    private String id;
    private String name;
    private String years;

}
