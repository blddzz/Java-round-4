package com.example.smovie.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.smovie.dao.SMovieGetDao;
import com.example.smovie.entity.Movie;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MovieGetService extends ServiceImpl<SMovieGetDao, Movie> implements SMovieGetService{

}
