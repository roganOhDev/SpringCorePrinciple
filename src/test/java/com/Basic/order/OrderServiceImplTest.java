package com.Basic.order;

import com.Basic.discount.FixDiscountPolicy;
import com.Basic.member.Grade;
import com.Basic.member.Member;
import com.Basic.member.MemoryMemberRepository;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OrderServiceImplTest {

    @Test
    void createOrder() {
        MemoryMemberRepository memberRepository = new MemoryMemberRepository();
        memberRepository.save(new Member(1L, "a", Grade.VIP));

        OrderServiceImpl orderService = new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
        Order order = orderService.createOrder(1L, "a", 100);
        assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }

}