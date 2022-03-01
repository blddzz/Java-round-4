package com.example.smovie.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.smovie.entity.Movie;
import org.springframework.stereotype.Repository;

@Repository
public interface SMovieGetDao extends BaseMapper<Movie> {
}
