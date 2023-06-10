package advancedWeb.orderSystem.repository;

import advancedWeb.orderSystem.domain.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends JpaRepository<Long, Menu> {
}