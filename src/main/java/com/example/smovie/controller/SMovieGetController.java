package com.example.smovie.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.smovie.dao.SMovieGetDao;
import com.example.smovie.entity.Movie;
import com.example.smovie.service.SMovieGetService;
import com.example.smovie.utils.HtmlSpider;
import io.swagger.annotations.ApiOperation;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/Smovie_war_exploded", method = RequestMethod.POST)
public class SMovieGetController {
    @Autowired HtmlSpider htmlSpider;
    @Autowired SMovieGetDao sMovieGetDao;
    @Autowired SMovieGetService sMovieGetService;
    @SneakyThrows
    @ApiOperation("获取数据库数据")
    @RequestMapping(value = "/movie.jsp", method = RequestMethod.POST)
    public ModelAndView showMovieList(String url) {
        ModelAndView view = new ModelAndView();
        sMovieGetDao.selectList(null);
        List<Movie> movies = new ArrayList<>();
        view.setViewName("/movie.jsp");
        movies = sMovieGetDao.selectList(null);
        view.getModel().put("movies", movies);
        return view;
    }
    @ApiOperation("查询电影")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public List<Movie> showChapterList(String moviename) {


        return sMovieGetService.list(new LambdaQueryWrapper<Movie>()
                        .eq(Movie::getMovieName,moviename)
        );


    }
}
