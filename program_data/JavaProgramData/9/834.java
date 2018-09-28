public class pat
{
 public String id;
 public int a;
 public int o;
 public pat next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;

	public static int Main()
	{
		pat create = new pat(int n);
		pat arrange = new pat(struct pat * head);
		pat head;
		pat p;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = create(n);
		head = arrange(head);

		p = head;
		while (p != null)
		{
		 System.out.printf("%s",p.id);
		 if (p.next != null)
		 {
			 System.out.print("\n");
		 }
		 p = p.next;
		}
	}

	public static pat create(int n)
	{
	 pat head;
	 pat p1;
	 pat p2;
	 int i;
	 p2 = head = MLCP;

	 for (i = 1;i <= n;i++)
	 {
	  p1 = MLCP;
	  p1.id = MLCI;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  p1.id = tempVar.charAt(0);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  p1.a = Integer.parseInt(tempVar2);
	  }
	  p1.o = i;

	  p2.next = p1;
	  p2 = p1;
	 }
	 p2.next = null;

	 return head;
	}

	public static pat arrange(pat head)
	{
		 void sort(struct pat * hn);

		 pat p1;
		 pat p2;
		 pat hn;
		 pat n1;

		 n1 = hn = MLCP;

		 p2 = head;
		 p1 = head.next;
		 while (p1 != null)
		 {
		  if (p1.a >= 60)
		  {
		   p2.next = p1.next;
		   n1.next = p1;
		   n1 = p1;

		   p1 = p2.next;
		  }
		  else
		  {
			  p1 = p1.next;
			  p2 = p2.next;
		  }
		 }
		 n1.next = null;
		 sort(hn);

		 n1.next = head.next;
		 head = hn.next;

		 return head;
	}

	public static void sort(pat hn)
	{
	   pat p1;
	   pat p2;
	   String tid;
	   int ta;
	   int to;

	   p1 = hn.next;
	   while (p1 != null)
	   {
		p2 = p1.next;
		while (p2 != null)
		{
		 if (p2.a > p1.a || (p2.a == p1.a && p2.o < p1.o))
		 {
		  tid = p2.id;
		  p2.id = p1.id;
		  p1.id = tid;
		  ta = p2.a;
		  p2.a = p1.a;
		  p1.a = ta;
		  to = p2.o;
		  p2.o = p1.o;
		  p1.o = to;
		 }
		 p2 = p2.next;
		}
		p1 = p1.next;
	   }
	}

}

