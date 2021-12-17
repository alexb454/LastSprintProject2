package BSTDatabase.Repo;

import BSTDatabase.DataRest.Binary;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "Binary", path = "Binary")
public interface BSTRepo extends PagingAndSortingRepository<Binary, Long> {
    List<Binary> findById(@Param("id") long id);
    List<Binary> findByInput(@Param("input") String input);
}
