<template>
  <div id="add">
    <input type="text" class="add-input" placeholder="Add your new todo" @keydown.enter="addList()" ref="todo" />
    <button class="add-btn" @click="addList()">
      <i class="fas fa-plus"></i>
    </button>
  </div>
</template>

<script>
export default {
  methods: {
    addList: function() {
      if (this.$refs["todo"].value === "") return;
      this.$store.dispatch("requestRegisterTodo", this.$refs["todo"].value);
      this.$refs["todo"].value = "";
    }
  }
};
</script>

<style>
#add {
  display: flex;
  align-items: center;
  margin-bottom: 20px;
  height: 10vh;
}

.add-input {
  width: 495px;
  height: 50px;
  border: 1px solid rgba(0, 0, 0, 0.5);
  margin-right: 5px;
  padding: 10px;
  font-size: 20px;
}

.add-btn {
  width: 50px;
  height: 50px;
  cursor: pointer;
  background: #d626e6;
  border: none;
}

.add-btn i {
  color: white;
  font-size: 25px;
}
</style>