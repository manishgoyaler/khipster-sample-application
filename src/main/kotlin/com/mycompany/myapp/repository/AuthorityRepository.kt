package com.mycompany.myapp.repository

import com.mycompany.myapp.domain.Authority
import org.springframework.data.mongodb.repository.ReactiveMongoRepository

/**
 * Spring Data MongoDB repository for the [Authority] entity.
 */

interface AuthorityRepository : ReactiveMongoRepository<Authority, String>
