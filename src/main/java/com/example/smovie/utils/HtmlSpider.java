package com.example.smovie.utils;


import com.example.smovie.entity.Movie;
import com.example.smovie.service.SMovieGetService;
import lombok.SneakyThrows;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
@Component
public class HtmlSpider {
    @SneakyThrows
    public List<Movie> get(String url) throws NullPointerException {
        Movie movie = new Movie();
        List<Movie> movies =new ArrayList<>();
        String nextpage =url;
        for(int i=0;i<10;i++)
        {
            Document document = Jsoup.parse(new URL(nextpage),30000000);
            Element all =document.getElementById("index");
            Elements all1=all.getElementsByClass("el-col el-col-24 el-col-xs-8 el-col-sm-6 el-col-md-4");
            Elements next = document.getElementsByAttributeValue("class","next");
            for (Element a:all1)
            {
                SMovieGetService sMovieGetService=null;
                Elements b=a.getElementsByTag("a");
                String url1=b.first().absUrl("href");
                MovieGet movieGet = new MovieGet();
                movie=movieGet.getMovie(url1);
                System.out.println(movie);
                movies.add(movie);
            }
            if(i!=9)
                nextpage = next.first().absUrl("href");
        }
        return movies;

    }


}
