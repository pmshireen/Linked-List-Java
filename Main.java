package DataStructures;

public class Main {
   public static void main(String[] args) {

        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertFirst(25);
        list.insertFirst(90);

        list.display();

//         list.insertLast(99);
//
//         list.insert(100,3);
//         list.display();
//         System.out.println(list.deleteFirst());
//         list.display();
//         System.out.println(list.deleteLast());
//         list.display();
//         System.out.println(list.delete(2));
//         list.display();

         list.insertRec(88,2);
         list.display();





//          DLL list = new DLL();
//
//          list.insertFirst(3);
//          list.insertFirst(5);
//          list.insertFirst(8);
//          list.insertFirst(17);
//          list.insertLast(101);
//
//          list.display();
//          list.insert(101,67);
//          list.display();

//          CLL list = new CLL();
//          list.insert(77);
//          list.insert(78);
//          list.insert(79);
//          list.insert(80);
//
//          list.display();
//
//          list.delete(79);
//          list.display();





   }
}
