<template>
  <div id="list">
    <div class="todo-list" v-for="(list, index) in $store.state.todoList" :key="index" @click="activeList(index)" :ref="'list-'+index" spellcheck="false">
      <input type="text" v-model="$store.state.todoList[index].content" @keydown.enter="updateTodo($event, list.id);" :ref="'input_'+index" />
      <button class="delete-btn">
        <i class="fas fa-trash-alt" @click.stop="deleteList(list.id)"></i>
      </button>
    </div>
  </div>
</template>

<script>
export default {
  created() {
    this.addOriginList()
  },
  methods: {
    addOriginList: function () {
      this.$store.dispatch("requestCurrentTodoList");
    },
    removeActive: function () {
      for (let i = 0; i < this.$store.state.todoList.length; i++) {
        this.$refs[`list-${i}`][0].classList.remove("active");
      }
    },
    activeList: function (index) {
      this.removeActive();
      this.$refs[`list-${index}`][0].classList.add("active");
    },
    updateTodo: function(event, id) {
      this.$store.dispatch("requestUpdateTodo", id)
      this.removeActive();
      event.target.blur();
    },
    deleteList: function (id) {
      this.$store.dispatch("requestDeleteTodo", id)
      this.removeActive();
    }
  }
};
</script>

<style>
#list {
  height: 33vh;
  overflow-y: scroll;
}

#list::-webkit-scrollbar {
  display: none;
}

.todo-list {
  display: flex;
  margin: 10px 0;
}

.todo-list input {
  width: 545px;
  height: 50px;
  border: none;
  padding: 10px;
  font-size: 20px;
  background-color: rgba(0, 0, 0, 0.1);
  border-radius: 5px;
}

.todo-list.active input {
  width: 495px;
  height: 50px;
  border: none;
  padding: 10px;
  font-size: 20px;
  background-color: rgba(0, 0, 0, 0.1);
  border-top-right-radius: 0;
  border-top-left-radius: 5px;
  border-bottom-right-radius: 0;
  border-bottom-left-radius: 5px;
}


.todo-list input:focus {
  outline: none;
}

.todo-list .delete-btn {
  display: none;
}

.todo-list.active .delete-btn {
  width: 50px;
  height: 50px;
  cursor: pointer;
  display: block;
  background: #d43434;
  border: none;
  border-top-right-radius: 5px;
  border-bottom-right-radius: 5px;
}


.todo-list.active .delete-btn i {
  color: white;
  font-size: 25px;
}
</style>