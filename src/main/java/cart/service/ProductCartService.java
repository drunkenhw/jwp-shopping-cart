package cart.service;

import cart.entity.Member;
import cart.entity.Product;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductCartService {

    @Transactional(readOnly = true)
    public List<Product> findAllByMember(Member member) {
        return null;
    }
}
