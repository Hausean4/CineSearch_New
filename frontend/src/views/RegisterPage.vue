<template>
    <ion-page>
      <ion-header>
        <ion-toolbar>
          <ion-title>Registrierung</ion-title>
        </ion-toolbar>
      </ion-header>
      <ion-content :fullscreen="true" padding>
        <ion-grid>
          <ion-row justify-content-center>
            <ion-col align-self-center size-md="6" size-lg="5" size-xs="12">
              <div text-center>
                <h3>CineSearch Registration</h3>
              </div>
              <div>
                <ion-item>
                  <ion-input type="email" placeholder="E-Mail Adresse" v-model="mail"></ion-input>
                </ion-item>
                <ion-item>
                  <ion-input type="password" placeholder="Password" v-model="password"></ion-input>
                </ion-item>
              </div>
              <div>
                <ion-button size="large" @click="signup" expand="block">Registrieren</ion-button>
              </div>
            </ion-col>
          </ion-row>
        </ion-grid>
      </ion-content>
    </ion-page>
  </template>
  
  <script setup lang="ts">
  import {
    IonPage,
    IonContent,
    IonInput,
    IonRow,
    IonCol,
    IonGrid,
    IonButton,
    IonItem,
  } from "@ionic/vue";
  import { Signup } from "../composables/signup";
  
  const { mail, password, signup } = Signup();
  
  </script>