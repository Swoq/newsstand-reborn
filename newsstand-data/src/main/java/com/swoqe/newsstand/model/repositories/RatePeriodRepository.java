import com.swoqe.newsstand.model.domain.Rate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatePeriodRepository extends JpaRepository<Rate, Long> {
}
