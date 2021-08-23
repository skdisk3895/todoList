import Vue from "vue";
import Vuex from "vuex";
import axios from "axios";

Vue.use(Vuex);

export default new Vuex.Store({
  state: {
    todoList: [],
  },
  getters: {},
  mutations: {
    getTodoData(state, todoData) {
      todoData.forEach((data) => state.todoList.push(data));
    },
    addTodo(state, todoData) {
      state.todoList.unshift(todoData);
    },
    deleteTodo(state, id) {
      const idx = state.todoList.findIndex((todo) => todo.id === id);
      state.todoList.splice(idx, 1);
    },
    deleteAllTodo(state) {
      state.todoList = [];
    },
  },
  actions: {
    requestCurrentTodoList({ commit }) {
      axios
        .get("http://localhost:8080/todo/findall")
        .then((res) => {
          commit("getTodoData", res.data);
        })
        .catch((err) => console.error(err));
    },
    requestRegisterTodo({ commit }, content) {
      axios
        .post("http://localhost:8080/todo/create", {
          content: content,
        })
        .then((res) => {
          commit("addTodo", res.data);
        })
        .catch((err) => console.error(err));
    },
    requestUpdateTodo({ state }, id) {
      const todo = state.todoList.find((todo) => todo.id === id);
      axios
        .put(`http://localhost:8080/todo/update/${id}`, {
          content: todo.content,
        })
        .then(() => {})
        .catch((err) => console.error(err));
    },
    requestDeleteTodo({ commit }, id) {
      axios
        .delete(`http://localhost:8080/todo/delete/${id}`)
        .then(() => {
          commit("deleteTodo", id);
        })
        .catch();
    },
    requestDeleteAll({ commit }) {
      axios
        .delete("http://localhost:8080/todo/deleteall")
        .then(() => commit("deleteAllTodo"))
        .catch((err) => console.error(err));
    },
  },
  modules: {},
});
