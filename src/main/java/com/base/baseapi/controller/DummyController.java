package com.base.baseapi.controller;

import com.base.baseapi.dto.DummyObject;
import com.base.baseapi.model.request.CreateDummyRequest;
import com.base.baseapi.repository.DummyRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



//curl -H "Content-Type: application/json" -X POST http://localhost:8080/dummies -d '{"name":"dummy1"}'
@RestController
@RequestMapping("/dummies")
public class DummyController {

//    @Autowired or init bean in constructor to understand used
    private final DummyRepository dummyRepository;

    public DummyController(DummyRepository dummyRepository) {
        this.dummyRepository = dummyRepository;
    }

    @PostMapping
    void CreateDummy(@RequestBody CreateDummyRequest createDummyRequest) {
        DummyObject dummyObject = new DummyObject();
        dummyObject.setName(createDummyRequest.name());

        dummyRepository.save(dummyObject);
    }

}
