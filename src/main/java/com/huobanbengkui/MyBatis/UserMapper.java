package com.huobanbengkui.MyBatis;

import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User Sel(int id);
}
