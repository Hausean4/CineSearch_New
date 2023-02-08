import { getToken } from '@/api/auth';
import { ref } from 'vue';
import { useRouter } from 'vue-router';

export function Signup() {

    const mail = ref("");
    const password = ref("");
    const router = useRouter();

    const signup = async () => {
        try {
            const token = await getToken(mail.value, password.value);
        } catch (error) {
            console.log(error)
        }
    }

    return {
        mail,
        password,
        signup
    }
}