public abstract class User {
    //attributes
    private String id;
    private String name;

    //constructor
    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    //getter and setter
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setId(String Id){
        this.id=Id;
    }

    //methods
    public abstract void homeScreen();


}
