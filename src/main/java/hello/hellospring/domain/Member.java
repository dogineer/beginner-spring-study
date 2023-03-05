package hello.hellospring.domain;

public class Member {

    private long id;
    private String name;
    private String nickName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNickName(String nickName){
        this.nickName = nickName;
    }
}
