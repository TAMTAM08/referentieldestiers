package ecolededev.pe.domaine;

import org.springframework.data.jpa.repository.JpaRepository;

import ecolededev.pe.account.Account;

public interface ContactRepository  extends JpaRepository<Contact, Long> {

}
