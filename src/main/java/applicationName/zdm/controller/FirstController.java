package applicationName.zdm.controller;

import applicationName.zdm.model.Cat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;

/**
 * Created by Administrator on 2017/7/19 0019.
 */
@RestController
public class FirstController {
    @PersistenceContext
    private EntityManager entityManager;

    @RequestMapping("/testC")
    public String getFolwer(){
        Cat cat = new Cat();
        cat.setName("可爱猫咪");
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(cat);
        transaction.commit();

        return "<head>ai</head>";
    }
}
