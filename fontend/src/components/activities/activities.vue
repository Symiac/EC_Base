<template>
    <div class="activities clearfix" id="activities">
       <div class="a-header" >
            <h1>公告通知</h1>
        </div>
        <div class="a-items">
            <ul class="clearfix">
                <li :class="liwidth" v-for="item in itemList" :key="item.id">
                   <div class="a-item">
                        <div class="itemimg">
                            <img src="../../assets/logo.png" alt="">
                        </div>
                        <div class="iteminfo">
                            <div class="i-title">{{ item.title }}</div>
                            <div class="a-desc">{{ item.desc }}</div>
                        </div>
                        
                    </div>
                </li>
            </ul>
        </div>
    </div>
</template>

<script>
    export default {
        name:"v-activities",
        data(){
            return{
                itemList:[
                    {id:1,title:"title",desc:"对活动简单的描述balabalablablablablabla",imgurl:"../../assets/logo.png"},
                    {id:1,title:"title",desc:"对活动简单的描述balabalablablablablabla",imgurl:"../../assets/logo.png"},
                    {id:1,title:"title",desc:"对活动简单的描述balabalablablablablabla",imgurl:"../../assets/logo.png"},
                    {id:1,title:"title",desc:"对活动简单的描述balabalablablablablabla",imgurl:"../../assets/logo.png"},
                    {id:1,title:"title",desc:"对活动简单的描述balabalablablablablabla",imgurl:"../../assets/logo.png"},
                    {id:1,title:"title",desc:"对活动简单的描述balabalablablablablabla",imgurl:"../../assets/logo.png"},
                    {id:1,title:"title",desc:"对活动简单的描述balabalablablablablabla",imgurl:"../../assets/logo.png"},
                    {id:1,title:"title",desc:"对活动简单的描述balabalablablablablabla",imgurl:"../../assets/logo.png"},
                   
                    
                ]
            }
        },
        computed:{
            liwidth(){
                if(this.itemList.length<4||this.itemList.length>0){
                    return 'li-'+(this.itemList.length)
                }
                return ''
            }
        }
    }
</script>

<style  scoped>
.activities{
 margin-top: 30px;
 /* height: 300px; */
 /* background: #333; */
}
.a-header{
    width:100%;
    height: 80px;
    line-height: 80px;
    color: #000;
    margin-top: 20px;
}
.a-header h1{
    font-size: 20px;
    font-weight: 700;
    font-family: "宋体"
}
.a-items{
    width: 85%;
    height: auto;
    margin: 0 auto
}
.a-items li{
    width: 25%;
    float: left;
}
.a-items .li-3{
    width: 33.3%;
}
.a-items .li-2{
    width: 50%;
}
.a-items .li-1{
    width: 100%
}
.a-items .a-item{
    width: 180px;
    height: 240px;
    /* border: 1px solid #777; */
    background: #14b1fa88;
    
    margin:12px auto;
    padding: 0;
    box-sizing: border-box;
    transition:  .3s linear
}
.a-items .a-item:hover{
    box-shadow: 10px 5px 4px #333;
    transform: translate(0px,-5px)
}
.itemimg img{
    width: 100%;
    height: 160px;
    border-bottom: 1px solid #777;
}
.i-title{
    text-align: left;
    line-height: 200%;
    padding-left: 12px;
}
.a-desc{
    font-size: 12px;
    padding-left: 12px;
    text-align: left;
    text-indent: 5px;
}
</style>