class Student{
        String name;
        
        Student(String name){
            this.name = name;
        }

        void eatFood(String foodName){
            orderFromRestaurant(foodName);
            eatFoodAtHome(foodName);
            finishEatingFood(foodName);
            
            
        }

        void orderFromRestaurant(String foodName){
            System.out.println("Order the food:" + foodName + " from P.F. Chang's");
        }

       private void eatFoodAtHome(String foodName){
            System.out.println("Eat:" + foodName + " from P.F. Chang's");   
        }

       private void finishEatingFood(String foodName){
            System.out.println("Put:" + foodName + " in dishwasher");
        }
        
    }
