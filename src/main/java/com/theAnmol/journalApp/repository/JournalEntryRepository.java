package com.theAnmol.journalApp.repository;

import com.theAnmol.journalApp.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

//                                                             <Jispr kaam kr rhe , Id(Jo hai String type)>
public interface JournalEntryRepository extends MongoRepository<JournalEntry , ObjectId> {

}
