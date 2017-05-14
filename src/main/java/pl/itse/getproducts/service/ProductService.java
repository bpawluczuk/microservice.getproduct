package pl.itse.getproducts.service;

import org.springframework.stereotype.Service;
import pl.itse.getproducts.domain.BaseEntity;
import pl.itse.getproducts.domain.Product;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Borys on 2017-05-13.
 */
@Service
@Transactional
public class ProductService {

    @PersistenceContext
    EntityManager em;

    public List<Product> findAll() {
        return em.createQuery("select o from Product o where o.entityStatus=:active").setParameter("active", BaseEntity.EntityStatus.ACTIVE).getResultList();
    }
}
