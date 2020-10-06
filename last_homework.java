import java.util.Random;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java. util. Collection;
import java.util.stream.Collectors;

import jdk.nashorn.internal.ir.CallNode.EvalArgs;

import java.util.List;
import java.util.ArrayList;
 class last_homework {

     public static void main(String[] args) {
        int max = 56; 
        int min = 1; 
        int range = max - min + 1; 
        List<Integer> num=new ArrayList<>();
        int rand; 
        
        for (int i = 0; i < max; i++) { 
            rand = (int)(Math.random() * range) + min; 
            num.add(rand);
            
        } 
        int even=0;
        int odd=0;
        List<Integer> even_list=new ArrayList<>();
        List<Integer> odd_list=new ArrayList<>();
        System.out.println(num);
        for (int i=0; i<num.size(); i++){
            
            if (num.get(i)%2==0){
                even+=1;
                even_list.add(num.get(i));
            }
            else{
                odd+=1;
                odd_list.add(num.get(i));
            }
        }
        System.out.println("ლუწი: " +even +"კენტი: "+odd);
        
        int even_sum=0;
        for  (int i=0; i < even_list.size(); i++){
            even_sum+=even_list.get(i);
        }
        System.out.println(even_sum);

        int odd_sum=0;
        for  (int i=0; i < odd_list.size(); i++){
            odd_sum+=odd_list.get(i);
        }
        System.out.println(odd_sum);
    }
}
