<template>
  <div>
    <div class="forget_view">
      <el-form :model="forgetForm" class="forget_box">
        <div class="forget_title">
          企业信用信息管理系统{{
            pageType == 1 ? '找回密码' : pageType == 2 ? '输入密保' : '重置密码'
          }}
        </div>
        <div class="tab_line">
          <div class="line"></div>
          <div class="num_line">
            <div
              class="line_number"
              :class="
                (pageType == 1 ? 'line_number1' : '',
                pageType > 1 ? 'line_number2' : '')
              "
            >
              <div class="number" v-if="pageType < 2">1</div>
              <el-icon v-else><Check /></el-icon>
            </div>
            <div
              class="line_number"
              :class="
                (pageType == 2 ? 'line_number1' : '',
                pageType > 2 ? 'line_number2' : '')
              "
            >
              <div class="number" v-if="pageType < 3">2</div>
              <el-icon v-else><Check /></el-icon>
            </div>
            <div
              class="line_number"
              :class="pageType == 3 ? 'line_number1' : ''"
            >
              <div class="number">3</div>
            </div>
          </div>
        </div>
      </el-form>
    </div>
  </div>
</template>
<script setup>
import { ref, getCurrentInstance, nextTick } from 'vue'
const context = getCurrentInstance()?.appContext.config.globalProperties
const pageType = ref(1)
const forgetForm = ref({})
const userForm = ref({})
//返回登录
const close = () => {
  context?.$router.push({
    path: '/login',
  })
}
</script>

<style lang="scss" scoped>
.forget_view {
  background-repeat: no-repeat;
  flex-direction: column;
  background-size: 100% 100% !important;
  background: url(http://localhost:8080/corporateCredit/file/7c2bc36cb7ee4a749f45e6e0e80c5b36.jpg);
  display: flex;
  min-height: 100vh;
  justify-content: center;
  align-items: center;
  position: relative;
  background-position: center center;
  // 表单盒子
  .forget_box {
    border-radius: 0px;
    padding: 20px 40px 20px 20px;
    box-shadow: 0px 36px 26px -30px #000;
    margin: 0 auto;
    background: rgba(255, 255, 255, 0.9);
    display: flex;
    width: 550px;
    justify-content: flex-start;
    flex-wrap: wrap;
    // 标题
    .forget_title {
      padding: 0 20px;
      margin: 0px 0 20px 20px;
      color: #fff;
      background: url(http://localhost:8080/corporateCredit/file/4729bc9349ea41d6ba3c6f701eafd07a.png)
        no-repeat left center / 100% 100%;
      font-weight: 500;
      width: 100%;
      font-size: 16px;
      line-height: 50px;
      text-align: center;
      height: 50px;
    }
    // tab
    // 盒子
    .tab_line {
      padding: 30px 0;
      flex-direction: column;
      display: flex;
      width: 100%;
      align-items: center;
      // 中间线
      .line {
        background: none;
        width: 80%;
        border-color: #999;
        border-width: 0 0 1px;
        border-style: dashed;
        height: 1px;
      }
      // item盒子
      .num_line {
        margin: -20px 0 0;
        display: flex;
        width: 80%;
        justify-content: space-between;
        align-items: center;
        height: 40px;
        // 默认样式
        .line_number {
          border: 4px solid #ddd;
          border-radius: 50%;
          color: #aaa;
          background: #fff;
          display: flex;
          width: 40px;
          font-size: 18px;
          justify-content: center;
          align-items: center;
          height: 40px;
        }
        // 选中样式
        .line_number1 {
          color: #f98429;
          font-size: 22px;
          border-color: #f98429;
        }
        // 完成样式
        .line_number2 {
          color: #339933;
          border-color: #339933;
        }
      }
    }
    // item
    .list_item {
      margin: 10px auto;
      display: flex;
      width: 100%;
      justify-content: flex-start;
      align-items: center;
      // label
      .item_label {
        background: none;
        display: block;
        width: 100px;
        font-size: 14px;
        line-height: 36px;
        box-sizing: border-box;
        text-align: right;
        height: 36px;
      }
      // 输入框
      :deep(.list_inp) {
        border-radius: 0px;
        padding: 0 10px;
        color: #666;
        background: none;
        width: calc(100% - 100px);
        border-color: #999;
        border-width: 0 0 1px;
        line-height: 36px;
        box-sizing: border-box;
        border-style: dashed;
        height: 36px;
        //去掉默认样式
        .el-input__wrapper {
          border: none;
          box-shadow: none;
          background: none;
          border-radius: 0;
          height: 100%;
          padding: 0;
        }
        .is-focus {
          box-shadow: none !important;
        }
      }
      //下拉框样式
      :deep(.list_sel) {
        border-radius: 0px;
        padding: 0 10px;
        color: #666;
        background: none;
        width: calc(100% - 100px);
        border-color: #999;
        border-width: 0 0 1px;
        line-height: 36px;
        box-sizing: border-box;
        border-style: dashed;
        //去掉默认样式
        .select-trigger {
          height: 100%;
          .el-input {
            height: 100%;
            .el-input__wrapper {
              border: none;
              box-shadow: none;
              background: none;
              border-radius: 0;
              height: 100%;
              padding: 0;
            }
            .is-focus {
              box-shadow: none !important;
            }
          }
        }
      }
    }
    // 按钮盒子
    .list_btn {
      margin: 20px auto 0;
      display: flex;
      width: 100%;
      justify-content: center;
      align-items: center;
      flex-wrap: wrap;
      // 获取密保
      :deep(.el-button--success) {
        border: 0;
        cursor: pointer;
        border-radius: 0px;
        padding: 0 0px;
        margin: 0 0 0 30px;
        color: #fff;
        background: linear-gradient(
          180deg,
          rgba(241, 202, 77, 1) 0%,
          rgba(245, 168, 59, 1) 49%,
          rgba(249, 131, 40, 1) 50%,
          rgba(251, 154, 38, 1) 100%
        );
        width: 150px;
        font-size: 14px;
        height: 36px;
      }
      // 获取密保悬浮
      :deep(.el-button--success:hover) {
      }
      // 确认密保
      :deep(.el-button--primary) {
        border: 0;
        cursor: pointer;
        border-radius: 0px;
        padding: 0 0px;
        margin: 0 0 0 30px;
        color: #fff;
        background: linear-gradient(
          180deg,
          rgba(241, 202, 77, 1) 0%,
          rgba(245, 168, 59, 1) 49%,
          rgba(249, 131, 40, 1) 50%,
          rgba(251, 154, 38, 1) 100%
        );
        width: 150px;
        font-size: 14px;
        height: 36px;
      }
      // 确认密保悬浮
      :deep(.el-button--primary:hover) {
      }
      // 重置密码
      :deep(.el-button--warning) {
        border: 0;
        cursor: pointer;
        border-radius: 0px;
        padding: 0 0px;
        margin: 0 0 0 30px;
        color: #fff;
        background: linear-gradient(
          180deg,
          rgba(241, 202, 77, 1) 0%,
          rgba(245, 168, 59, 1) 49%,
          rgba(249, 131, 40, 1) 50%,
          rgba(251, 154, 38, 1) 100%
        );
        width: 150px;
        font-size: 14px;
        height: 36px;
      }
      // 重置密码悬浮
      :deep(.el-button--warning:hover) {
      }
      .r-login {
        cursor: pointer;
        padding: 20px 0 0;
        color: #999;
        width: 100%;
        font-size: 14px;
        text-align: right;
      }
    }
  }
}
</style>
