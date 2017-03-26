<%-- 
    Document   : index
    Created on : 24/03/2017, 11:58:08 PM
    Author     : Guillermo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>VFGym</title>

    <head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Virtual Fitness Gym</title>

        <meta name="Keywords" content="">
        <meta name="Description" content="">

        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">	

        <!-- Favicon for Desktop, iOS and android -->
        <link rel="apple-touch-icon" sizes="57x57" href="http://demo.harbourthemes.com/demo/fitup/assets/images/favicons/apple-touch-icon-57x57.png">
        <link rel="apple-touch-icon" sizes="60x60" href="http://demo.harbourthemes.com/demo/fitup/assets/images/favicons/apple-touch-icon-60x60.png">
        <link rel="apple-touch-icon" sizes="72x72" href="http://demo.harbourthemes.com/demo/fitup/assets/images/favicons/apple-touch-icon-72x72.png">
        <link rel="apple-touch-icon" sizes="76x76" href="http://demo.harbourthemes.com/demo/fitup/assets/images/favicons/apple-touch-icon-76x76.png">
        <link rel="apple-touch-icon" sizes="114x114" href="http://demo.harbourthemes.com/demo/fitup/assets/images/favicons/apple-touch-icon-114x114.png">
        <link rel="apple-touch-icon" sizes="120x120" href="http://demo.harbourthemes.com/demo/fitup/assets/images/favicons/apple-touch-icon-120x120.png">
        <link rel="apple-touch-icon" sizes="144x144" href="http://demo.harbourthemes.com/demo/fitup/assets/images/favicons/apple-touch-icon-144x144.png">
        <link rel="apple-touch-icon" sizes="152x152" href="http://demo.harbourthemes.com/demo/fitup/assets/images/favicons/apple-touch-icon-152x152.png">
        <link rel="apple-touch-icon" sizes="180x180" href="http://demo.harbourthemes.com/demo/fitup/assets/images/favicons/apple-touch-icon-180x180.png">
        <link rel="icon" type="image/png" href="http://demo.harbourthemes.com/demo/fitup/assets/images/favicons/android-chrome-192x192.png" sizes="192x192">
        <link rel="icon" type="image/png" href="http://demo.harbourthemes.com/demo/fitup/assets/images/favicons/favicon-16x16.png" sizes="16x16">
        <link rel="icon" type="image/png" href="http://demo.harbourthemes.com/demo/fitup/assets/images/favicons/favicon-32x32.png" sizes="32x32">
        <link rel="mask-icon" href="http://demo.harbourthemes.com/demo/fitup/assets/images/favicons/safari-pinned-tab.svg" color="#5bbad5">



    </head>
    <body>


        <jsp:include page="header.jsp"/>

        <!-- Start Slider -->
        <div id="slider" class="slider">
            <div class="flexslider flexslider-bg">

                <!-- Overlay -->
                <div class="bg-overlay"></div>

                <!-- Start Slides -->
                <ul class="slides">
                    <li style="background: url(images/assets/slide-1.jpg) top"></li> 
                    <li style="background: url(images/assets/slide-2.jpg) top"></li>
                    <li style="background: url(images/assets/slide-3.jpg) top"></li>

                </ul>
                <!-- End Slides -->

                <!-- Start Slider Content -->
                <section class="flex-caption">
                    <div class="container slider-container">
                        <div class="row">
                            <div class="col-md-12 full-screen">

                                <!-- Title -->
                                <h1>Construye tu figura</h1>

                                <!-- Line -->
                                <span class="h-line"></span>

                                <!-- Start Description -->
                                <p class="sub-text">
                                    Para ser el número uno, tienes que entrenar <br>
                                    como si fueras el número dos.
                                </p>
                                <!-- End Description -->

                            </div>
                        </div>
                    </div>
                </section>
                <!-- End Slider Content -->

                <ol class="flex-control-nav flex-control-paging"><li><a class="">1</a></li><li><a class="">2</a></li><li><a class="flex-active">3</a></li></ol></div>
        </div>
        <!-- End Slider -->





        <jsp:include page="footer.jsp"/>



        <!-- Include JS -->
        <script src="resource/jquery.min.js"></script>
        <script src="resource/bootstrap.min.js"></script>
        <script src="resource/retina.min.js"></script>
        <script src="resource/flexslider.js"></script>
        <script src="resource/slick.min.js"></script>
        <script src="resource/magnific-popup.min.js"></script>
        <script src="resource/twitterFetcher.js"></script>
        <script src="resource/smooth-scroll.min.js"></script>
        <script src="resource/parallax.js"></script>
        <script src="resource/init.js"></script>


        <script>
            (function (i, s, o, g, r, a, m) {
                i['GoogleAnalyticsObject'] = r;
                i[r] = i[r] || function () {
                    (i[r].q = i[r].q || []).push(arguments)
                }, i[r].l = 1 * new Date();
                a = s.createElement(o),
                        m = s.getElementsByTagName(o)[0];
                a.async = 1;
                a.src = g;
                m.parentNode.insertBefore(a, m)
            })(window, document, 'script', 'https://www.google-analytics.com/analytics.js', 'ga');

            ga('create', 'UA-80974374-1', 'auto');
            ga('send', 'pageview');

        </script>
    </body>
</html>
