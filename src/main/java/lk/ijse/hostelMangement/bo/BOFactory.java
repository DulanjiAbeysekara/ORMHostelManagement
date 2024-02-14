package lk.ijse.hostelMangement.bo;

import lk.ijse.hostelMangement.bo.custom.impl.RoomBOImpl;
import lk.ijse.hostelMangement.bo.custom.impl.RservationBOImpl;
import lk.ijse.hostelMangement.bo.custom.impl.StudentBOImpl;
import lk.ijse.hostelMangement.bo.custom.impl.UserBOImpl;

public class BOFactory {

    public static BOFactory boFactory;

    public BOFactory() {
    }


    public BOFactory getBoFactory(){
         if (boFactory==null){
            boFactory=new BOFactory();
         }
         return boFactory;
    }


    public enum BOTypes{
        STUDENT,ROOM,RESERVATION,USER
    }

    public static SuperBO getBO(BOTypes boTypes){
        switch (boTypes){

//            case STUDENT:
//                return new StudentBOImpl();
//
//            case ROOM:
//                return  new RoomBOImpl();
//
//            case RESERVATION:
//                return new RservationBOImpl();

            case USER:
                return  new UserBOImpl();

            default:
                return null;
        }
    }
}
