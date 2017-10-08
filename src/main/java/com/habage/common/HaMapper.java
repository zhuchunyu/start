package com.habage.common;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface HaMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
