public class PrivateVarAccess {
    private String girlname;

    public void setname(String name) {

        girlname = name;
    }

    public String getname() {

        return girlname;
    }

    public void saying() {

        System.out.printf("she is my freind %s", getname());
    }
}
