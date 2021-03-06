//package org.ehsan.config.mongodb
//
//import com.mongodb.client.MongoClient
//import com.mongodb.client.MongoDatabase
//import org.springframework.data.mongodb.core.SimpleMongoClientDbFactory
//
//class MultiTenantMongoDbFactory(
//    mongoClient: MongoClient,
//    dbName: String
//) : SimpleMongoClientDbFactory(mongoClient, dbName) {
//    private val defaultDB = "test"
//
//    override fun getMongoDatabase(): MongoDatabase {
//        return super.getMongoDatabase(defaultDB)
//    }
//}
