
//my solution
public class mainlab2 {

    public static Stack getReverseStack(Stack mahsanit){
        Stack tempstack=new Stack();
        while (!mahsanit.isempty()){
            tempstack.push(mahsanit.pop());
        }
        return tempstack;
    }

    public static Stack getMacStack(Stack s){
        Stack temp=new Stack();
        int max=s.pop();
        while (!s.isempty()){
            int head=s.pop();
            if(head>max){
                max=head;
            }
            temp.push(head);
        }
        while (!temp.isempty()){
            int copy=temp.pop();
            if(copy!=max)
                s.push(copy);
        }

        s.push(max);
        return s;
    }

    public static Stack getEvenStack(Stack m){
        Stack tempeven=new Stack();
        while (!m.isempty()){
            int num=m.pop();
            if(num%2==0)
                tempeven.push(num);
        }
        tempeven=getReverseStack(tempeven);
        return tempeven;
    }


    public static void main(String[] args){
        Stack Stackone1=new Stack();
        for (int i=0;i<13;i++){
            Stackone1.push(i);
        }
        for (int j=0;j<6;j++){
            Stackone1.push(100-j);
        }
//        for (int i=0;!Stackone1.isempty();i++){
//            System.out.print(Stackone1.pop()+" ");
//        }
        Stack stackone= getEvenStack(Stackone1);
        for (int i=0;!stackone.isempty();i++){
            System.out.print(stackone.pop()+"\n");
        }
    }
}
