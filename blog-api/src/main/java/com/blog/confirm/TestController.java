package com.blog.confirm;

import com.blog.domain.confirm.entity.Confirm;
import com.blog.domain.confirm.ropository.ConfirmRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {
  private final ConfirmRepository confirmRepository;

  @GetMapping("/test")
  public Long test(){
    Confirm confirm = confirmRepository.saveAndFlush(Confirm.builder().id(1L).description("test").build());
    return confirm.getId();
  }
}
