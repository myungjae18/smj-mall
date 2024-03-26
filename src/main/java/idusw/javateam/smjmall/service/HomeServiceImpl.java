package idusw.javateam.smjmall.service;

import org.springframework.stereotype.Service;

@Service
public class HomeServiceImpl implements HomeService {
    @Override
    public void sayHello() {
        System.out.println("hello");
    }
}
