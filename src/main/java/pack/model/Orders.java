package pack.model;

import javax.persistence.*;

@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String owner;
    @Column
    private String car;
    @Column
    private String date;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId")
    private User user;

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", owner='" + owner + '\'' +
                ", car='" + car + '\'' +
                ", date='" + date + '\'' +
                ", user=" + user +
                '}';
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
