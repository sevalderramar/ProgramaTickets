package cl.duoc.se.category.service;

import cl.duoc.se.category.model.CategoryModel;
import cl.duoc.se.category.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private CategoryRepository repository;

    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    public List<CategoryModel> getCategories(){
        return this.repository.getAll();
    }

    public CategoryModel create(CategoryModel categoryModel){
        CategoryModel savedCategory = this.repository.save(categoryModel);
        if (savedCategory != null) {
            return savedCategory;
        }
        return null;
    }
}