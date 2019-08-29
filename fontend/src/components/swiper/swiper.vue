<template>
    <div>
       
      <!--  <div class="card">
        
       <img src='@/assets/c2.png'>
       <img src='@/assets/c3.jpeg'>
       <img src='@/assets/c4.jpg'>
       <img src='@/assets/xigua.jpg'>
      
      
       
        </div>
        -->
     <div class="card">
        <swiper :options="swiperOption" class="swiper-container swiper-pagination1"  ref="mySwiper">
        <!-- 添加的图片 -->
        <swiper-slide>
         
          <img class="banner-img" src="@/assets/c2.png" /> </swiper-slide>
        <swiper-slide><img class="banner-img" src="@/assets/c3.jpeg"/> </swiper-slide>
        <swiper-slide><img class="banner-img" src="@/assets/c4.jpg"/> </swiper-slide>
        <swiper-slide><img class="banner-img" src="@/assets/xigua.jpg"/> </swiper-slide>
        <!-- Optional controls -->
        <div class="swiper-pagination"  slot="pagination"></div>
        <div class="swiper-button-prev" slot="button-prev"></div>
        <div class="swiper-button-next" slot="button-next"></div>
        </swiper>
        
     </div> 
       
      <introduce></introduce> 
      <ecshow></ecshow>
      <alumnus></alumnus>
      
      
    </div>
</template>

<script>


   require('swiper/dist/css/swiper.css');
  import { swiper, swiperSlide } from 'vue-awesome-swiper'
  import 'swiper/dist/css/swiper.css'
  import introduce from '../introduce/introduce'
  import alumnus from '../alumnus/alumnus'
  import ecshow from '../ecshow/ecshow'
  //import teacher from '../teacher/teacher'
    export default {
        name:"v-swiper",

        components:{
          swiper,
      swiperSlide,
         introduce,
         alumnus,
         ecshow
        
        },
         data() {
      return {
        swiperOption: {
       //   pagination: '.swiper-pagination1',
          slidesPerView: 1,
     //     spaceBetween: 30,
          centeredSlides: false,
          spaceBetween: 0,
          onSlideChangeEnd: swiper => {
            //这个位置放swiper的回调方法
            this.page = swiper.realIndex+1;
            this.index = swiper.realIndex;
          },
          navigation: {
            nextEl: '.swiper-button-next',
            prevEl: '.swiper-button-prev',
          },
          //自动播放
          autoplay:{
            delay:2000,
            disableOnInteraction:false
          },
          pagination: {
            el: '.swiper-pagination',
            clickable: true,
          },
          //循环
          loop:true
        }
      }
    },
    //定义swiper对象
    computed: {
      swiper() {
        return this.$refs.mySwiper.swiper;
      }
    },
    mounted () {
      this.swiper.slideTo(0, 0, false);
    }
 



    }
</script>

<style scoped>



.card {
 
    clear: both;
	width: 100%;
	height: 750px;

}
.banner-img{
    width: 100%;  
    height: 750px; 
}






</style>