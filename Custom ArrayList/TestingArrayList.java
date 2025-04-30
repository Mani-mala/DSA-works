public class TestingArrayList {
    public static void main(String[] args)
    {
        CustomArrayList<Integer> list=new CustomArrayList<>();
        list.add(20);
        list.add(10);
        list.add(60);
        list.add(40);
        list.add(80);

        list.printList();
        System.out.println("Arraylist size : "+list.size());
        System.out.println("Get method : "+list.get(2));
        list.set(2,100);
        System.out.println("Get method after setting diff value to that index : "+list.get(2));
        System.out.println("Remove method : "+list.remove(1));
        //list.clear();
        //System.out.println("Arraylist size after clear method : "+list.size());
        System.out.println("IsEmpty list : "+list.isEmpty());
        System.out.println("contains method : "+list.contains(40));
        System.out.println("find element index : "+list.indexOf(100));
    } 
}
