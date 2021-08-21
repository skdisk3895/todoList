<template>
  <div id="app">
    <Box />
  </div>
</template>

<script>
import Box from "@/components/Box.vue";

export default {
  components: {
    Box,
  },
};
</script>

<style>
* {
  box-sizing: border-box;
}

body {
  height: 100%;
  background: #7f7fd5; /* fallback for old browsers */
  background: -webkit-linear-gradient(
    to right,
    #91eae4,
    #86a8e7,
    #7f7fd5
  ); /* Chrome 10-25, Safari 5.1-6 */
  background: linear-gradient(
    to right,
    #91eae4,
    #86a8e7,
    #7f7fd5
  ); /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
}
</style>
