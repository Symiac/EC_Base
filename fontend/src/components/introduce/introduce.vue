<template>
 <div class="introduce" id="introduce" :style="{'height':getheight}">
     <div class="i-header">
            <h1>电子商务专业简介</h1>
        </div>
     <div class="i-content" id="content" >
         <div class="c-left">
                <img src='@/assets/g7.jpg'>
         </div>
         <div class="c-right">
         <div class="text">
             <strong>培养目标：</strong>
             {{text1}}</div>
         <br>
         <div class="text">
              <strong>专业特色：</strong>
              {{text2}}</div>
           <br>
            <collapse>
            <div v-show="isActive">
            <div class="text">
              <strong>课程体系：</strong>
              {{text3}}</div>
           <br>
            </div>
            </collapse>
        
         <div class="more" id="more"> 
         <div class="icon">
                   
                    <a href="javascript:void(0);" @click="isActive = !isActive">   
                           <i :class="isActive ? 'fa fa-chevron-circle-up' : 'fa fa-chevron-circle-down'"  aria-hidden="true">{{word}}</i></a>
                        </div>
          </div>
         </div>
     </div>
   
 </div>
</template>

<script type="text/ecmascript-6">
import collapse from "./cc";
export default {
 data() {
 return {
      isActive: false,
       text1:"本专业主要培养具备现代管理和信息经济理念、掌握信息技术和电子服务综合技能、具有扎实的专业基础和良好的知识结构，具备一定的互联网创新创业素质，能从事网络环境下商务运营、专业管理和技术服务的复合型、应用型、创新型专业人才。",
       text2:"本专业高度重视学生创新能力的培养，强调商务与技术的融合、理论与实践的结合，突出信息技术、网络技术、商务智能在电子商务中的地位和作用。本专业围绕电子商务核心价值链，打造“四流（信息流、商流、资金流、物流）合一”的完整课程体系，并不断跟踪电子商务发展前沿优化课程内容，通过“重基础、宽视野、多渠道”的人才培养模式，在培养学生发现问题、分析问题、解决问题能力的基础上，重点培养电子商务系统设计、电子商务平台开发、电子商务管理与运营、商务模式创新、电商大数据分析与应用等专业能力。",
       text3:"电子商务经济学、运筹学、管理统计学、网络营销、网络金融与电子支付、电子商务网站设计、数据库原理、电子商务信息平台解决方案、商务模式创新、电子商务安全技术、移动商务与协同商务、电商APP开发、电子商务物流系统、商务智能方法与应用、跨境电子商务、电商大数据应用案例分析等。",
 }
 },
 components: {
     collapse 
 },
  computed: {
      word:function(){
      if(this.isActive == false){
          return '更多'
      }else{
        return '收起'
      }
    },
    getheight: function () {
        if(this.isActive == false){
            return '500px'
      }else{
        return '800px'
      }
    }
   
 },
 methods: {
    
 }
}
</script>

<style scoped>
.introduce{
    width: 100%;
    height: 500px;
    clear: both;
  
    
   /* text-align: center;*/
   /* background-color: #A6E3E9; */
}

.i-header{
    width:100%;
    height: 80px;
    line-height: 80px;
    color: #000;
    margin-top: 20px;
}
.i-header h1{
    font-size: 20px;
    font-weight: 700;
    font-family: "宋体"
}
.i-content{
    /* 此宽高属性可根据自己的需求更改 */
    width: 85%;
  /*  height:400px;  */
    clear: both;
    margin-left:10%;
   /* background: #eee;*/
    /* 关键代码 */
  /*  display: table-cell;*/
    text-align: left;
    vertical-align: middle;
}
.c-left{
    width: 25%;
   /* height: 200px;     /* 800px*/
  /*  line-height: 220px; */
    /*background-color: #e0e6c1;*/
    float: left;
}
img{
    margin-top: 50px;
    width: 100%;
    height: 280px;
    transition: all 0.5s ease;
}
 img:hover {
  opacity: 0.5;
  transform: scale(1.1); 
  transition: all 0.5s ease;
}
.c-right{
    margin-left: 30%;
  /*  background-color: rgb(158, 169, 170)*/
}

.text{
    /* 若该元素为行内或块级元素则必须设置以下属性 */
    display: inline-block;
    font-size: 18px;
    padding: 10px;
   
    line-height:2em;
    letter-spacing:1px;
    text-indent: 32px;
}
strong{
    font-weight: bold;
}
.more{
    float:right;
    margin-top: 5px;
  
    padding-right: 20px;
}

a:link,a:hover,a:active,a:visited{
    text-decoration:none;
    color: #000;
    }
</style>
