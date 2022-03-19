package com.Basic.autowired;

import com.Basic.member.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.lang.Nullable;

import java.util.Optional;

public class AutowiredTest {

    @Test
    void AutowiredOption() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(TestBean.class);
    }

    static class TestBean {
        
        @Autowired(required = false)
        public void setNotBean1(Member notBean1) {
            System.out.println("notBean1 = " + notBean1);
        }
        
        @Autowired
        public void setNoBean2(@Nullable Member notBean2) {
            System.out.println("notBean2 = " + notBean2);
        }
        
        @Autowired
        public void setNoBean3(Optional<Member> noBean3) {
            System.out.println("noBean3 = " + noBean3);
        }

    }
}
