package com.findbestdeal.backend.domain.cart.dao;

import com.findbestdeal.backend.domain.cart.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface CartDao extends CrudRepository<Cart, Long> {
    @Override
    List<Cart> findAll();
}
