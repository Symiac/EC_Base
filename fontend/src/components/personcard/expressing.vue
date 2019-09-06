<template>
  <div class="expressing">
    <div class="expressing-header">经历</div>
    <div class="express-body">
      <div v-for="item in items" :key="item.mid">
        <div v-if="item.mid%2==1" class="item clearfix">
          <div class="left time">{{ item.time }}</div>
          <div class="right">
            <div class="company">{{ item.company }}</div>
            <div class="position">{{ item.position }}</div>
          </div>
        </div>
        <div v-if="item.mid%2==0" class="item clearfix">
          <div class="left">
            <div class="company">{{ item.company }}</div>
            <div class="position">{{ item.position }}</div>
          </div>
          <div class="right time">{{ item.time }}</div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      items: [
        {
          time: "2016-12-08",
          company: "大连市啥也不会有限公司",
          position: "首席退堂鼓鼓手",
          mid: 1
        },
        {
          time: "2016-12-08",
          company: "大连市啥也不会有限公司",
          position: "首席退堂鼓鼓手",
          mid: 2
        },
        {
          time: "2016-12-08",
          company: "大连市啥也不会有限公司",
          position: "首席退堂鼓鼓手",
          mid: 3
        },
        {
          time: "2016-12-08",
          company: "大连市啥也不会有限公司",
          position: "首席退堂鼓鼓手",
          mid: 4
        }
      ]
    };
  }
};
</script>

<style scoped>
.expressing-header {
  width: 100%;
  height: 50px;
  font-size: 25px;
  font-weight: bold;
  line-height: 50px;
  border-bottom: 1px solid #5556;
  letter-spacing: 24px;
  font-family: "Times New Roman", Times, serif;
  text-decoration-line: blink;
  user-select: none;
  margin-bottom: 30px;
}
.express-body {
  width: 80%;
  margin: 12px auto;
}
.item {
  width: 100%;
  padding: 0;
  position: relative;
  transition: .5s;
}
.item:hover{
    box-shadow: 0px 0px 5px #369;
    transition: .8s;
}
.item:hover:before{
    height: 8px;
    width: 8px;
    border-radius: 4px;
    box-shadow: 0px 0px 5px rgb(13, 71, 129);
}
.item .left {
  float: left;
  width: 50%;
  height: 50px;
  border-right: 1px solid #000;
  box-sizing: border-box;
  margin: 0;
  /* background: #379; */
}
.item .time {
  line-height: 50px;
  color: #000;
}
.item:before {
  content: "";
  height: 6px;
  width: 6px;
  border-radius: 3px;
  border: 1px solid #000;
  position: absolute;
  left: 50%;
  top: 50%;
  transform: translate(-50%, -50%);
  background: #fff;
}

.item div {
  height: 25px;
  width: 100%;
  color: #000;
  font-size: 12px;
  line-height: 25px;
}
.item .right {
  float: left;
  width: 50%;
  height: 50px;
  margin: 0;
  /* background: #379; */
}
</style>