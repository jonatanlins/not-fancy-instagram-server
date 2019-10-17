package com.ServerSpring.Instagrao.repository;

import com.ServerSpring.Instagrao.models.Instagrao;
import org.springframework.data.mongodb.repository.MongoRepository;



public interface InstagraoRepository extends MongoRepository<Instagrao, String> {

}
