package co.com.sofka.crud.Repositories;

import co.com.sofka.crud.Entidades.GroupList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupListRepository extends CrudRepository<GroupList, Long> {
}
