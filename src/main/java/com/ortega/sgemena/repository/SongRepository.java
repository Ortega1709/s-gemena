package com.ortega.sgemena.repository;


import com.ortega.sgemena.models.Song;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface SongRepository extends MongoRepository<Song, UUID> {

}
