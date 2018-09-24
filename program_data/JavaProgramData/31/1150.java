public class student
{
 public String studen = new String(new char[100]);
 public student next;
}

package <missing>;

public class GlobalMembers
{
	public static final String m = "end";
	 public static int n;
	 public static student creat()
	 {
		 student head;
		 student p1;
		 student p2;
		 n = 0;
		 p1 = p2 = new student();
		 p1.studen = new Scanner(System.in).nextLine();
		 head = null;
		 while (strcmp(p1.studen,m) != 0)
		 {
		  n = n + 1;
		  if (n == 1)
		  {
			  head = p1;
		  }
		  else
		  {
			  p2.next = p1;
		  }
		  p2 = p1;
		  p1 = new student();
		  p1.studen = new Scanner(System.in).nextLine();
		 }
		 p2.next = null;
		 return (head);
	 }
	 public static void print(student head)
	 {
		 student p;
		 student q;
		  p = q = head; //p,q???????????
		  while (p.next != null)
		  {
		  p = p.next; //?p??????????????
		  }
		System.out.printf("%s\n",p.studen);
	   while (true)
	   {
	   while (q.next != p)
	   {
		 q = q.next;
	   }
		 System.out.printf("%s\n",q.studen);
		p = q;
		q = head;
	   if (p == head)
	   {
		   break;
	   }
	   }
	 }
	public static int Main()
	{
		student ahead;
		ahead = creat();
		print(ahead);
	}

}
