import br.com.forumhub.api.domain.topico.Topico;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TopicoRepository extends JpaRepository<Topico, Long> {
}
