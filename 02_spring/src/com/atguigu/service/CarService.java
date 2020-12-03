package com.atguigu.service;

import com.atguigu.dao.CarDao;
import com.atguigu.dao.CarDaoExt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author Symon
 * @version 1.0
 * @className CarService
 * @description TODO
 * @date 2020/10/29 10:31
 */
@Service
public class CarService {

    public CarService() {
        System.out.println("CarService构造器");
    }

    @Autowired()
    @Qualifier("carDaoExt")
    private CarDao carDao1;

    @Autowired
    private CarDaoExt carDaoExt;

    @Override
    public String toString() {
        return "CarService{" +
                "carDao=" + carDao1 +
                ", carDaoExt=" + carDaoExt +
                '}';
    }

    /*@Autowired
    public void abc(@Qualifier("carDao") CarDao carDao) {
        System.out.println(" abc() --->>> " + carDao);
        this.carDao1 = carDao;
    }*/
}
