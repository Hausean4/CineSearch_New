<template>
  <ion-page>
    <ion-header>
      <ion-toolbar>
        <ion-title>MovieSearch</ion-title>
      </ion-toolbar>
    </ion-header>
    <ion-content :fullscreen="true" padding>
      <ion-grid>
        <ion-row justify-content-center>
          <ion-col align-self-center size-md="6" size-lg="5" size-xs="12">
            <div padding>
              <ion-item>
                <ion-input type="text" placeholder="Movie Name" v-model="search"></ion-input>
              </ion-item>
            </div>
            <div padding>
              <ion-button size="large" @click="getData" expand="block">Search</ion-button>
            </div>
          </ion-col>
        </ion-row>
      </ion-grid>
      <div v-for="item in listItems" :key="item.name">
        {{item.name}}
      </div>
    </ion-content>
  </ion-page>
</template>

<script setup lang ="ts">
import { IonPage, IonHeader, IonToolbar, IonTitle, IonContent } from '@ionic/vue';
import { search } from 'ionicons/icons';
import axios from 'axios'
import { ref } from 'vue';

  const listItems = ref([]);

  async function getData() {
    const res = await fetch("localhost:8080/api/movies/");
    const finalRes = await res.json();
    listItems.value = finalRes;
  }
</script>
