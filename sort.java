class sort {
    
    public static void main(String[] args) {
        //Create Array for integers
        int[] order = new int[args.length];

        for(int i = 0 ; i < order.length ; i++){
            //initiliazed to 0 
            order[i] = 0;
        }
        //Set thisOrder to 1
        int thisOrder = 1;
        int newIN = 0;


        //if the order is 0
        for(int i = 0 ; i < order.length ; i++){
            //first value equal to max
            int max = Integer.MAX_VALUE;
                //for loop for which number is lower.
            for(int x = 0 ; x < args.length ; x++){
                if(order[x]==0){
                    
                    //if my number is lower than the max number.
                    if(Integer.parseInt(args[x]) < max){
                        //change max to find min.
                        max = Integer.parseInt(args[x]);
                        newIN = x;
                    }
                } 
               
            }
            order[newIN] = thisOrder;
            //increase order.
            thisOrder++;       
        
        }
       
       //For i: 1 to size of the given sequence.
        for(int i = 1 ; i <= order.length  ; i++){
            //check numbers between args[] and order[]
            for(int j = 0 ; j < args.length ; j++){
                if(order[j]==i){
                    System.out.print(args[j] + " ");
                }

            }

        } 
    }




}
