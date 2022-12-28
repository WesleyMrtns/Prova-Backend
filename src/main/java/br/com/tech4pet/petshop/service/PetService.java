package br.com.tech4pet.petshop.service;
import java.util.List;
import java.util.Optional;
import br.com.tech4pet.petshop.model.Pet;

public interface PetService {
    List<Pet> obterTodosOsPets();
    Optional<Pet> obterPetPorId(String id);
    void excluirPetPorId(String id);
    Pet cadastrarPet(Pet pet);
    Optional<Pet> atualizarPetPorId(String id, Pet pet);
    
}
