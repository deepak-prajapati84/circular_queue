public class circular
{
    static class cQA{
        int front =-1;
        int rell=-1;
        int size=0;
        int arr[]=new int[10];

        public void add(int val) throws Exception {
            if(size==arr.length){
                throw new Exception("Queue is full");
            }

            else if(size==0){
                front=rell=0;
                arr[0]=val;
            }
            else if(rell<arr.length-1){
                arr[++rell]=val;
            }
            else if(rell==arr.length-1){
                rell=0;
                arr[0]=val;
            }
            size++;
        }

        public int remove() throws Exception{
            if(size==0){
                throw new Exception("Queue is empty");
            }else{
                int val=arr[front];

                if(front==arr.length-1) front=0;
                else front++;
                size--;
                return val;
            }
        }

        public int peek() throws Exception{
            if(size==0){
                throw new Exception("Queue is empty");
            }
            return arr[front];
        }

        public void display(){
            if(size==0){
                System.out.println("Queue is empty");
                return;
            }

            else if(front<=rell){
                for(int i=front;i<=rell;i++){
                    System.out.println(arr[i]+" ");
                }
            }

            else{
                for(int i=front;i<arr.length;i++){
                    System.out.println(arr[i]+" ");
                }

                for(int i=0;i<=rell;i++){
                    System.out.println(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception
    {
        cQA q=new cQA();
        q.display();
        q.add(2);
        q.add(28);
        q.add(25);
        q.remove();
        q.display();
        q.add(20);
        q.add(23);
        q.display();
    }
}