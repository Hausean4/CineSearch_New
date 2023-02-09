<template>
  <ion-page>
    <ion-header>
      <ion-toolbar>
        <ion-title>Support</ion-title>
      </ion-toolbar>
    </ion-header>
    <ion-content :fullscreen="true" padding>
      <ion-grid>
        <ion-row justify-content-center>
          <ion-col align-self-center size-md="6" size-lg="5" size-xs="12">
            <div text-center>
              <h3>CineSearch Support</h3>
            </div>
            <div style="text-align: center;">
              <form ref="form" @submit="sendEmail">
                <label><p>Name</p></label>
                <input type="text" name="user_name" /> <br>
                <label><p>Email</p></label>
                <input type="email" name="user_email" /> <br>
                <label><p>Message</p></label>
                <textarea name="message"></textarea> <br>
                <ion-button class="sendButton" size="medium" @click="send" expand="block">Send</ion-button>
              </form>
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
  IonHeader,
  IonToolbar,
  IonTitle,
  IonContent,
} from "@ionic/vue";
import {ref, onMounted } from 'vue'
import emailjs from "@emailjs/browser";
import { send } from "ionicons/icons";

const form = ref<any>(null);

function sendEmail() {
  emailjs.sendForm(
      "service_ex27v2q",
      "template_m8q2lkn",
      form.value,
      "VuXWmKaBh2Ejav599"
    )
    .then(
      (result) => {
        console.log("SUCCESS!", result.text);
      },
      (error) => {
        console.log("FAILED...", error.text);
      }
    );
}
</script>
