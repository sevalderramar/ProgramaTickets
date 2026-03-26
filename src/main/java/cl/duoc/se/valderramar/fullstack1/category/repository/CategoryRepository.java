package cl.duoc.se.valderramar.fullstack1.category.repository;

import cl.duoc.se.valderramar.fullstack1.category.model.CategoryModel;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepository {

    List<CategoryModel> categoryModel;
    private long currentId = 3L;

    public CategoryRepository() {
        categoryModel = new ArrayList<>();
        categoryModel.add(new CategoryModel(
                currentId++,
                "Bug",
                "Problema o error que afecta el funcionamiento esperado"));

        categoryModel = new ArrayList<>();
        categoryModel.add(new CategoryModel(
                currentId++,
                "Feature",
                "Nueva funcionalidad solicitada por el usuario"));

    }

    public List<CategoryModel>getAll(){
        return categoryModel;
    }

    public CategoryModel save(CategoryModel newCategoryModel){
        categoryModel.setId(currentId++);
        categoryModel.add(newCategoryModel);
        return newCategoryModel;
    }


}
