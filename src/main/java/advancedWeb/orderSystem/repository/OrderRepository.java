package advancedWeb.orderSystem.repository;

import advancedWeb.orderSystem.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Long, Order> {

}