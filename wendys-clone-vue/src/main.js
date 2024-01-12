import router from './router';
import { createApp } from 'vue';
import App from './App.vue';


const app = createApp(App);

// Use the router instance
app.use(router);

// Mount the app to the element with id 'app'
app.mount('#app');
