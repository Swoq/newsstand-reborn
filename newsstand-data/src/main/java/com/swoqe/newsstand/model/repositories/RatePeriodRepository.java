import com.swoqe.newsstand.model.domain.FinancialTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatePeriodRepository extends JpaRepository<FinancialTransaction, Long> {
}
