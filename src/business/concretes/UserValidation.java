package business.concretes;

import Utils.Utility;
import entities.concretes.User;

public class UserValidation {

    public boolean isValidUserRegister(User user){

        if(!user.getEmail().isEmpty() ||
                !user.getName().isEmpty() ||
                !user.getSurname().isEmpty() ||
                !user.getPassword().isEmpty()){
            System.out.println("ad,soyad,eposta ve parola bilgileri bos gecilemez!!!");
            return false;
        }

        if(user.getName().length()<2 || user.getSurname().length()<2){
            System.out.println("Ad ve soyad bilgileri en az iki karakter olmalidir!!!");
            return false;
        }

        if(user.getPassword().length()<6){
            System.out.println("Parolaniz en az alti karakter olmalidir!!!");
            return false;
        }

        if(!Utility.isValidEmail(user.getEmail())){
            System.out.println("Girmis oldugunuz e-posta formati yanlisdir!!!");
            return false;
        }

        return true;
    }


}
