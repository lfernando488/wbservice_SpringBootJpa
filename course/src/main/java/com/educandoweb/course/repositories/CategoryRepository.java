package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.educandoweb.course.entities.Category;

@Repository // Annotation é opcional pois ja herda de JPA Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
