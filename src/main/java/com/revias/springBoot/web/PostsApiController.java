package com.revias.springBoot.web;

import com.revias.springBoot.posts.service.PostsService;
import com.revias.springBoot.web.Dto.PostsListResponseDto;
import com.revias.springBoot.web.Dto.PostsSaveRequestDto;
import com.revias.springBoot.web.Dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto)
    {
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsListResponseDto findById(@PathVariable Long id) {
        return postsService.findById(id);
    }
}
