<template>
  <router-view />
</template>
<script>
const debounce = (fn, delay) => {
  let timer = null
  return function () {
    let context = this
    let args = arguments
    clearTimeout(timer)
    timer = setTimeout(function () {
      fn.apply(context, args)
    }, delay)
  }
}

const _ResizeObserver = window.ResizeObserver
window.ResizeObserver = class ResizeObserver extends _ResizeObserver {
  constructor(callback) {
    callback = debounce(callback, 16)
    super(callback)
  }
}
</script>
<style lang="scss">
body {
  margin: 0;
}
* {
  box-sizing: border-box;
}
.app-contain {
  width: 100%;
  // padding: 0 8%;
  // box-sizing: border-box;
}
.section_title {
  padding: 0 0 0 16px;
  margin: 20px auto;
  color: #333;
  font-weight: 600;
  letter-spacing: 0px;
  font-size: 20px;
  border-color: #66666650;
  line-height: 58px;
  border-radius: 0;
  background: url(http://localhost:8080/corporateCredit/file/4a00db5052144a458000239dd37beb14.png)
    repeat-x center bottom;
  width: 100%;
  border-width: 0 0 0px;
  border-style: solid;
  text-align: left;
}

#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  // text-align: center;
  color: #2c3e50;
}

nav {
  padding: 30px;

  a {
    font-weight: bold;
    color: #2c3e50;

    &.router-link-exact-active {
      color: #42b983;
    }
  }
}
</style>
