package dau;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GoUserRepository extends JpaRepository<GoUsers, Long> {

    GoUsers findGoUsersByLoginId(String loginId);
}
