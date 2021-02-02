package com.industry.dao.account;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.industry.dto.account.ParamsTO;
import com.industry.dto.account.PreviewTO;

@Mapper
public class AccountMapper {
	List<PreviewTO> getAccountSearchList(ParamsTO paramsTO);

}
