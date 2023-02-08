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
              <ion-button size="large" @click="CallAPI" expand="block">Search</ion-button>
            </div>
          </ion-col>
        </ion-row>
      </ion-grid>
    </ion-content>
  </ion-page>
</template>

<script setup lang="ts">
import { IonPage, IonHeader, IonToolbar, IonTitle, IonContent } from '@ionic/vue';
import { search } from 'ionicons/icons';
import {CallAPI} from '../api/callApi';

</script>