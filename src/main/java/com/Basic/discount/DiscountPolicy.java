package com.Basic.discount;

import com.Basic.member.Member;

public interface DiscountPolicy{

    int discount(Member member, int price);
}
