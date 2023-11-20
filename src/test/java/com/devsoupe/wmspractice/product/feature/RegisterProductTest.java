package com.devsoupe.wmspractice.product.feature;

import com.devsoupe.wmspractice.common.APITest;
import com.devsoupe.wmspractice.product.domain.ProductRepository;
import com.devsoupe.wmspractice.product.feature.api.RegisterProductApi;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

class RegisterProductTest extends APITest {
    @Autowired
    private ProductRepository productRepository;

    @Test
    @DisplayName("상품을 등록한다.")
    void registerProdcut() {
        // given
        new RegisterProductApi().request();

        // then
        assertThat(productRepository.findAll()).hasSize(1);
    }

}
