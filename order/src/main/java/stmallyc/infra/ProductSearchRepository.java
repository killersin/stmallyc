package stmallyc.infra;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import stmallyc.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "productSearches",
    path = "productSearches"
)
public interface ProductSearchRepository
    extends PagingAndSortingRepository<ProductSearch, Long> {}
