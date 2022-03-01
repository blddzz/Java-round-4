<%@pagecontentType="text/html;charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <link rel="icon" href="static/img/favicon.ico">
    <title>S Movie</title>
    <link href="static/css/app.css" type="text/css" rel="stylesheet">
    <link href="static/css/index.css" type="text/css" rel="stylesheet">
</head>
<body>
<div id="app">
    <div data-v-74e8b908="" class="el-row" id="header">
        <div data-v-74e8b908="" class="container el-col el-col-18 el-col-offset-3">
            <div data-v-74e8b908="" class="el-row">
                <div data-v-74e8b908="" class="logo el-col el-col-4">
                    <a data-v-74e8b908="" href="/" class="router-link-exact-active router-link-active">
                        <img data-v-74e8b908="" src="https://ssr1.scrape.center/static/img/logo.png" class="logo-image">
                        <span data-v-74e8b908="" class="logo-title">S Movie</span>
                    </a>
                </div>
            </div>
        </div>
    </div>
    <div data-v-7f856186="" id="index">
        <div data-v-7f856186="" class="el-row">
            <div data-v-7f856186="" class="el-col el-col-18 el-col-offset-3">
                <c:forEach items="${movies}" var="movie">
                <div data-v-7f856186="" class="el-card item m-t is-hover-shadow">
                    <div class="el-card__body">
                        <div data-v-7f856186="" class="el-row">
                            <div data-v-7f856186="" class="el-col el-col-24 el-col-xs-8 el-col-sm-6 el-col-md-4">
                                <a data-v-7f856186=""  class="">
                                    <img data-v-7f856186="" src=${movie.photo} class="cover">
                                </a>
                            </div>
                            <div data-v-7f856186="" class="p-h el-col el-col-24 el-col-xs-9 el-col-sm-13 el-col-md-16">
                                <a data-v-7f856186=""  class="name">
                                    <h2 data-v-7f856186="" class="m-b-sm">${movie.movieName}</h2>
                                </a>
                                <div data-v-7f856186="" class="categories">

                                    <button data-v-7f856186="" type="button" class="el-button category el-button--primary el-button--mini">
                                        <span>${movie.label}</span>
                                    </button>

                                </div>
                                <div data-v-7f856186="" class="m-v-sm info">
                                    <span data-v-7f856186="">${movie.nationality}</span>
                                    <span data-v-7f856186=""> / </span>
                                    <span data-v-7f856186="">${movie.movieTime}</span>
                                </div>
                                <div data-v-7f856186="" class="m-v-sm info">

                                    <span data-v-7f856186="">${movie.firstTime}</span>

                                </div>
                            </div>
                            <div data-v-7f856186="" class="el-col el-col-24 el-col-xs-5 el-col-sm-5 el-col-md-4">
                                <p data-v-7f856186="" class="score m-t-md m-b-n-sm">${movie.score}</p>
                                <p data-v-7f856186=""></p>
                                <p></p>
                            </div>
                        </div>
                    </div>
                </div>
                </c:forEach>

            </div>
            <div class="el-loading-mask" style="display: none;">
                <div class="el-loading-spinner">
                    <svg viewBox="25 25 50 50" class="circular">
                        <circle cx="50" cy="50" r="20" fill="none" class="path"></circle>
                    </svg>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
<div id="edge-translate-notifier-container" class="edge-translate-notifier-center"></div>
</html>