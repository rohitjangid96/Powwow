<%-- 
    Document   : startpage
    Created on : Apr 29, 2017, 10:29:34 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>POWWOW</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
 <link rel="icon" type="image/png" href="images/logo.png" />
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="http://www.marcoguglie.it/Codepen/AnimatedHeaderBg/demo-1/js/EasePack.min.js"></script>
<script src="http://www.marcoguglie.it/Codepen/AnimatedHeaderBg/demo-1/js/rAF.js"></script>
<script src="http://www.marcoguglie.it/Codepen/AnimatedHeaderBg/demo-1/js/TweenLite.min.js"></script>
<link href='http://fonts.googleapis.com/css?family=Raleway:200,400,800' rel='stylesheet' type='text/css'>
 <link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Droid Sans">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.css">
         <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
         <script src="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.js"></script>

        <style>
       body {
  font: 400 1em/1.5 "Neuton";
  
  color: rgba(255, 255, 255, 0.25);
  text-align: center;
  margin: 0;
  font-size: 38px;
}

p {
  text-transform: uppercase;
  letter-spacing: .5em;
  display: inline-block;
/*  border: 4px double #fff;*/
/*  border-width: 4px 0;*/
  padding: 1.5em 0em;
  position: absolute;
  top: 18%;
  left: 50%;
  width: 40em;
  margin: 0 0 0 -20em;
}
p span {
  font: 700 4em/1 "Oswald", sans-serif;
  letter-spacing: 0;
  padding: .25em 0 .325em;
  display: block;
  margin: 0 auto;
  text-shadow: 0 0 80px rgba(255, 255, 255, 0.5);
  /* Clip Background Image */
  background: url(http://likebangla.tk/demo/animated_text_fill.png) repeat-y;
  -webkit-background-clip: text;
  /* Animate Background Image */
  -webkit-text-fill-color: transparent;
  -webkit-animation: aitf 80s linear infinite;
  /* Activate hardware acceleration for smoother animations */
  -webkit-transform: translate3d(0, 0, 0);
  -webkit-backface-visibility: hidden;
}

/* Animate Background Image */
@-webkit-keyframes aitf {
  0% {
    background-position: 0% 50%;
  }
  100% {
    background-position: 100% 50%;
  }
}





/*background*/
/* Header */
.large-header {
  position: relative;
  width: 100%;
  background: #333;
  overflow: hidden;
  background-size: cover;
  background-position: center center;
  z-index: 1;
}
#large-header {
  background-image: url("http://www.marcoguglie.it/Codepen/AnimatedHeaderBg/demo-1/img/demo-1-bg.jpg");
}
.main-title {
  position: absolute;
  margin: 0;
  padding: 0;
  color: #f9f1e9;
  text-align: center;
  top: 50%;
  left: 50%;
  -webkit-transform: translate3d(-50%, -50%, 0);
  transform: translate3d(-50%, -50%, 0);
}
.demo-1 .main-title {
  text-transform: uppercase;
  font-size: 4.2em;
  letter-spacing: 0.1em;
}
 .css-selector {
  font-family: 'Droid Sans', serif;
}
.main-title .thin {
  font-weight: 200;
}
@media only screen and (max-width: 768px) {
  .demo-1 .main-title {
    font-size: 3em;
  }
}

        </style>
    </head>
    <body>
       
       



<div id="large-header" class="large-header">
  <canvas id="demo-canvas"></canvas>
 
 <div class="container">
     <div style="position: fixed ;top: 500px;left: 530px">
<div class="ui massive buttons"  >
                <button class="ui inverted red button" onclick="indexbutton()">JOIN US</button>
           <div class="or"></div>
           <button class="ui inverted blue button" ><a href="login pages/login.jsp" style="text-decoration: none">LOGIN</a>    </button>
            </div>
        </div>
	<div class="row">
		     <p>
  
            <span >
                 POWWOW
                </span>
                "where the knowledge is shared"
            </p>
	</div>
     
</div>
   
</div>
        
         <div class="ui basic modal" >
                 <div class="ui icon header">
                      <i class="add user icon"></i>
                               WHO ARE YOU?
                </div>

                 <div >
         <a href="register pages/studentreg.jsp"> 
             <img class="ui medium circular image" src="images/stud.png" align="left"  onclick="indeximg1()" id="img1" > 
         </a>
         <a href="register pages/facultyreg.jsp"> 
        <img class="ui medium circular image" src="images/fac.png" align="right"  onclick="indeximg2()">
        </a>
                </div>  

   
                </div>
      
<script>
    
     function indexbutton(){
                $('.ui.modal').modal('show');
            }
            
    (function() {

    var width, height, largeHeader, canvas, ctx, points, target, animateHeader = true;

    // Main
    initHeader();
    initAnimation();
    addListeners();

    function initHeader() {
        width = window.innerWidth;
        height = window.innerHeight;
        target = {x: width/2, y: height/2};

        largeHeader = document.getElementById('large-header');
        largeHeader.style.height = height+'px';

        canvas = document.getElementById('demo-canvas');
        canvas.width = width;
        canvas.height = height;
        ctx = canvas.getContext('2d');

        // create points
        points = [];
        for(var x = 0; x < width; x = x + width/20) {
            for(var y = 0; y < height; y = y + height/20) {
                var px = x + Math.random()*width/20;
                var py = y + Math.random()*height/20;
                var p = {x: px, originX: px, y: py, originY: py };
                points.push(p);
            }
        }

        // for each point find the 5 closest points
        for(var i = 0; i < points.length; i++) {
            var closest = [];
            var p1 = points[i];
            for(var j = 0; j < points.length; j++) {
                var p2 = points[j]
                if(!(p1 == p2)) {
                    var placed = false;
                    for(var k = 0; k < 5; k++) {
                        if(!placed) {
                            if(closest[k] == undefined) {
                                closest[k] = p2;
                                placed = true;
                            }
                        }
                    }

                    for(var k = 0; k < 5; k++) {
                        if(!placed) {
                            if(getDistance(p1, p2) < getDistance(p1, closest[k])) {
                                closest[k] = p2;
                                placed = true;
                            }
                        }
                    }
                }
            }
            p1.closest = closest;
        }

        // assign a circle to each point
        for(var i in points) {
            var c = new Circle(points[i], 2+Math.random()*2, 'rgba(255,255,255,0.3)');
            points[i].circle = c;
        }
    }

    // Event handling
    function addListeners() {
        if(!('ontouchstart' in window)) {
            window.addEventListener('mousemove', mouseMove);
        }
        window.addEventListener('scroll', scrollCheck);
        window.addEventListener('resize', resize);
    }

    function mouseMove(e) {
        var posx = posy = 0;
        if (e.pageX || e.pageY) {
            posx = e.pageX;
            posy = e.pageY;
        }
        else if (e.clientX || e.clientY)    {
            posx = e.clientX + document.body.scrollLeft + document.documentElement.scrollLeft;
            posy = e.clientY + document.body.scrollTop + document.documentElement.scrollTop;
        }
        target.x = posx;
        target.y = posy;
    }

    function scrollCheck() {
        if(document.body.scrollTop > height) animateHeader = false;
        else animateHeader = true;
    }

    function resize() {
        width = window.innerWidth;
        height = window.innerHeight;
        largeHeader.style.height = height+'px';
        canvas.width = width;
        canvas.height = height;
    }

    // animation
    function initAnimation() {
        animate();
        for(var i in points) {
            shiftPoint(points[i]);
        }
    }

    function animate() {
        if(animateHeader) {
            ctx.clearRect(0,0,width,height);
            for(var i in points) {
                // detect points in range
                if(Math.abs(getDistance(target, points[i])) < 4000) {
                    points[i].active = 0.3;
                    points[i].circle.active = 0.6;
                } else if(Math.abs(getDistance(target, points[i])) < 20000) {
                    points[i].active = 0.1;
                    points[i].circle.active = 0.3;
                } else if(Math.abs(getDistance(target, points[i])) < 40000) {
                    points[i].active = 0.02;
                    points[i].circle.active = 0.1;
                } else {
                    points[i].active = 0;
                    points[i].circle.active = 0;
                }

                drawLines(points[i]);
                points[i].circle.draw();
            }
        }
        requestAnimationFrame(animate);
    }

    function shiftPoint(p) {
        TweenLite.to(p, 1+1*Math.random(), {x:p.originX-50+Math.random()*100,
            y: p.originY-50+Math.random()*100, ease:Circ.easeInOut,
            onComplete: function() {
                shiftPoint(p);
            }});
    }

    // Canvas manipulation
    function drawLines(p) {
        if(!p.active) return;
        for(var i in p.closest) {
            ctx.beginPath();
            ctx.moveTo(p.x, p.y);
            ctx.lineTo(p.closest[i].x, p.closest[i].y);
            ctx.strokeStyle = 'rgba(156,217,249,'+ p.active+')';
            ctx.stroke();
        }
    }

    function Circle(pos,rad,color) {
        var _this = this;

        // constructor
        (function() {
            _this.pos = pos || null;
            _this.radius = rad || null;
            _this.color = color || null;
        })();

        this.draw = function() {
            if(!_this.active) return;
            ctx.beginPath();
            ctx.arc(_this.pos.x, _this.pos.y, _this.radius, 0, 2 * Math.PI, false);
            ctx.fillStyle = 'rgba(156,217,249,'+ _this.active+')';
            ctx.fill();
        };
    }

    // Util
    function getDistance(p1, p2) {
        return Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2);
    }
    
})();
</script>
    </body>
</html>
