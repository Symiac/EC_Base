<template>
    <div class="about">
        <div class="title">
            <div class="name">{{ name }}</div>
            <div class="desc">{{ desc }}</div>
        </div>
        <div class="body">
            <p v-for="item in paras" :key="item.id">
                {{ item }}
            </p>
        </div>
    </div>
</template>

<script>
    export default {
        data(){
            return {
                name:"黄骐",
                desc:"业余打手",
                paras:[
                    "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
                    "Has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it."
                ]
            }
        }
    }
</script>

<style scoped>
    .about{
        height:100%;
        width:95%;
        margin: 0 auto;
        /* background: #333; */
    }
    .title{
        height: 80px;
        width: 100%;
        /* background: #59e; */
        text-align: left;
        border-bottom: 1px solid #666;
    }
    .name{
        height:50px;
        font-size: 30px;
        line-height: 50px;
    }
    .desc{
        font-weight: 700;
        color: rgba(100, 100, 100, .7)
    }
    .body{
        padding-top:20px;
        line-height: 250%;
        text-align: left;
        text-indent: 50px;
    }
</style>