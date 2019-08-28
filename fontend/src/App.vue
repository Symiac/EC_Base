<template>
  <div id="app">
    <canvas id="canvas" style="position:fixed;top:0px;left:0px;z-index:1;"></canvas>
    <v-header></v-header>
    <v-swiper></v-swiper>
    <v-activities></v-activities>
    <v-outlink></v-outlink>
    <v-footer></v-footer>
  </div>
</template>

<script>
import swiper from './components/swiper/swiper'
import header from './components/header/header'
import activities from './components/activities/activities'
import outlink from './components/outlink/outlink'
import footer from './components/footer/footer'
export default {
  name: 'app',
  components: {
    "v-header":header,
    "v-swiper":swiper,
    'v-activities':activities,
    'v-outlink':outlink,
    'v-footer':footer
  },
  mounted(){
    var canvas = document.getElementById('canvas'); 
          //获得画笔
          var ctx = canvas.getContext('2d'); 
          //canvas设置宽度
          canvas.width = window.innerWidth; 
          //canvas设置高度
          canvas.height = window.innerHeight;
          //如果浏览器支持requestAnimFrame则使用requestAnimFrame否则使用setTimeout 
          window.requestAnimFrame = (function(){ 
          return window.requestAnimationFrame  || 
            window.webkitRequestAnimationFrame || 
            window.mozRequestAnimationFrame || 
            function( callback ){ 
                 window.setTimeout(callback, 1000 / 60); 
            }; 
          })(); 
          // 波浪大小
          var boHeight = canvas.height / 10;
          var posHeight = canvas.height / 1.2;
          //初始角度为0 
          var step = 0; 
          //定义三条不同波浪的颜色 
          var lines = ["rgba(0,222,255, 0.2)", "rgba(157,192,249, 0.2)", "rgba(0,168,255, 0.2)"]; 
          function loop(){ 
              //清除canvas内容
               ctx.clearRect(0,0,canvas.width,canvas.height); 
               step++; 
               //画3个不同颜色的矩形 
               for(var j = lines.length - 1; j >= 0; j--) { 
                ctx.fillStyle = lines[j]; 
                //每个矩形的角度都不同，每个之间相差45度 
                var angle = (step+j*50)*Math.PI/180; 
                var deltaHeight = Math.sin(angle) * boHeight;
                var deltaHeightRight = Math.cos(angle) * boHeight; 
                ctx.beginPath();
                ctx.moveTo(0, posHeight+deltaHeight); 
                ctx.bezierCurveTo(canvas.width/2, posHeight+deltaHeight-boHeight, canvas.width / 2, posHeight+deltaHeightRight-boHeight, canvas.width, posHeight+deltaHeightRight); 
                ctx.lineTo(canvas.width, canvas.height); 
                ctx.lineTo(0, canvas.height); 
                ctx.lineTo(0, posHeight+deltaHeight); 
                ctx.closePath(); 
                ctx.fill(); 
           }
           window.requestAnimFrame(loop);
          } 
          loop(); 
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  /* margin-top: 60px; */
}
body{
  width: 100%;
  height: auto;
  background:  linear-gradient(#69daf7,rgb(79, 114, 253));
  /* background: -webkit-linear-gradient(left top, #5edfff , #3E64FF);
  background: -o-linear-gradient(bottom right, #5edfff, #3E64FF);
  background: linear-gradient(to bottom right, #5edfff  , #3E64FF); 标准的语法 */
}

</style>
