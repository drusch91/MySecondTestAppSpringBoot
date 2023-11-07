package ru.example2.SecondTestAppSpringBoot.Service;

import org.springframework.stereotype.Service;
import ru.example2.SecondTestAppSpringBoot.Model.Request;

@Service
public interface ModifyRequestService {

    void modify(Request request);
}
