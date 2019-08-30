<template>
    <div class="ma-left">
        <div class="avator">
            <img src="../../assets/logo.png" alt="" srcset="">
        </div>
        <div class="selectlist">
            <ul>
                <li @click="showValue = item.id" v-for="item in valuelist" :class="item.show ? 'active':''" :key="item.id">
                    {{ item.name }}
                </li>
            </ul>
        </div>
    </div>
</template>

<script>
    export default {
        name:"ma-left",
        data(){
            return {
                showValue:0,
                valuelist:[
                    {id:0,name:"简介",show:true},
                    {id:1,name:"经历",show:false},
                    {id:2,name:"联系",show:false},
                    {id:3,name:"项目",show:false}
                ]
            }
        },
        watch:{
            showValue(to,from){
                window.console.log(from,to)
                this.valuelist[from].show = false;
                this.valuelist[to].show = true;
                this.$emit("valuechanged",[to,from])
            }
        }
    }
</script>

<style scoped>
    .ma-left{
        width: 190px;
        height:369px;
        background: #555;
        float: left;
        display: block;
        margin:0;
    }
    .avator img{ 
        width:190px;
        height:190px;
        border-radius: 50%;
        transition: .3s;
        /* box-shadow: 3px 3px 3px #000 */

    }
    .avator img:hover{ 
        width:190px;
        height:190px;
        border-radius: 0 0% 0% 0%;
        
    }
    .selectlist{
        height: 179px;
        width:100%;
        background: #eee;
        /* margin-top: 7px; */
    }
    .selectlist li{
        height: 44px;
        line-height: 45px;
        width: 100%;
        background: #ccc;
        cursor: pointer;
        display: block;
        position: relative;
    }
    .selectlist li:hover{
        background: #eee;
    }
    .active{
        background: #eee!important;
        

    }
    .active:before{
        /* content: ""; */
        content: "";
        position:absolute;
        left: 0px;
        top: 0px;
        width: 4px;
        height:44px;
        background: #77f;
        z-index:10000;
    }
</style>