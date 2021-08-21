<template>
  <div id="footer">
    <span>You have pending {{ currentCount }} tasks</span>
    <button @click="clearAll()">Clear All</button>
  </div>
</template>

<script>
export default {
  computed: {
    currentCount: function () {
      return this.$store.state.todoList.length;
    }
  },
  methods: {
    clearAll: function () {
      this.$store.state.todoList = [];
    }
  }
};
</script>

<style>
#footer {
  width: 550px;
  height: 100px;
  position: absolute;
  bottom: 50px;
  display: flex;
  align-items: center;
  justify-content: space-between;
}

#footer span {
  font-size: 1.5em;
}

#footer button {
  height: 40px;
  cursor: pointer;
  background: #d626e6;
  border: none;
  padding: 0 20px;
  color: white;
  font-size: 20px;
}
</style>