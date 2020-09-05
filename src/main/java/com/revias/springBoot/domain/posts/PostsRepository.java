package com.revias.springBoot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Arrays;
import java.util.List;

public interface PostsRepository extends JpaRepository<Posts, Long>
{}