package za.ac.cput.vehicledealership.repository;
/*  IContactRepository.java
    Repository Interface for Contact Domain
    Author: Junaid Cedrass (219090912)
    Date: 8 April 2023
*/
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.vehicledealership.domain.Contact;
import za.ac.cput.vehicledealership.domain.User;

import java.util.List;
import java.util.Set;
@Repository
public interface ContactRepository extends JpaRepository<Contact, String> {
    List<Contact> findAllByContactIdIn(List<String> contactIdList);
    boolean existsByValue(String address);
}
