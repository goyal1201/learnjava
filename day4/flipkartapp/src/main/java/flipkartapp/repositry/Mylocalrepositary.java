package flipkartapp.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import flipkartapp.bean.Customer;

@Repository
public interface Mylocalrepositary extends JpaRepository<Customer,Long>{

}
