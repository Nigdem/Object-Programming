
package linkedlisttest;

public class List {
    Node head;
    
    List(){
        head=null;
        
    }
    List(int n,String a,String s)
    {
        head=new Node(n,a,s);
    }
    
    void basaEkle(int n,String a,String s){
        Node yeni=new Node(n,a,s);
        yeni.next=head;
        head=yeni;
        
    }
    
    
    void sonaEkle(int n,String a,String s){
        Node yeni= new Node(n,a,s);
        yeni.next = null;
        Node etkin=head;
        while(etkin.next!=null)
            etkin=etkin.next;
        etkin.next=yeni;
        
    }
    void silHead(){
        head=head.next;
        
    }
    void sil(int n,String a,String s){
        Node pre=head;
        Node etkin=head.next;
        while(etkin.next!=null)
        {
            if(etkin.no==n && etkin.ad==a && etkin.soyad==s)
            {
             etkin=etkin.next;
             pre.next=etkin;
            }
            else{
                pre=pre.next;
                etkin=etkin.next;
            }
        }
    }
    void ekle(int yer, int n,String a,String s){
        int c=2;
        Node yeni=new Node(12345,"Ahmet","Yıldız");
        Node etkin=head;
        
        while(c!=yer)
        {
            etkin=etkin.next;
            c++;
        }
        
        yeni.next=etkin.next;
        etkin.next=yeni;
    }
    
    void yazdir(){
        Node etkin=head;
         System.out.println("Öğrenci Listesi:");
        while(etkin!=null){
             
            System.out.print(etkin.no+" "+etkin.ad+" "+etkin.soyad+" "+"\n");
            etkin=etkin.next;
        }
        System.out.println("");
    }
}
