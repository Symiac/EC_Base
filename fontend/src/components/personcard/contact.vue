<template>
    <div class="ma-contact">
        <div class="c-info">
            <div class="titl">
                    Contact Information
            </div>
            <div class="list clearfix">
                <ul>
                    <li>
<i class="fa fa-phone" aria-hidden="true"></i>:{{ phone }}
                    </li>
                    <li>
<i class="fa fa-qq" aria-hidden="true"></i>:{{ qq }}
                    </li>
                    <li>
<i class="fa fa-weixin" aria-hidden="true"></i>:{{ weixin }}
                    </li>
                    <li>
<i class="fa fa-envelope" aria-hidden="true"></i>:{{ weixin }}
                    </li>
                </ul>
            </div>
        </div>
        <div class="c-info">
            <div class="titl">
                    Contact Information
            </div>
            <div class="list clearfix">
                <ul>
                    <li>
<i class="fa fa-phone" aria-hidden="true"></i>:{{ phone }}
                    </li>
                    <li>
<i class="fa fa-qq" aria-hidden="true"></i>:{{ qq }}
                    </li>
                    <li>
<i class="fa fa-weixin" aria-hidden="true"></i>:{{ weixin }}
                    </li>
                    <li>
<i class="fa fa-envelope" aria-hidden="true"></i>:{{ weixin }}
                    </li>
                </ul>
            </div>
        </div>
    </div>
</template>

<script>
    export default {
        name:"ma-contact",
        data(){
            return{
                phone:"18712341234",
                qq:"228787336",
                weixin:"jhsung"
            }
        }
    }
</script>

<style scoped>
    .ma-contact{
        width: 95%;
        height: 369px;
        margin: 0 auto;
        /* background: #77e; */
        box-sizing: border-box;
        padding-top:12px;
    }
    .titl{
        text-align: left;
        border-bottom: 1px solid #777;
        height: 45px;
        font-size: 25px;
        line-height: 40px;
        /* margin-top: 28px; */
        box-sizing: border-box;
        display: block;
    }
    .list {
        margin-top: 12px;
    }
    .list li{
        width: 48%;
        height:40px;
        /* background: #777; */
        float: left;
        text-align: left;
        box-sizing: border-box;
        line-height: 40px;
        letter-spacing: 1px;
    }
</style>