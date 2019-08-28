<template>
  <div   class="v-header">
    <div ref="v-header" class="inner clearfix">
      <div class="logo">
       <img src="../../assets/banner.jpg" alt srcset>  
      </div>
      <div class="headerlist">
        <ul>
          <li v-for="item in navlist" :key="item.id">{{ item.name }}</li>
        </ul>
      </div>

      <div class="loginbar">
        <div class="btn">登录/注册</div>
      </div>
      <div class="search">
        <input type="text" placeholder="search">
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "v-header",
  data() {
    return {
      navlist: [
        { id: 1, name: "首页" },
        { id: 2, name: "首页" },
        { id: 3, name: "首页" },
        { id: 4, name: "首页" },
        { id: 5, name: "首页" },
        { id: 6, name: "首页" },
        { id: 7, name: "首页" }
      ]
    };
  },
  methods: {
    handleScroll() {
      var e = document.body.scrollTop || document.documentElement.scrollTop;
      window.console.log("e",e)
      if (this.$refs["v-header"] != undefined) {
      window.console.log("f",e)
          if(e>40){
          this.$refs["v-header"].style.top = e + "px";
          }else{
            this.$refs["v-header"].style.top = 0 + "px";
          }
      }
    }
  },
  mounted(){
      document.onscroll= this.handleScroll
  }
};
</script>

<style scoped>
.v-header {
  width: 100%;
  height: 40px;
  border-bottom: 1px solid #333;
  
}
.inner {
  position: absolute;
  background:#6eb6ff;
  z-index: 122222222222222;
  left: 0;
  top: 0;
  width: 100%;
  height: 40px;
  /* background: rgba(50, 100, 150, .7) */
}
.logo {
  float: left;
  height: 40px;
  width: 140px;
  margin-left: 40px;
}
.logo img {
  width: 140px;
  height: 24px;
  margin-top: 8px;
}
.headerlist {
  margin-left: 30px;
  float: left;
}
.headerlist li {
  float: left;
  line-height: 40px;
  margin-left: 15px;
}
.search {
  float: right;
  height: 40px;
}
.search input {
  /* line-height: 40px; */
  outline: none;
  border-radius: 10px;
  height: 24px;
  box-sizing: border-box;
  margin-top: 8px;
  padding: 3px 12px;
  border: 1px solid rgb(100, 95, 95);
  margin-right: 30px;
  width: 100px;
  transition: .5s;
  background: none;
}

.search input:focus{
  width: 300px;
}
.loginbar {
  height: 40px;
  float: right;
  line-height: 40px;
  margin-right: 30px;
}
</style>