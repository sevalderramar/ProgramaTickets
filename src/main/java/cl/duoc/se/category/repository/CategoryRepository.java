package cl.duoc.se.category.repository;

import cl.duoc.se.category.model.CategoryModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CategoryRepository {

    List<CategoryModel> categoryModel;

    private long currentId = 3L;

    public CategoryRepository() {
        categoryModel = new ArrayList<>();
        categoryModel.add(new CategoryModel(
                currentId++,
                "Bug",
                "Problema o error que afecta el funcionamiento esperado"));

        categoryModel.add(new CategoryModel(
                currentId++,
                "Feature",
                "Nueva funcionalidad solicitada por el usuario"));

    }
    public List<CategoryModel>getAll(){
        return categoryModel;
    }

    public CategoryModel save(CategoryModel newCategoryModel){
        newCategoryModel.setId(currentId++);
        categoryModel.add(newCategoryModel);
        return newCategoryModel;
    }


}
