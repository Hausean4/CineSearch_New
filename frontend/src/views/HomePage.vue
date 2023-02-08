<template>
  <ion-page>
    <ion-header>
      <ion-toolbar>
        <ion-title>Homepage</ion-title>
      </ion-toolbar>
    </ion-header>
    <ion-content :fullscreen="true" padding>
      <ion-grid>
        <ion-row justify-content-center>
          <ion-col align-self-center size-md="6" size-lg="5" size-xs="12">
            <div>
              <h3><b>Herzlich Willkommen bei CineSearch</b></h3>
              <p>Vielen Dank dass du die App CineSearch nutzt. Du kannst direkt nach einem Film suchen oder dich vorab registrieren/anmelden. 
              Durch die Registrierung erhältst du die Möglichkeit, Informationen zu Neuerscheinungen direkt per E-Mail zu erhalten, siehst eine Übersicht über deine letzten Suchanfragen und deine gesehenen Filme. Ebenfalls kannst du die Filme in der App bewerten und so deine Meinung mit unserer Community teilen. 
              Falls du Fragen hast, wende dich bitte über den Button oben rechts an unseren Support. 
              Nun wünschen wir Dir viel Spass beim Stöbern und gute Unterhaltung bei deinem nächsten Kinobesuch!
              <br> <br> Liebe Grüsse<br>
              Dein CineSearch Team
              </p> 
            </div>
          </ion-col>
        </ion-row>
      </ion-grid>
    </ion-content>
  </ion-page>
</template>

<script setup lang="ts">
import { IonPage, IonHeader, IonToolbar, IonTitle, IonContent } from '@ionic/vue';

</script>
