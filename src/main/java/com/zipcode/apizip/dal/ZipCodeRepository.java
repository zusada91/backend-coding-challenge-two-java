package com.zipcode.apizip.dal;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.apicode.apizip.model.ZipCode;

//import com.journaldev.bootifulmongodb.model.User;

@Repository
public interface ZipCodeRepository extends MongoRepository<ZipCode, String> {

	//ZipCode findOne(String userId);
}

