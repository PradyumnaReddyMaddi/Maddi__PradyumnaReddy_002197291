/*
 * 
o change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Management;

import java.util.ArrayList;
import java.util.List;
;
 /*
 * @author pradyumnareddy
 */
public class UberCarInfo {
    
    private ArrayList<UberCar> carList;
    private ArrayList<UberCar> mfgList;

    public ArrayList<UberCar> getMfgList() {
        return mfgList;
    }

    public void setMfgList(ArrayList<UberCar> mfgList) {
        this.mfgList = mfgList;
    }
    public UberCarInfo(){
        this.carList = new ArrayList<>();
         
    }
    
    public ArrayList<UberCar> getCarList() {
        return carList;
    }

    
    public void setCarList(ArrayList<UberCar> carList) {
        this.carList = carList;
    }
    


 public UberCar addCar(){
     UberCar car = new UberCar();
     carList.add(car);
     return car;
 }
  
 
 public void deleteCar(UberCar car){
     carList.remove(car);
 }
 
 public ArrayList<UberCar> getMfgList(int manufactured_year){
      ArrayList<UberCar> mfglist = new ArrayList<>();
     for(UberCar car : carList){
            if(car.getManufactured_year()== manufactured_year){
                mfglist.add(car);
 }
     }return mfglist;
 }

  public ArrayList<UberCar> getSerialList(int serial_num){
      ArrayList<UberCar> mfglist = new ArrayList<>();
     for(UberCar car : carList){
            if(car.getSerial_num()== serial_num){
                mfglist.add(car);
 }
     }return mfglist;
 }
 
     public ArrayList<UberCar> getBrandList(String brand){
      ArrayList<UberCar> brandlist = new ArrayList<>();
     for(UberCar car : carList){
            if(car.getBrand().equals(brand)){
                brandlist.add(car);
 }
     }return brandlist;
 }

     
     public ArrayList<UberCar> getModelList(String model_number){
      ArrayList<UberCar> modellist = new ArrayList<>();
     for(UberCar car : carList){
            if(car.getModel_num().equals(model_number)){
                modellist.add(car);
 }
     }return modellist;
 }
     
     public ArrayList<UberCar> getMaintainanceCertificate(){
         
         ArrayList<UberCar> maintainanceList = new ArrayList<>();
         for(UberCar car: carList){
             if(car.isMaintenance_certificate() == false)
                 maintainanceList.add(car);
         }return maintainanceList;
     }
     
    
    
   public ArrayList<UberCar> getAvailableCarsbyCity(String availble_city){
       ArrayList<UberCar> availablecity = new ArrayList<>();
       for(UberCar car: carList){
           if(car.getAvailble_city().equals(availble_city) && car.isAvailable()==true)
               availablecity.add(car);
           
       }return availablecity;
   }
    
       public ArrayList<UberCar> getTotalAvailable(){
               ArrayList<UberCar> totalavailable = new ArrayList<>();
              
               for(UberCar car: carList){
                   if(car.isAvailable()==true)
                       totalavailable.add(car);
                   }return totalavailable;
              
       
}
       public ArrayList<UberCar> getTotalUnAvailable(){
               ArrayList<UberCar> totalUnavailable = new ArrayList<>();
              
               for(UberCar car: carList){
                   if(car.isAvailable()==false)
                       totalUnavailable.add(car);
                   
                    }return totalUnavailable;
    
        }
        public ArrayList<UberCar> getFirstAvailable(){
        ArrayList<UberCar> fisrtAvailable=new ArrayList<>();
        
        for(UberCar car: carList){
            if(car.isAvailable()==true)
                fisrtAvailable.add(car);
                break;
        }return fisrtAvailable;
        }
        
            public ArrayList<UberCar> getMaxMinList(int max_seats, int min_seats){
            ArrayList<UberCar> maxminList = new ArrayList<>();
            for(UberCar car : carList){
                if(car.getMax_seats()<=max_seats && car.getMin_seats()>=min_seats){
                maxminList.add(car);
            }
            }  return maxminList;
        }

       
       public ArrayList<String> getAllBrands(){
           ArrayList<String> allbrands = new ArrayList<>();
           carList.stream().filter(car -> (!"".equals(car.getBrand()))).forEachOrdered(car -> {
               allbrands.add(car.getBrand());
        });
           return allbrands;
       }
       


}