package com.Basic;

import com.Basic.discount.DiscountPolicy;
import com.Basic.discount.FixDiscountPolicy;
import com.Basic.discount.RateDiscountPolicy;
import com.Basic.member.MemberRepository;
import com.Basic.member.MemberService;
import com.Basic.member.MemberServiceImpl;
import com.Basic.member.MemoryMemberRepository;
import com.Basic.order.OrderService;
import com.Basic.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(getMemberRepository());
    }

    private MemberRepository getMemberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService() {
        return new OrderServiceImpl(getMemberRepository(), discountPolicy());

    }

    private DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }

}
