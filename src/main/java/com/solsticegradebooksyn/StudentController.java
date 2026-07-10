package com.solsticegradebooksyn;

import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class StudentController {
  @GetMapping
  public List<String> list() {
    return List.of("sample");
  }
}
