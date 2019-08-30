<template>
    <div class="ma-project">
        <ul class="clearfix">
            <li>
                <div class="p-wraper">
                    <div class="p-img"></div>
                    <div class="p-name-link">
                        <i class="fa fa-link ico" aria-hidden="true"></i>{{ pname }}
                    </div>
                </div>
            </li>
            <li>
                <div class="p-wraper">
                    <div class="p-img"></div>
                    <div class="p-name-link">
                        <i class="fa fa-link ico" aria-hidden="true"></i>{{ pname }}
                    </div>
                </div>
            </li>
            <li>
                <div class="p-wraper">
                    <div class="p-img"></div>
                    <div class="p-name-link">
                        <i class="fa fa-link ico" aria-hidden="true"></i>{{ pname }}
                    </div>
                </div>
            </li>
            <li>
                <div class="p-wraper">
                    <div class="p-img"></div>
                    <div class="p-name-link">
                        <i class="fa fa-link ico" aria-hidden="true"></i>{{ pname }}
                    </div>
                </div>
            </li>
        </ul>
    </div>
</template>

<script>
    export default {
        name:"ma-project",
        data(){
            return{
                pname:"projectName"
            }
        }
    }
</script>

<style scoped>
   .ma-project{
        height:100%;
        width:95%;
        margin: 0 auto;
        /* background: #333; */
    }
    ul{
        margin-top:25px;
        margin: 25px auto;
        display: block;
        width: auto;
    }
    li{
        float: left;
        width: 160px;
        height:120px;
        /* border:1px solid #000; */
    }
    .p-img{
        width: 120px;
        height:80px;
        margin:0 auto;
        background: rgba(79, 141, 170, 0.849);
    }
    .p-name-link{
        line-height: 40px;
        font-size: 14px;
        /* color: #6e7; */
        color: #4a5;
        cursor: pointer;
    }
    .p-name-link:hover{
        color: #6e7;
    }
    .ico{
        margin-right: 2px;

    }
</style>