package com.example.smovie;

import com.example.smovie.dao.SMovieGetDao;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SmovieApplicationTests {

    @Autowired SMovieGetDao sMovieGetDao;
    @SneakyThrows
    @Test
    void contextLoads() {

        /*Movie movie;
        List<Movie> movies =new ArrayList<>();
        String url="https://ssr1.scrape.center/";
        String nextpage =url;
        for(int i=0;i<10;i++)
        {
            Document document = Jsoup.parse(new URL(nextpage),30000000);
            Element all =document.getElementById("index");
            Elements all1=all.getElementsByClass("el-col el-col-24 el-col-xs-8 el-col-sm-6 el-col-md-4");
            Elements next = document.getElementsByAttributeValue("class","next");
            for (Element a:all1)
            {

                Elements b=a.getElementsByTag("a");
                String url1=b.first().absUrl("href");
                MovieGet movieGet = new MovieGet();
                movie=movieGet.getMovie(url1);
                System.out.println(movie);

            }
            if(i!=9)
            nextpage = next.first().absUrl("href");
        }


        HtmlSpider htmlSpider =  new HtmlSpider();
        List<Movie> movies = new ArrayList<>();
        movies = htmlSpider.get("https://ssr1.scrape.center");
        for (Movie movie:movies) {
            System.out.println(movie);
        }*/
       /* ModelAndView view = new ModelAndView();
        List<Movie> movies =sMovieGetDao.selectList(null);
        for (Movie movie:movies
             ) {
            System.out.println(movie);
        }
        view.getModel().put("movies", movies);*/
    }

}
