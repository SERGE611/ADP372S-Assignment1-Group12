package za.ac.cput.vehicledealership.repository;
/*  IUserRepository.java
    Repository Interface for User Domain
    Author: Junaid Cedrass (219090912)
    Date: 6 April 2023
*/
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.vehicledealership.domain.Contact;
import za.ac.cput.vehicledealership.domain.Employee;
import za.ac.cput.vehicledealership.domain.User;

import java.util.List;
import java.util.Set;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
//    User findUserByContact_EmailAddress(String emailAddress);
//    Boolean existsByContact_EmailAddress(String emailAddress);

}
