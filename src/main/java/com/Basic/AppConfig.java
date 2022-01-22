package com.Basic;

import com.Basic.discount.DiscountPolicy;
import com.Basic.discount.RateDiscountPolicy;
import com.Basic.member.MemberRepository;
import com.Basic.member.MemberService;
import com.Basic.member.MemberServiceImpl;
import com.Basic.member.MemoryMemberRepository;
import com.Basic.order.OrderService;
import com.Basic.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(getMemberRepository());
    }

    @Bean
    public MemberRepository getMemberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(getMemberRepository(), discountPolicy());

    }

    @Bean
    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }

}
