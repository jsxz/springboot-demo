package vip.anjun.mybatis_two.db2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.anjun.mybatis_two.db2.dao.MoneyDao;
import vip.anjun.mybatis_two.domain.Money;

@Service
public class MoneyService {
    @Autowired
    private MoneyDao moneyDao;

    /**
     * 根据名字查找用户
     */
    public Money selectMoneyById(int id) {
        return moneyDao.findMoneyById(id);
    }

}


