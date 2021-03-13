import java.security.PublicKey;
//my solution

public class Stack {

    private int [] data;
    private int top;

    public Stack(){
        data=new int[10];
        top=-1;
    }
    public void push(int value) {
        if (top < this.data.length-1) {
            top++;
            data[top] = value;
        }
        else {
            int[] tempdata = new int[data.length + 5];
            for (int i=0;i<data.length;i++) {
                tempdata[i] = this.data[i];
            }
            this.data = tempdata;
            this.data[++top]=value;
        }
    }
    public int pop(){
        if(top>=0) {
            int head_value = data[top];
            top--;
            return head_value;
        }
        else{
            System.out.print("end of stack");
            return -1;
        }
    }
    public int showhead(){
        if(top>=0)
            return data[top];
        else{
            System.out.print("end of stack");
            return -2;
        }
    }
    public boolean isempty(){
        if (top==-1)
            return true;
        else
            return false;
    }


}
