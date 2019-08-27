<template>
 <div class="introduce">
     <div class="i-header">电子商务专业简介</div>
     <div class="i-content">
         <div class="text">
             <strong>培养目标：</strong>
             {{text1}}</div>
         <br>
         <div class="text">
              <strong>专业特色：</strong>
              {{text2}}</div>
           <br>
         <div class="text">
              <strong>主要课程：</strong>
              {{text3}}</div>
     </div>
     <div class="more"> 
         <div class="icon">
                    <a href="#">      <i class="fa fa-chevron-circle-down" aria-hidden="true">更多</i></a>
                        </div>
          </div>
 </div>
</template>

<script type="text/ecmascript-6">
export default {
 data() {
 return {
       text1:"本专业主要培养具备现代管理和信息经济理念、掌握信息技术和电子服务综合技能、具有扎实的专业基础和良好的知识结构，具备一定的互联网创新创业素质，能从事网络环境下商务运营、专业管理和技术服务的复合型、应用型、创新型专业人才。",
       text2:"本专业高度重视学生创新能力的培养，强调商务与技术的融合、理论与实践的结合，突出信息技术、网络技术、商务智能在电子商务中的地位和作用。本专业围绕电子商务核心价值链，打造“四流（信息流、商流、资金流、物流）合一”的完整课程体系，并不断跟踪电子商务发展前沿优化课程内容，通过“重基础、宽视野、多渠道”的人才培养模式，在培养学生发现问题、分析问题、解决问题能力的基础上，重点培养电子商务系统设计、电子商务平台开发、电子商务管理与运营、商务模式创新、电商大数据分析与应用等专业能力。",
       text3:"电子商务经济学、运筹学、管理统计学、网络营销、网络金融与电子支付、电子商务网站设计、数据库原理、电子商务信息平台解决方案、商务模式创新、电子商务安全技术、移动商务与协同商务、电商APP开发、电子商务物流系统、商务智能方法与应用、跨境电子商务、电商大数据应用案例分析等。",
 }
 },
 components: {

 }
}
</script>

<style scoped>
.introduce{
    width: 100%;
    height: 550px;
    clear: both;
   /* text-align: center;*/
    background-color: #A6E3E9;
}

.i-header{
    height: 50px;
    font-size: 20px;
    line-height: 50px;
    font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;
    font-weight: bold;
    padding-top: 20px;
   

}
.i-content{
    /* 此宽高属性可根据自己的需求更改 */
    width: 80%;
    height:400px;
    clear: both;
    margin-left:10%;
   /* background: #eee;*/
    /* 关键代码 */
  /*  display: table-cell;*/
    text-align: left;
    vertical-align: middle;
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
    margin-top: 30px;
    margin-bottom: 10px;
}

a:link,a:hover,a:active,a:visited{
    text-decoration:none;
    color: #000;
    }
</style>
