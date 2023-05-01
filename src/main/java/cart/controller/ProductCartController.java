package cart.controller;

import cart.auth.AuthPrincipal;
import cart.controller.dto.CartResponse;
import cart.entity.Member;
import cart.service.ProductCartService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/carts")
@RestController
public class ProductCartController {

    private final ProductCartService productCartService;

    public ProductCartController(ProductCartService productCartService) {
        this.productCartService = productCartService;
    }

    @GetMapping
    public ResponseEntity<CartResponse> findMyCart(@AuthPrincipal Member member) {
        productCartService.findAllByMember(member);
        return null;
    }
}
