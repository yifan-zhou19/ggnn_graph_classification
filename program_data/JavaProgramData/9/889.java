//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

 public class pat
 {
  public String id = new String(new char[10]);
  public int age;
  public pat next;
 }

package <missing>;

public class GlobalMembers
{
	 public static void Main()
	 {
		 pat head;
		 pat p;
		 int i;
		 int n;
		 void search(struct pat * head,int n);
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 head = new pat();
		 p = head;
		 p.next = null;
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 p.id = tempVar2.charAt(0);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 p.age = Integer.parseInt(tempVar3);
		 }
		 for (i = 1;i < n;i++)
		 {
			 p.next = new pat();
			 p = p.next;
			 String tempVar4 = ConsoleInput.scanfRead();
			 if (tempVar4 != null)
			 {
				 p.id = tempVar4.charAt(0);
			 }
			 String tempVar5 = ConsoleInput.scanfRead(" ");
			 if (tempVar5 != null)
			 {
				 p.age = Integer.parseInt(tempVar5);
			 }
			 p.next = null;
		 }
		 search(head, n);
	 }
	  public static void search(pat head, int n)
	  {
		 int i;
		 int j = 0;
		 int k = 0;
		 pat t;
		 pat m;
		 pat p;
		 pat head1;
		 pat head2;
		 pat sort = new pat(struct pat * head1,int j);
		 void print(struct pat * head1,struct pat * head2,int j,int k);
		 p = head;
		 t = new pat();
		 m = new pat();
		 for (i = 0;i < n;i++)
		 {
			 if (p.age >= 60)
			 {
				 j++;
				 if (j == 1)
				 {
					 head1 = t;
				 }
				 t.id = p.id;
				 t.age = p.age;
				 t.next = new pat();
				 t = t.next;
				 t.next = null;
			 }
			 else
			 {
				 k++;
				 if (k == 1)
				 {
					 head2 = m;
				 }
				 m.id = p.id;
				 m.age = p.age;
				 m.next = new pat();
				 m = m.next;
				 m.next = null;
			 }
			 p = p.next;
		 }
		 sort(head1, j);
		 print(head1, head2, j, k);
	  }
	  public static pat sort(pat head1, int j)
	  {
		 int i;
		 int l;
		 int t;
		 String a = new String(new char[10]);
		 pat p1;
		 pat p2;
		 for (i = 0;i < j - 1;i++)
		 {
			 p1 = head1;
			 for (l = 0;l < j - i - 1;l++)
			 {
				p2 = p1;
				p1 = p1.next;
			   if (p1.age > p2.age)
			   {
					t = p1.age;
					p1.age = p2.age;
					p2.age = t;
					a = p1.id;
					p1.id = p2.id;
					p2.id = a;
			   }
			 }
		 }
		 return (head1);
	  }
	  public static void print(pat head1, pat head2, int j, int k)
	  {
		int i;
		pat p;
		p = head1;
		for (i = 0;i < j;i++)
		{
			System.out.printf("%s\n",p.id);
			p = p.next;
		}
		p = head2;
		for (i = 0;i < k;i++)
		{

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


