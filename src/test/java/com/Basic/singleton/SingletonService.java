package com.Basic.singleton;

public class SingletonService {

    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService() {
        // 다른곳에서 new SingletonService() 를 실행할 수 없다.
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
