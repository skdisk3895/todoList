<template>
  <div class="box">
    <h1 class="title">Todo App</h1>
    <Add />
    <TodoList />
    <Footer />
  </div>
</template>

<script>
import Add from "@/components/Add.vue";
import TodoList from "@/components/TodoList.vue";
import Footer from "@/components/Footer.vue";

export default {
  components: {
    Add,
    TodoList,
    Footer,
  },
};
</script>

<style>
.box {
  position: absolute;
  left: 50%;
  top: 50%;
  transform: translate(-50%, -50%);
  width: 650px;
  height: 80vh;
  background: white;
  padding: 20px 50px;
  border-radius: 10px;
  box-shadow: 5px 5px 5px 1px rgba(0, 0, 0, 0.1);
  overflow: hidden;
}

.box .title {
  font-size: 2.5em;
}
</style>
