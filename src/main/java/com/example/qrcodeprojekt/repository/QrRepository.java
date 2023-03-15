package com.example.qrcodeprojekt.repository;

import com.example.qrcodeprojekt.entity.ItemOnStockEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository                                                                                                             // "hey java, this is a repository (or a Query in mysql) whatev man."
public interface QrRepository extends JpaRepository <ItemOnStockEntity, Integer>{                                       // lalala random bullshit jk this line does the hard work. it defines the Repository (query) as a ... repository
     @Query(value = "select * from itemonstock where IDFSqrcode = ?1", nativeQuery = true)                              // this line says what query code should be executed when the method below plays.
     ItemOnStockEntity findItemByQrcodeId(int IDFSqrcode);                                                              // this line here defined what parameters come in the method that should be passed.
}
