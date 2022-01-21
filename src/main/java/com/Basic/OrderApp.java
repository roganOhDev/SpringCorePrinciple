package com.Basic;

import com.Basic.member.Grade;
import com.Basic.member.Member;
import com.Basic.member.MemberService;
import com.Basic.member.MemberServiceImpl;
import com.Basic.order.Order;
import com.Basic.order.OrderService;
import com.Basic.order.OrderServiceImpl;

public class OrderApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "memberA", 10000);

        System.out.println("order = " + order);
        System.out.println("order.calculatePrice = " + order.calculatePrice());
    }
}
