package com.example.smovie.utils;

import com.example.smovie.entity.Movie;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URL;
@Component
public class MovieGet {
    public Movie getMovie(String url)throws IOException {
        Movie movie = new Movie();
        String dir = new String();
        String pho = new String();
        Document doc = Jsoup.parse(new URL(url),30000);
        Element all =doc.getElementById("detail");
        Elements name = all.getElementsByTag("h2");
        Elements photo = all.getElementsByTag("img");
        Elements label = doc.getElementsByClass("categories");
        Elements all1 = all.getElementsByClass("m-v-sm info");
        Element  all2 =all1.first();
        Elements span = all2.getElementsByTag("span");
        Elements score = all.getElementsByAttributeValue("class","score m-t-md m-b-n-sm");

        String mname = name.get(0).text();
        String mphoto = photo.first().absUrl("src");
        String mlabel = label.text();
        String mnationality =span.first().text();
        String mtime = span.get(2).text();
        String mscore = score.text();
        String firsttime = all1.get(1).text();

        Elements elements =doc.getElementsByAttributeValue("class","name text-center m-b-none m-t-xs");
        Element element=doc.getElementById("detail");
        Elements elements1=element.getElementsByTag("img");
        for(int i=0;i<elements.size();i++)
        {
            Element a = elements.get(i);
            String director =a.text();
            if(i>0)
            {
                dir=dir +" "+director;
            }
            else  dir =director;
        }
        for(int i=0;i<elements.size();i++)
        {
            Element element1=elements1.get(i+1);
            String dphoto=element1.absUrl("src");
            if(i>0)
            {
                pho=pho +" "+dphoto;
            }
            else pho=dphoto;

        }
        movie.setMovieName(mname);
        movie.setPhoto(mphoto);
        movie.setLabel(mlabel);
        movie.setNationality(mnationality);
        movie.setMovieTime(mtime);
        movie.setScore(mscore);
        movie.setFirstTime(firsttime);
        movie.setDirector(dir);
        movie.setDirectorPhoto(pho);
        return movie;
    }
}
