package com.wu.mapper;

import com.wu.pojo.Provider;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author: 吴磊
 * @program: smbms-mvc
 * @create: 2021-01-25 11:28
 */
@Component
public interface ProviderMapper {

    List<Provider> getProviderList(@Param("proName") String proName, @Param("proCode") String proCode);

    Provider getProviderById(@Param("id") int id);

    int modifyProviderById(@Param("provider") Provider provider);

    int deleteProviderById(@Param("id") int id);

    int addProvider(Provider provider);

}
