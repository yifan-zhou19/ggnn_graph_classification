public class N
{
 public String w = new String(new char[50]);
 public int n;
 public N next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 N p;
	 N q;
	 N head;
	 int n;
	 int d;
	 int i;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 1;i <= n;i++)
	 {
		 p = new N();
		 if (i == 1)
		 {
			 head = p;
			 q = p;
		 }
		 else
		 {
			 if (i != n)
			 {
			  q.next = p;
			  q = p;
			 }
			 else
			 {
			  q.next = p;
			  p.next = null;
			 }
		 }
	 }
	 p = head;
	 for (i = 1;i <= n;i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  p.w = tempVar2.charAt(0);
	  }
	  p.n = (p.w.length() + 1);
	  p = p.next;
	 }
	 d = -1;
	 p = head;
	 for (i = 1;i <= n;)
	 {
		 if (d == (-1))
		 {
			 System.out.printf("%s",p.w);
			i++;
		   d = d + (p.n);
		   p = p.next;
		 }
		 if ((d + (p.n)) <= 80 && d != (-1))
		 {
		  System.out.printf(" %s",p.w);
		  i++;
		  d = d + (p.n);
		  p = p.next;
		  if (p == null)
		  {
			  break;
		  }
		 }
		 if ((d + (p.n)) > 80)
		 {
		  System.out.print("\n");
		  d = -1;
		 }
	 }
	 return 0;
	}
}

