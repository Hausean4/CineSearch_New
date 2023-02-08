import axios from 'axios';
export function CallAPI(){
axios.get('https://api.watchmode.com/v1/regions/?apiKey=Pk7C1kFkzrMfvKKTQCqml1q3izZnKelxCReMj5Tc')
  .then((response) => {
   return response.data;
  })

}



