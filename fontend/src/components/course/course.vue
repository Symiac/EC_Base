<template>

 <div class="course" id="course">
     <div class="c-header" >
            <h1>课程体系</h1>
        </div>
          <div class="row">
          
            <div class="col-md-6">
               <div class="cc">
                <div class="image">
                  <div class="image-bg">
                    <img src="@/assets/shu.jpg" alt="课程图片（书本）">
                  </div>
                </div>
                <div class="text">
                  <h3>课程名字</h3>
                  <p>描述Laboriosam pariatur modi praesentium deleniti molestiae officiis atque numquam quos quis nisi voluptatum architecto rerum error。</p>
                   
                      <div class="mask" v-if="showModal" @click="showModal=false"></div>   
                        <div class="pop" v-if="showModal">
                     <button @click="showModal=false" class="btn btn-danger btn-xs" id="close">
                       <i class="fa fa-times-circle" aria-hidden="true"></i>
                       </button>

                       <div class="morecontent">
                         <div class="left">
                         <h3>课程名称</h3>
                          <span> 这是教师详情</span>
                         </div>
                         <div class="right">
                           <img src="">
                         </div>
                       </div>
                     </div>

                   <button @click="showModal=true" class="btn btn-primary">more information</button>
                   
                </div>
                
              </div>

              <div class="cc">
                <div class="image">
                  <div class="image-bg">
                    <img src="@/assets/shu.jpg" alt="Free Bootstrap Template by sc.chinaz.com">
                  </div>
                </div>
                <div class="text">
                  <h3>课程名字</h3>
                  <p>描述Laboriosam pariatur modi praesentium deleniti molestiae officiis atque numquam quos quis nisi voluptatum architecto rerum error。</p>
                  <p><button class="btn btn-primary">more information</button> </p>
                </div>
              </div>

            </div>
             <div class="col-md-6">
               <div class="cc">
                <div class="image">
                  <div class="image-bg">
                    <img src="@/assets/shu.jpg" alt="Free Bootstrap Template by sc.chinaz.com">
                  </div>
                </div>
                <div class="text">
                  <h3>课程名字</h3>
                  <p>描述Laboriosam pariatur modi praesentium deleniti molestiae officiis atque numquam quos quis nisi voluptatum architecto rerum error。</p>
                  <p><button class="btn btn-primary">more information</button> </p>
                </div>
                
              </div>

              <div class="cc">
                <div class="image">
                  <div class="image-bg">
                    <img src="@/assets/shu.jpg" alt="Free Bootstrap Template by sc.chinaz.com">
                  </div>
                </div>
                <div class="text">
                  <h3>课程名字</h3>
                  <p>描述Laboriosam pariatur modi praesentium deleniti molestiae officiis atque numquam quos quis nisi voluptatum architecto rerum error。</p>
                   <p><button class="btn btn-primary">more information</button> </p>
                </div>
              </div>

                

            </div>
 
           
          </div>
           <div class="more"> 
         <div class="icon">
                    <a href="./allcourse">      <i class="fa fa-chevron-circle-down" aria-hidden="true">更多</i></a>
                        </div>
          </div>
 </div>
</template>

<script type="text/ecmascript-6">
export default {
 data() {
 return {
      showModal: false
 }
 },
 components: {

 },
 methods: {
  
 }
 
}
</script>

<style scoped>
.course{
    margin-top: 30px;
    margin-left: 10%;
    width: 80%;
    height: 300px;
 /*    background: cornflowerblue;  */
}
.c-header{
    width:100%;
    height: 80px;
    line-height: 80px;
    color: #000;
    margin-top: 20px;
}
.c-header h1{
    font-size: 20px;
    font-weight: 700;
    font-family: "宋体"
}
.col-md-6{
    position: relative;

/*    min-height: 1px;  
    padding-right: 15px;
    padding-left: 15px;*/
}
.cc{
    width: 100%;
   float: left;
    clear: both;
    margin-left:10%;
    margin-bottom: 20px;
    text-align: left;
    vertical-align: middle;
}
.image{
    float: left;
    width: 40%;
    
}
img{
    width: 80%;
    height: 200px;
    transition: all 0.5s ease;
}
.text{
    margin-left: 35%;
    margin-top: 20px;
    height: 200px;
}
p{
    margin-bottom: 30px;
    margin-top: 30px;
}
h3{
    font-size: 20px;
    font-weight:bold;
    

}
.more{
    float:right;
    margin: 20px;
   color: #000;
    padding-right: 20px;
}
a:link,a:hover,a:active,a:visited{
    text-decoration:none;
    color: #000;
    }
 img:hover {
  opacity: 0.6;
 /* transform: scale(0.9); */
 /* transition: all 0.5s ease;*/
}
.btn:hover{

   transform:scale(1.1);
  transition: all 0.3s ease;
}

.mask {
  background-color: #666a73;
  opacity: 0.5;
  position: fixed;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  z-index: 1
}
.pop {
  background-color: rgba(208, 209, 211, 0.658);
 
  position: fixed;
  top: 100px;
  left: 300px;
  width: calc(100% - 600px);
  height:calc(100% - 200px);
  z-index: 2;
 
 
}
#close{
  float: right;
}
.morecontent{
  margin-top: 20px;
}
</style>
