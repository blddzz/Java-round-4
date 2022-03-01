package com.example.smovie.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@TableName("movie")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("电影")
public class Movie {
    @TableId
    @ApiModelProperty("电影名")
    private String movieName;

    @ApiModelProperty("封面图片")
    private String photo;

    @ApiModelProperty("类型标签")
    private String label;

    @ApiModelProperty("国籍")
    private String nationality;

    @ApiModelProperty("时长")
    private String movieTime;

    @ApiModelProperty("评分")
    private String  score;

    @ApiModelProperty("上映时间")
    private String firstTime;

    @ApiModelProperty("导演名字")
    private String director;

    @ApiModelProperty("导演照片")
    private String directorPhoto;
}
