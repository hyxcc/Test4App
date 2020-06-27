<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>官网首页</title>
    <meta name="viewport" content="width=device-width,initial-scale=1,user-scalable=no">
    <meta http-equiv="X-UA-Compatible" content="IE=edge chorme=1">
    <meta name="msapplication-tap-highlight" content="no" />
    <!--禁止链接高亮-->
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/css/bootstrap.min.css">
    <link href="../css/mission8-1.css" rel="stylesheet" type="text/css">
</head>
<body>
<main>
    <div class="carousel slide" id="main-pic" data-ride="carousel">
        <!--轮播（Carousel）指标-->
        <ul class="carousel-indicators">
            <li data-target="#main-pic" data-slide-to="0" class="active"></li>
            <li data-target="#main-pic" data-slide-to="1"></li>
            <li data-target="#main-pic" data-slide-to="2"></li>
        </ul>
        <!--轮播（Carousel）项目-->
        <div class="carousel-inner">
            <div class="carousel-item active">
                <img class="pic-jns" src="../pic/技能树首页_02.png" alt="first">
            </div>
            <div class="carousel-item">
                <img class="pic-jns" src="../pic/首页_02.png" alt="second">
            </div>
            <div class="carousel-item">
                <img class="pic-jns" src="../pic/首页_03.png" alt="third">
            </div>
        </div>
        <!--轮播（Carousel）导航按钮-->
        <a class="carousel-control-prev" href="#main-pic" data-slide="prev">
            <span class="carousel-control-prev-icon"></span>
        </a>
        <a class="carousel-control-next" href="#main-pic" data-slide="next">
            <span class="carousel-control-next-icon"></span>
        </a>
    </div>

    <div class="content">
        <div class="container" id="advantage">
            <div class="row">
                <div class="col-12 col-sm-6 col-md-6 col-lg-3 feature-position">
                    <div class="pic-feature">
                        <div class="pic-feature-1"></div>
                    </div>
                    <div class="word-1">
                        <h4 class="word-feature">高效</h4>
                        <p class="word-feature-2">将五到七年的成长时间，缩短到一年到三年。</p>
                    </div>
                </div>

                <div class="col-12 col-sm-6 col-md-6 col-lg-3 feature-position">
                    <div class="pic-feature">
                        <div class="pic-feature-2"></div>
                    </div>
                    <h4 class="word-feature">规范</h4>
                    <p class="word-feature-2">标准的实战教程，不会走弯路。</p>
                </div>

                <div class="col-12 col-sm-6 col-md-6 col-lg-3 feature-position">
                    <div class="pic-feature">
                        <div class="pic-feature-3"></div>
                    </div>
                    <h4 class="word-feature">人脉</h4>
                    <p class="word-feature-2">同班好友，同院学长，技术大师，入学就混入职脉圈。</p>
                </div>

                <div class="col-12 col-sm-6 col-md-6 col-lg-3 feature-position-1">
                    <div class="pic-people">
                        <div class="people">
                            <div class="icon-people"></div>
                            <p class="num-people">12400</p>
                        </div>
                        <p class="content-people">累计在线学习人数</p>
                    </div>

                    <div class="pic-people">
                        <div class="people">
                            <div class="icon-people"></div>
                            <p class="num-people">12400</p>
                        </div>
                        <p class="content-people">累计在线学习人数</p>
                    </div>
                </div>
            </div>

        </div>
        <div class="container" id="study">
            <h4 class="word-study">如何学习</h4>
            <div class="row p-study">
                <div class="col-12 col-sm-6 col-md-6 col-lg-3 step">
                    <div class="step-num">
                        <p class="word-num">1</p>
                    </div>
                    <p class="word-step">匹配你现在的个人情况，寻找合适自己的岗位</p>
                    <div class="step-arrow"></div>
                </div>

                <div class="col-12 col-sm-6 col-md-6 col-lg-3 step">
                    <div class="step-num">
                        <p class="word-num">2</p>
                    </div>
                    <p class="word-step">了解职业前景薪金待遇、竞争压力等</p>
                    <div class="step-arrow display-arrow"></div>
                </div>

                <div class="col-12 col-sm-6 col-md-6 col-lg-3 step">
                    <div class="step-num">
                        <p class="word-num">3</p>
                    </div>
                    <p class="word-step">掌握行业内顶级技能</p>
                    <div class="step-arrow"></div>
                </div>

                <div class="col-12 col-sm-6 col-md-6 col-lg-3 step">
                    <div class="step-num">
                        <p class="word-num">4</p>
                    </div>
                    <p class="word-step">查看职业目标任务</p>
                </div>
            </div>
            <!--上面是第一行步骤-->
            <div class="row p-study">
                <div class="col-12 col-sm-6 col-md-6 col-lg-3 step">
                    <div class="step-num">
                        <p class="word-num">5</p>
                    </div>
                    <p class="word-step">参考学习资源，掌握技能点，逐个完成任务</p>
                    <div class="step-arrow"></div>
                </div>

                <div class="col-12 col-sm-6 col-md-6 col-lg-3 step">
                    <div class="step-num">
                        <p class="word-num">6</p>
                    </div>
                    <p class="word-step">加入班级，和小伙伴们互帮互助，一块学习</p>
                    <div class="step-arrow display-arrow"></div>
                </div>

                <div class="col-12 col-sm-6 col-md-6 col-lg-3 step">
                    <div class="step-num">
                        <p class="word-num">7</p>
                    </div>
                    <p class="word-step">选择导师，一路引导，加速自己成长</p>
                    <div class="step-arrow"></div>
                </div>

                <div class="col-12 col-sm-6 col-md-6 col-lg-3 step">
                    <div class="step-num">
                        <p class="word-num">8</p>
                    </div>
                    <p class="word-step">完成职业技能，升级业界大牛</p>
                </div>
            </div>
            <!--上面是第二行步骤-->
        </div>

        <div class="carousel slide student" id="myCarousel-2" data-ride="carousel">
            <!--轮播（Carousel）指标-->
            <h4 class="word-study">优秀学员展示</h4>
            <ol class="carousel-indicators study-bottom">
                <li data-target="#myCarousel-2" data-slide-to="0" class="active"></li>
                <li data-target="#myCarousel-2" data-slide-to="1"></li>
                <li data-target="#myCarousel-2" data-slide-to="2"></li>
            </ol>
            <!--轮播（Carousel）项目-->
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <div class="container">
                        <div class="row box-people">
                            <div class="col-12 col-sm-6 col-md-6 col-lg-3">
                                <div class="portrait">
                                    <div class="portrait-people-1"></div>
                                    <h4 class="card-title">技术顾问:魏夕皓</h4>
                                    <p class="card-word">百度技术总监：互联网基础服务领域，从事虚拟主机、云服务器、域名。曾任新网高级技术经理，负责技术研发、团队管理与建设。</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

        </div>
    </div>


    <div class="container">
        <h4 class="cooperation">战略合作企业</h4>
        <div class="row box-company">
            <div class="col-12 col-sm-12 col-md-4 col-lg icon-company-1 icon-company"></div>
            <div class="col-12 col-sm-12 col-md-4 col-lg icon-company-2 icon-company"></div>
            <div class="col-12 col-sm-12 col-md-4 col-lg icon-company-3 icon-company"></div>
            <div class="col-12 col-sm-12 col-md-4 col-lg icon-company-4 icon-company"></div>
            <div class="col-12 col-sm-12 col-md-4 col-lg icon-company-5 icon-company"></div>
        </div>
    </div>

    <div class="bottom-background">
        <div class="container">
            <h4 class="friendly-link">友情链接</h4>
            <ul class="row box-friend">
                <li class="col-6 col-sm-6 col-md-2 col-lg-1 word-friend">
                    <a class="link-bottom" href="#" target="_blank">手机软件</a>
                </li>
                <li class="col-6 col-sm-6 col-md-2 col-lg-1 word-friend">
                    <a class="link-bottom" href="#" target="_blank">教师招聘</a>
                </li>
                <li class="col-6 col-sm-6 col-md-2 col-lg-1 word-friend">
                    <a class="link-bottom" href="#" target="_blank">找工作</a>
                </li>
                <li class="col-6 col-sm-6 col-md-2 col-lg-1 word-friend">
                    <a class="link-bottom" href="#" target="_blank">祖传贴膜</a>
                </li>
                <li class="col-6 col-sm-6 col-md-2 col-lg-1 word-friend">
                    <a class="link-bottom" href="#" target="_blank">电脑清灰</a>
                </li>
                <li class="col-6 col-sm-6 col-md-2 col-lg-1 word-friend">
                    <a class="link-bottom" href="#" target="_blank">通下水道</a>
                </li>
                <li class="col-6 col-sm-6 col-md-2 col-lg-1 word-friend">
                    <a class="link-bottom" href="#" target="_blank">专业开锁</a>
                </li>
                <li class="col-6 col-sm-6 col-md-2 col-lg-1 word-friend">
                    <a class="link-bottom" href="#" target="_blank">买卖账号</a>
                </li>
                <li class="col-6 col-sm-6 col-md-2 col-lg-1 word-friend">
                    <a class="link-bottom" href="#" target="_blank">游戏代练</a>
                </li>
                <li class="col-6 col-sm-6 col-md-2 col-lg-1 word-friend">
                    <a class="link-bottom" href="#" target="_blank">代买奶茶</a>
                </li>
                <li class="col-6 col-sm-6 col-md-2 col-lg-1 word-friend">
                    <a class="link-bottom" href="#" target="_blank">网吧加盟</a>
                </li>
                <li class="col-6 col-sm-6 col-md-2 col-lg-1 word-friend">
                    <a class="link-bottom" href="#" target="_blank">公司倒闭</a>
                </li>
            </ul>
            <ul class="row box-friend">
                <li class="col-6 col-sm-6 col-md-2 col-lg-1 word-friend">
                    <a class="link-bottom" href="#" target="_blank">手机官网</a>
                </li>
                <li class="col-6 col-sm-6 col-md-2 col-lg-1 word-friend">
                    <a class="link-bottom" href="#" target="_blank">培训学校</a>
                </li>
                <li class="col-6 col-sm-6 col-md-2 col-lg-1 word-friend">
                    <a class="link-bottom" href="#" target="_blank">考试经验</a>
                </li>
                <li class="col-6 col-sm-6 col-md-2 col-lg-1 word-friend">
                    <a class="link-bottom" href="#" target="_blank">没有福利</a>
                </li>
                <li class="col-6 col-sm-6 col-md-2 col-lg-1 word-friend">
                    <a class="link-bottom" href="#" target="_blank">网吧充值</a>
                </li>
                <li class="col-6 col-sm-6 col-md-2 col-lg-1 word-friend">
                    <a class="link-bottom" href="#" target="_blank">一键关机</a>
                </li>
                <li class="col-6 col-sm-6 col-md-2 col-lg-1 word-friend">
                    <a class="link-bottom" href="#" target="_blank">清除垃圾</a>
                </li>
                <li class="col-6 col-sm-6 col-md-2 col-lg-1 word-friend">
                    <a class="link-bottom" href="#" target="_blank">买房</a>
                </li>
                <li class="col-6 col-sm-6 col-md-2 col-lg-1 word-friend">
                    <a class="link-bottom" href="#" target="_blank">鞋专区</a>
                </li>
                <li class="col-6 col-sm-6 col-md-2 col-lg-1 word-friend">
                    <a class="link-bottom" href="#" target="_blank">家具工艺</a>
                </li>
                <li class="col-6 col-sm-6 col-md-2 col-lg-1 word-friend">
                    <a class="link-bottom" href="#" target="_blank">天气预报</a>
                </li>
                <li class="col-6 col-sm-6 col-md-2 col-lg-1 word-friend">
                    <a class="link-bottom" href="#" target="_blank">音乐剧场</a>
                </li>
            </ul>
        </div>
    </div>
</main>
<script src="https://cdn.staticfile.org/jquery/3.2.1/jquery.min.js"></script>
<script src="https://cdn.staticfile.org/popper.js/1.15.0/umd/popper.min.js"></script>
<script src="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/js/bootstrap.min.js"></script>

</body>
</html>
