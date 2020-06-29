<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width,initial-scale=1,user-scalable=no">
    <meta http-equiv="X-UA-Compatible" content="IE=edge chrome=1">
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/css/bootstrap.min.css">
    <link href="../css/mission8-2.css" rel="stylesheet" type="text/css">
    <title>职业方向</title>
</head>
<body>
<!--导航栏-->
<main>
    <div class="container">
        <nav class="breadcrumb navigation-1">
            <a class="breadcrumb-item word-navigation-1" href="#">首页</a>
            <span class="breadcrumb-item active word-navigation-2">职业</span>
        </nav>
        <!--面包屑导航栏-->
        <div class="direction-middle">
            <ul class="nav nav-pills direction-middle-1">
                <li class="nav-link word-direction-1">方向:</li>
                <li class="nav-item direction-top">
                    <a class="nav-link word-direction" href="#">全部</a>
                </li>
                <li class="nav-item direction-top">
                    <a class="nav-link word-direction" href="#font-end">前端开发</a>
                </li>

                <li class="nav-item direction-top">
                    <a class="nav-link word-direction" href="#back-end">后端开发</a>
                </li>
                <li class="nav-item direction-top">
                    <a class="nav-link word-direction" href="#direction-mobile">移动开发</a>
                </li>
                <li class="nav-item direction-top">
                    <a class="nav-link word-direction" href="#Whole-station">整站开发</a>
                </li>
                <li class="nav-item direction-top">
                    <a class="nav-link word-direction" href="#Operate">运营维护</a>
                </li>
            </ul>
        </div>


        <div class="container-fluid" id="font-end">
            <c:forEach items="${requestScope.proCatalog}" var="catalog">
            <h4 class="direction-1">${catalog.name}</h4>
            <div class="row card-main">
                <div class="col-12 col-sm-12 col-md-6 col-lg-4 row-1-card-1">
                    <c:forEach items="${requestScope.profession[catalog.name]}" var="pro">
                    <div class="card-hidden">
                        <div class="card-hidden-word">
                            <h4 class="card-word-title">${pro.name}</h4>
                            <p class="card-word-p">${pro.intro}</p>
                        </div>
                        <div class="card-box">
                            <div class="card-title">
                                <div class="card-portrait"></div>
                                <div class="word-card">
                                    <h4 class="word-card-title">${pro.name}</h4>
                                    <p class="word-card-top">${pro.intro}</p>
                                </div>
                            </div>

                            <div class="container main-threshold">
                                <table class="table table-sm table-name">
                                    <tr>
                                        <td class="hand-threshold-1" colspan="6">
                                            <span class="word-threshold">门槛</span>
                                            <c:choose>
                                                <c:when test="${pro.limitCondition == 1}">
                                                    <span class="pic-star"></span>
                                                </c:when>
                                                <c:when test="${pro.limitCondition == 2}">
                                                    <span class="pic-star"></span>
                                                    <span class="pic-star"></span>
                                                </c:when>
                                                <c:otherwise>
                                                    <span class="pic-star"></span>
                                                    <span class="pic-star"></span>
                                                    <span class="pic-star"></span>
                                                </c:otherwise>
                                            </c:choose>
                                        </td>
                                        <td class="hand-star"  colspan="6">
                                            <span class="word-threshold">难易程度</span>
                                            <c:choose>
                                                <c:when test="${pro.difficulty==2}">
                                                    <span class="pic-star"></span>
                                                    <span class="pic-star"></span>
                                                </c:when>
                                                <c:when test="${pro.difficulty==3}">
                                                    <span class="pic-star"></span>
                                                    <span class="pic-star"></span>
                                                    <span class="pic-star"></span>
                                                </c:when>
                                                <c:otherwise>
                                                    <span class="pic-star"></span>
                                                    <span class="pic-star"></span>
                                                    <span class="pic-star"></span>
                                                    <span class="pic-star"></span>
                                                </c:otherwise>
                                            </c:choose>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td class="grow-company"  colspan="6">
                                            <span class="word-threshold">成长周期</span>
                                            <span class="pic-time"><span class="pic-time-num">${pro.periodone}-${pro.periodtwo}</span>年</span>
                                        </td>
                                        <td class="hand-grow"  colspan="6">
                                            <span class="word-threshold">稀缺程度</span>
                                            <span class="pic-time"><span class="pic-time-num">${pro.carrerProspects}</span>家公司需要</span>
                                        </td>
                                    </tr>

                                    <tr>
                                        <td class="text-money" rowspan="3" colspan="4">
                                            <p class="word-money-1">薪资待遇</p>
                                        </td>

                                        <td class="text-money-2" colspan="8">
                                            <span class="word-money">
                                                <span class="word-year">0-1年</span>
                                                <span class="word-year">${pro.salaryone}K-${pro.salarytwo}K/月</span>
                                            </span>
                                        </td>
                                    </tr>

                                    <tr>
                                        <td class="text-money-2" colspan="8">
                                                <span class="word-money">
                                                    <span class="word-year">1-3年</span>
                                                    <span class="word-year">${pro.salaryone}K-${pro.salarytwo}K/月</span>
                                                </span>
                                        </td>
                                    </tr>

                                    <tr>
                                        <td class="text-money-2" colspan="8">
                                              <span class="word-money">
                                                   <span class="word-year">3-5年</span>
                                                   <span class="word-year">${pro.salaryone}K-${pro.salarytwo}K/月</span>
                                              </span>
                                        </td>
                                    </tr>

                                    <tr>
                                        <td class="text-money-2" colspan="12">
                                              <span class="word-money-bottom">
                                                   <p class="word-year">有<span class="text-money-num">${stu.stuCount}</span>人在学</p>
                                              </span>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td class="text-money-2" colspan="12">
                                            <p class="word-threshold-2">提示:在你学习之前你应该已经掌握XXXXX、XXXXX、XX等语言基础</p>
                                        </td>
                                    </tr>
                                </table>
                            </div>
                        </div>
                    </div>
                    </c:forEach>
                </div>
            </div>
            </c:forEach>
        </div>

        <div class="none-bottom"></div>
    </div>
</main>
<script src="https://cdn.staticfile.org/jquery/3.2.1/jquery.min.js"></script>
<script src="https://cdn.staticfile.org/popper.js/1.15.0/umd/popper.min.js"></script>
<script src="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/js/bootstrap.min.js"></script></body>

</html>
