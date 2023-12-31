package com.wu.mapper;

import com.wu.pojo.Bill;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author: 吴磊
 * @program: smbms-mvc
 * @create: 2021-01-25 11:28
 */
@Component
public interface BillMapper {
    int getBillCountByProviderId(@Param("providerId") int providerId);

    List<Bill> getBillList(@Param("productName") String productName,
                           @Param("providerId") int providerId,
                           @Param("isPayment") int isPayment
    );


    Bill getBillById(@Param("id") int id);

    int modifyBillById(Bill bill);

    int deleteBillById(@Param("id") int id);

    int addBill(Bill bill);

}
