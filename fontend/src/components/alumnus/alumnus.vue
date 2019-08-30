<template>
 <div class="show" id="alumnus">
    <div class="s-header">
            <h1>优秀校友</h1>
    </div>
    <div class="card-carousel-wrapper">
    <div class="card-carousel--nav__left" @click="moveCarousel(-1)" :disabled="atHeadOfList"></div>
    <div class="card-carousel">
      <div class="card-carousel--overflow-container">
        <div class="card-carousel-cards" :style="{ transform: 'translateX' + '(' + currentOffset + 'px' + ')'}">
         <div @click="show" class="card-carousel--card" v-for="item in items" v-bind:key="item"><img class="imgs" src="@/assets/36.png">
            <div class="card-carousel--card--footer">
              <p>{{ item.name }}</p>
              <p>{{ item.tag }}</p>
            </div>
          </div>
        </div>
      </div>
    </div>

    <div class="card-carousel--nav__right" @click="moveCarousel(1)" :disabled="atEndOfList"></div>
    <div :class="isShow" class="personShow">
      <div @click="closeShow" class="close">
        <i class="fa fa-times-circle" aria-hidden="true"></i>
      </div>
        <v-person></v-person>
    </div>
  </div>
 </div>
</template>

<script type="text/ecmascript-6">
import personCard from '../personcard/personcard'
export default {
 data() {
 return {
       currentOffset: 0,
      windowSize: 4,
      paginationFactor: 290,
      items: [
        {name: '张三', tag: "读研"},
        {name: '李四', tag: "创业"},
        {name: '王五', tag: "考研"},
        {name: '赵六', tag: "销售"},
        {name: '刘淇', tag: "测试"},
        {name: '高坝', tag: "产品经理"},
        {name: '黄酒', tag: "算法"},
        {name: '钱十', tag: "后端"},
        {name: '孙艺', tag: "前端"},
        {name: '乔二', tag: "考公"},
      ],
      isShow:''
  }
 },
 components: {
   "v-person":personCard
 },
  computed: {
    atEndOfList() {
      return this.currentOffset <= (this.paginationFactor * -1) * (this.items.length - this.windowSize);
    },
    atHeadOfList() {
      return this.currentOffset === 0;
    },
  },
  methods: {
    moveCarousel(direction) {
      // Find a more elegant way to express the :style. consider using props to make it truly generic
      if (direction === 1 && !this.atEndOfList) {
        this.currentOffset -= this.paginationFactor;
      } else if (direction === -1 && !this.atHeadOfList) {
        this.currentOffset += this.paginationFactor;
      }
    },
    show(){
      this.isShow = "person-show"
    },
    closeShow(){
      this.isShow = "person-nshow"
    }
  }
}
</script>

<style scoped>
.show{
margin-top:30px;
display: block;

}
.s-header{
    width:100%;
    height: 80px;
    color: #000
}
.s-header h1{
    font-size: 20px;
    font-weight: 700;
    font-family: "宋体"
}
.card-carousel-wrapper {
  display: flex;
  align-items: center;
  justify-content: center;
  margin: 0px 0 40px;
  color: #666a73;
}

.card-carousel {
  display: flex;
  justify-content: center;
  width: 80%;
}
.card-carousel--overflow-container {
  overflow: hidden;
}
.imgs{
  width: 270px;
  height: 270px;
}
.card-carousel--nav__left, .card-carousel--nav__right {
  display: inline-block;
  width: 15px;
  height: 15px;
  padding: 10px;
  box-sizing: border-box;
  border-top: 2px solid black;
  border-right: 2px solid black;
  cursor: pointer;
  margin: 0 10px;
  transition: transform 150ms linear;
}
.card-carousel--nav__left[disabled], .card-carousel--nav__right[disabled] {
  opacity: 0.5;
  border-color: black;
}
.card-carousel--nav__left {
  transform: rotate(-135deg);
}
.card-carousel--nav__left:active {
  transform: rotate(-135deg) scale(0.9);
}
.card-carousel--nav__right {
  transform: rotate(45deg);
}
.card-carousel--nav__right:active {
  transform: rotate(45deg) scale(0.9);
}

.card-carousel-cards {
  display: flex;
  transition: transform 150ms ease-out;
  transform: translatex(0px);
}
.card-carousel-cards .card-carousel--card {
  margin: 0 10px;
  cursor: pointer;
  box-shadow: 0 4px 15px 0 rgba(40, 44, 53, 0.06), 0 2px 2px 0 rgba(40, 44, 53, 0.08);
  background-color: #fff;
  border-radius: 4px;
  z-index: 3;
  margin-bottom: 2px;
}
.card-carousel-cards .card-carousel--card:first-child {
  margin-left: 0;
}
.card-carousel-cards .card-carousel--card:last-child {
  margin-right: 0;
}
.card-carousel-cards .card-carousel--card img {
  vertical-align: bottom;
  border-top-left-radius: 4px;
  border-top-right-radius: 4px;
  transition: opacity 150ms linear;
  user-select: none;
}
.card-carousel-cards .card-carousel--card img:hover {
  opacity: 0.5;
}
.card-carousel-cards .card-carousel--card--footer {
  border-top: 0;
  padding: 7px 15px;
}
.card-carousel-cards .card-carousel--card--footer p {
  padding: 3px 0;
  margin: 0;
  margin-bottom: 2px;
  font-size: 19px;
  font-weight: 500;
  color: #2c3e50;
  user-select: none;
}
.card-carousel-cards .card-carousel--card--footer p:nth-of-type(2) {
  font-size: 12px;
  font-weight: 300;
  padding: 6px;
  background: rgba(40, 44, 53, 0.06);
  display: inline-block;
  position: relative;
  margin-left: 4px;
  color: #000;
}
.card-carousel-cards .card-carousel--card--footer p:nth-of-type(2):before {
  content: "";
  float: left;
  position: absolute;
  top: 0;
  left: -12px;
  width: 0;
  height: 0;
  border-color: transparent rgba(40, 44, 53, 0.06) transparent transparent;
  border-style: solid;
  border-width: 12px 12px 12px 0;
}
.card-carousel-cards .card-carousel--card--footer p:nth-of-type(2):after {
  content: "";
  position: absolute;
  top: 10px;
  left: -1px;
  float: left;
  width: 4px;
  height: 4px;
  border-radius: 2px;
  background: white;
  box-shadow: -0px -0px 0px #004977;
}
.personShow{
  position:fixed;
  left:0;
  top:0;
  background:#4449;
  width:100%;
  height:100%;
  z-index :100;
  transform: scaleY(0)scaleX(.2);
  transform-origin: top center;
  transition: .8s;
}
.person-show{
  transform: scaleY(1)scaleX(1);
}
.person-nshow{
  transform: scaleY(0)scaleX(.2);
}
.close{
  font-size: 50px;
  margin:120px auto;
  width:50px;
  height:50px;
  color:#fafaaa;
  
}
.close:hover{
  transform:scale(2)
}
</style>
