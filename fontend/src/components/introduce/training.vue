<template>
 <div class="training" id="training">
     <div class="t-header">
            <h1>电子商务专业培养计划</h1>
        </div>
     <div class="i-content">
         <div class="c-left">
              <div class="text">
             <strong>培养目标：</strong>
             {{text1}}</div>
         <br>
         <div class="text">
              <strong>主要课程：</strong>
              {{text2}}</div>
           <br>
            <div class="text">
              <strong>就业前景：</strong>
              {{text3}}</div>
              <a href="#">附件下载：培养计划2019.dox</a>
   
         <div class="more"> 
         <div class="icon">
                    <a href="#">      <i class="fa fa-chevron-circle-down" aria-hidden="true">更多</i></a>
                        </div>
          </div>
              
         </div>
         <div class="c-right">
              <img src='@/assets/xigua.jpg'>
         </div>
     </div>
   
 </div>
</template>

<script type="text/ecmascript-6">
export default {
 data() {
 return {
      text1:"本专业面向电子商务发展需求，结合交通运输行业特色，主要培养具有电子商务创新思维，掌握电子商务运营模式，具有电子商务系统开发与设计技能、商业智能分析能力的高级专业人才。",
      text2:"微观经济学、管理学、运筹学、管理统计学、网络营销、网络金融与电子支付、电子商务网站设计、数据库原理、信息系统分析与设计、计算机网络及设计、电子商务安全技术、电子商务经济学、移动商务与协同商务、商业智能等。",
      text3:"本专业毕业生主要在交通运输企业、IT企业、保险业、金融机构等企事业单位从事电子商务的网络营销、商业智能、电子商务系统开发和运行维护等工作。"
 }
 },
 components: {

 }
}
</script>

<style scoped >
.training{
    width: 100%;
    height: 500px;
    clear: both;
   /* text-align: center;*/
    /* background-color: #A6E3E9; */
}

.t-header{
    width:100%;
    height: 80px;
    color: #000;
    margin-top: 30px;
}
.t-header h1{
    font-size: 20px;
    font-weight: 700;
    font-family: "宋体"
}
.i-content{
    /* 此宽高属性可根据自己的需求更改 */
    width: 85%;
    height:400px;
    clear: both;
    margin-left:10%;
   /* background: #eee;*/
    /* 关键代码 */
  /*  display: table-cell;*/
    text-align: left;
    vertical-align: middle;
}
.c-left{
    width: 65%;
   /* height: 200px;     /* 800px*/
  /*  line-height: 220px; */
    /*background-color: #e0e6c1;*/
    float: left;
}

.c-right{
    margin-left: 73%;
  /*  background-color: rgb(158, 169, 170)*/
}
.c-right img{
    margin-top: 50px;
    width: 100%;
    height: 280px;
    transition: all 0.5s ease;
}
.c-right img:hover {
  opacity: 0.6;
  transform: scale(1.2); 
  transition: all 0.5s ease;
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
   text-align: center;
    margin-top: 5px;
  
    padding-right: 20px;
}

a:link,a:hover,a:active,a:visited{
    text-decoration:none;
    color: #000;
    }
</style>
