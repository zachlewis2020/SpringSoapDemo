package zac.soap.demo.server;

public class MyData {
    private Long id;
    private String data;

    public MyData() {
        super();
    }

    public MyData(Long id, String data) {
        super();
        this.id = id;
        this.data = data;
    }

    public MyData(String data) {
        super();
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return String.format("Data [id=%s, data=%s]", id, data);
    }

}
