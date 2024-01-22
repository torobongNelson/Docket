package com.praisebassey.docket.Repositories;

import com.praisebassey.docket.Models.SupportBuddy;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupportBuddyRepository extends MongoRepository<SupportBuddy,String> {

}
