/**
 * 
 */
package com.example.mybatis3.demo.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.example.mybatis3.demo.domain.Address;

@Mapper
public interface AddressMapper 
{
	@Select("select addr_id as addrId, street, city, state, zip, country from addresses where addr_id=#{id}")
	Address selectAddressById(int id);
}
