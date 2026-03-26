package cl.duoc.se.category.controller;

import cl.duoc.se.category.model.CategoryModel;
import cl.duoc.se.category.service.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    private CategoryService service;

    public CategoryController(CategoryService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity <List<CategoryModel>> getAllCategories(){  //Se utilizó copilot para resolver la lógica y sintaxis de "ResponseEntity"
        return ResponseEntity.ok(service.getCategories());
    }

    @PostMapping
    public ResponseEntity<CategoryModel> created(@RequestBody CategoryModel category){  //Se utilizó copilot para resolver la lógica y sintaxis de "ResponseEntity"
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(category));
    }

}
