package com.huobanbengkui.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insetTwo() {
        Girl girlA = new Girl();
        girlA.setCupSize("A");
        girlA.setAge(18);
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setCupSize("B");
        girlB.setAge(19);
        girlRepository.save(girlB);
    }

    public void getAge(Integer id) throws Exception {
        Girl girl = girlRepository.findByAge(id).get(0);
        Integer age = girl.getAge();
        if (age < 10) {
            throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
        }else {
            throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
        }
    }

    public List<Girl> findOne(Integer id) {
        return girlRepository.findByAge(id);

    }

}
