<template>
  <div class="app-container home">
    <el-row :gutter="20">
      <el-col :sm="24" :lg="24">
        <blockquote class="text-warning">
          <div class="body">
            <img
              src="@/assets/images/main.png"
              alt="main"
              width="100%"
              height="400px"
            />
          </div>
        </blockquote>

        <hr />
      </el-col>
    </el-row>
    <el-row :gutter="20">
      <el-col :sm="24" :lg="12" style="padding-left: 40px">
        <h2>Vue公寓</h2>
        <p>
          欢迎来到 Vue 公寓！我们是一家位于市区的的高品质公寓社区，致力于为您打造舒适便捷的居住环境。我们的公寓户型多样，从精致的一居室到宽敞的三居室，满足不同居住需求。房间内配备品牌家电、高档家具以及宽敞的阳台，让您享受轻松愉悦的生活。周边交通便利，购物、餐饮、娱乐设施一应俱全，让您的生活更加丰富多彩。快来入住 Vue 公寓，体验都市生活的优雅与便捷吧！        <p>
        </p>
        <p>
          <el-tag type="danger">市中心位置</el-tag>&nbsp
          <el-tag type="danger">豪华住宿</el-tag>&nbsp
          <el-tag type="danger">豪华住宿</el-tag>&nbsp
          <el-tag type="danger">交通便利</el-tag>
        </p>
        <p>
          <el-button
            size="mini"
            icon="el-icon-cloudy"
            plain
            @click="goTarget('https://eb.meituan.com/ebk/login/login.html?redirect=https%3A%2F%2Feb.meituan.com%2Febooking%2Fnew-workbench%2Findex.html')"
            >美团</el-button
          >
          <el-button
            size="mini"
            icon="el-icon-cloudy"
            plain
            @click="goTarget('https://hotels.ctrip.com/')"
            >携程</el-button
          >
        </p>
      </el-col>

      <el-col :sm="24" :lg="12" style="padding-left: 50px">
        <el-row>
          <el-col :span="12">
            <h2>房间款式</h2>
          </el-col>
        </el-row>
        <el-row>
          <el-col :span="6">
            <h4>经济房</h4>
            <ul>
              <li>价格实惠</li>
              <li>价格实惠</li>
              <li>简约装修</li>
              <li>适合单身人士</li>
              <li>...</li>
            </ul>
          </el-col>
          <el-col :span="6">
            <h4>商品房</h4>
            <ul>
              <li>价格适中</li>
              <li>空间适中</li>
              <li>现代装修</li>
              <li>适合小家</li>
              <li>...</li>
            </ul>
          </el-col>
          <el-col :span="6">
            <h4>豪华套房</h4>
            <ul>
              <li>空间宽敞</li>
              <li>服务一流</li>
              <li>奢华装修</li>
              <li>设施顶级</li>
              <li>...</li>
            </ul>
          </el-col>
        </el-row>
      </el-col>
    </el-row>
    <el-divider />
    <el-row :gutter="20">
      <el-col :xs="24" :sm="24" :md="12" :lg="8">
        <el-card class="update-log">
          <div slot="header" class="clearfix">
            <span>联系信息</span>
          </div>
          <div class="body">
            <p>
                联系人：邹群
            </p>
            <p>
              <i class="el-icon-user-solid"></i> QQ：1092404442
            </p>
            <p>
              <i class="el-icon-mobile"> 手机号：13086509193</i>
            </p>

          </div>
        </el-card>
      </el-col>
      <el-col :xs="24" :sm="24" :md="12" :lg="8">
        <el-card class="update-log">
          <div slot="header" class="clearfix">
            <span>入住须知</span>
          </div>
          <el-collapse accordion>
            <ol>1.入住时间：酒店客房的入住时间为当日 14:00 以后，退房时间为次日 12:00 以前。如需提前入住或延迟退房，请提前与酒店前台联系，我们将根据实际情况为您提供便利。</ol>
            <ol>2.登记入住：请在入住时出示您的id（官网注册），并提供联系方式。每位入住的客人都需要进行身份登记。</ol>
            <ol>3.客房押金：在办理入住手续时，请您缴纳一定的客房押金。押金将在您退房时退还。具体金额请咨询酒店前台。</ol>
            <ol>4.贵重物品保管：请将贵重物品存放于酒店前台提供的保险箱内，切勿放置在客房内。酒店对未存放于保险箱的贵重物品不负责任。</ol>
            <ol>5.用电安全：请正确使用客房内的电器设备，避免使用非酒店提供的电器。禁止在客房内使用明火。</ol>
            <ol>6.客房卫生：请保持客房内的整洁卫生，不要在地毯、床单、被罩等处吸烟、饮食。如有需要，请致电客房服务，我们将为您提供相关服务。</ol>
            <ol>7.严禁噪音：为保证其他客人的休息，请您在酒店内部保持安静，避免大声喧哗、吵闹。</ol>
            <ol>8.访客管理：未经酒店允许，禁止在客房内留宿外来人员。如有访客，请在前台办理访客登记手续。</ol>
            <ol>9.餐饮服务：酒店提供早餐、午餐、晚餐等餐饮服务，具体用餐地点和时间请咨询酒店前台。</ol>
            <ol>10.结算方式：酒店支持现金、银行卡、微信、支付宝等多种结算方式。请您在退房时结清住宿费用。</ol>
          </el-collapse>
        </el-card>
      </el-col>
      <el-col :xs="24" :sm="24" :md="12" :lg="8">
        <el-card class="update-log">
          <div slot="header" class="clearfix">
            <span>微信号</span>
          </div>
          <div class="body">
            <img
            src="@/assets/images/img.png"
              alt="donate"
              width="100%"
            />
            <span style="display: inline-block; height: 30px; line-height: 30px"
              >你可以请关注微信获得福利</span
            >
          </div>
        </el-card>
      </el-col>
    </el-row>
  </div>
</template>

<script>
export default {
  name: "Index",
  data() {
    return {
      // 版本号
      version: "3.8.6"
    };
  },
  methods: {
    goTarget(href) {
      window.open(href, "_blank");
    }
  }
};
</script>

<style scoped lang="scss">
.home {
  blockquote {
    padding: 10px 20px;
    margin: 0 0 20px;
    font-size: 17.5px;
    border-left: 5px solid #eee;
  }
  hr {
    margin-top: 20px;
    margin-bottom: 20px;
    border: 0;
    border-top: 1px solid #eee;
  }
  .col-item {
    margin-bottom: 20px;
  }

  ul {
    padding: 0;
    margin: 0;
  }

  font-family: "open sans", "Helvetica Neue", Helvetica, Arial, sans-serif;
  font-size: 13px;
  color: #676a6c;
  overflow-x: hidden;

  ul {
    list-style-type: none;
  }

  h4 {
    margin-top: 0px;
  }

  h2 {
    margin-top: 10px;
    font-size: 26px;
    font-weight: 100;
  }

  p {
    margin-top: 10px;

    b {
      font-weight: 700;
    }
  }

  .update-log {
    ol {
      display: block;
      list-style-type: decimal;
      margin-block-start: 1em;
      margin-block-end: 1em;
      margin-inline-start: 0;
      margin-inline-end: 0;
      padding-inline-start: 40px;
    }
  }
}
</style>

