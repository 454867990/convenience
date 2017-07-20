package applicationName.zdm.model;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/7/19 0019.
 */
@Entity
@Table
public class Cat{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
