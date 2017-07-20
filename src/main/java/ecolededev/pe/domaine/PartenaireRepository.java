package ecolededev.pe.domaine;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PartenaireRepository extends JpaRepository<Partenaire, Long> {
	
	Partenaire findOneByPartenaire (String partenaire);

} // interface
