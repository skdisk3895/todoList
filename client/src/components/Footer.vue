<template>
  <div id="footer">
    <span>You have pending {{ currentCount }} tasks</span>
    <button @click="deleteAll()">Clear All</button>
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
    deleteAll: function () {
      this.$store.dispatch("requestDeleteAll")
    }
  }
};
</script>

<style>
#footer {
  width: 550px;
  height: 5vh;
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

@media screen and (max-height: 650px){
  #footer {
    display: none;
  }
}
</style>