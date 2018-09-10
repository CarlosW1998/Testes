package Apagando_e_Ganahando_653;

public class BestNumber {
    char[] number, updatedNumber;
    int size;

    public BestNumber(char[] a){
        this.number = a;
        this.size = a.length;
    }
    public boolean numberToErease(int i){
        return  (i > 0);
    }
    public void printUpdateNumber(){
        for(char c: this.updatedNumber){
            if(c == '\0'){return;}
            System.out.print(c);
        }
    }
    public void erase(int i){
        int maxLen = this.size-i, head = 0;
        char[] newNumber = new char[maxLen+1];
        for(int a = 0; a< size; a++){
            while(head >= 1 && numberToErease(i) && newNumber[head-1] < this.number[a]){
                head--;
                i--;
            }
            if(head < maxLen){
                newNumber[head] = this.number[a];
                head++;
            }
        }
        newNumber[head] = '\0';
        this.updatedNumber = newNumber;
    }
}
