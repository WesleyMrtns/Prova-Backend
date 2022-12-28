package br.com.tech4pet.petshop.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import br.com.tech4pet.petshop.model.Pet;

public interface PetRepository extends MongoRepository<Pet, String>{

}
