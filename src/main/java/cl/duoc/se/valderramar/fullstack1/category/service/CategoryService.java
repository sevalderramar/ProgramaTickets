package cl.duoc.se.valderramar.fullstack1.category.service;

import cl.duoc.se.valderramar.fullstack1.category.model.CategoryModel;
import cl.duoc.se.valderramar.fullstack1.category.repository.CategoryRepository;
import cl.duoc.sevalderramar.fullstack1.tickets.model.TicketModel;
import cl.duoc.sevalderramar.fullstack1.tickets.repository.TicketRepository;

import java.util.List;

public class CategoryService {
    private CategoryRepository repository;

    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    public List<CategoryModel> geTickets(){
        return this.repository.getAll();
    }

    public CategoryModel create(CategoryModel categoryModel){
        boolean exists = this.repository.existsByTitle(categoryModel);
        if (exists) {
            return categoryModel;
        }
}
