public class Freshed {
    public static void main(String[] args) {
    Mass mass = new Mass(10);
    mass.ice(1);
        mass.ice(4);
        mass.ice(5);
        mass.ice(16);
        mass.ice(13);
        mass.ice(8);
        mass.ice(7);
        mass.ice(2);
        mass.ice(3);
        mass.ice(9);
mass.play();
mass.destroid(7);
mass.play();
int search =8;
if( mass.find(search)){
    mass.destroid(search);
    System.err.println(search + "удалён ");
} else {
    System.out.println("Элемент не найден "+ search);
}
mass.play();
        }

    }
class Mass {
    private int[] mass;
    private int size;

    public Mass(int size) {
        this.size = 0;
        this.mass = new int[size];

    }

    public void play() {
        for (int i = 0; i <this.size; i++) {
            System.out.println(this.mass[i]);
        }
    }
        public void destroid(int v){
        int i;
            for ( i = 0; i <this.size ; i++) {
                if(this.mass[i]==v) break;

            }
            for (int j = i; j <this.size -1 ; j++) {
                this.mass[j]= this.mass[j+1];
            }
            this.size--;

        }
        public void ice(int v ){
        mass[this.size] =v;
        this.size++;

        }
        public boolean find(int v){
        int i;
            for (i = 0; i <this.size  ; i++) {
                if (this.mass[i] == v) break;
            }
            if (i ==this.size)
                return false;
            else{
                return true;
            }

        }
    public void sortBubble(){
        int out, in;
        for (out = this.size-1;out>1;out--){
            for(in=0;in<out;in++){
                if (this.mass[in]>this.mass[in+1]){
                    change(in, in+1);
                }
            }
        }
    }

    private void change(int a, int b){
        int tmp = this.mass[a];
        this.mass[a] = this.mass[b];
        this.mass[b] = tmp;
    }

    public void sortSelect(){
        int out, in, mark;
        for(out=0;out<this.size;out++){
            mark = out;
            for(in = out+1;in<this.size;in++){
                if (this.mass[in]< this.mass[mark]){
                    mark = in;
                }
            }
            change(out, mark);
        }
    }
    public void sortInsert(){
        int in, out;
        for(out = 1;out < this.size; out++){
            int temp = this.mass[out];
            in = out;
            while(in > 0 && this.mass[in-1] >=temp){
                this.mass[in] = this.mass[in-1];
                --in;
            }

            this.mass[in] = temp;
        }
    }

}
