public class ill
{
 public String id = new String(new char[11]);
 public int age;
 public ill next;
}

package <missing>;

public class GlobalMembers
{
	public static ill creat(int n)
	{
		ill head;
		ill p1;
		ill p2;
	 int i;
	 head = null;
	 for (i = 0;i < n;i++)
	 {
		 p1 = new ill();
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  p1.id = tempVar.charAt(0);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  p1.age = Integer.parseInt(tempVar2);
	  }
	  if (i == 0)
	  {
		  head = p1;
	  }
	  else
	  {
		  p2.next = p1;
	  }
	  p2 = p1;
	 }
	 p2.next = null;
	 return (head);
	}
	public static ill arrang(ill head)
	{
		int t;
		int tt;
	 String s = new String(new char[11]);
	 String ss = new String(new char[11]);
	 ill p;
	 ill q;
	 ill m;
	 ill h;
	 for (p = head;p != null;p = p.next)
	 {
		 if (p.age >= 60)
		 {
		  for (m = p,q = p.next;q != null;q = q.next)
		  {
		  if (q.age > m.age && m.age >= 60)
		  {
			  m = q;
		  }
		  }
		  {
			  t = tt = p.age;
			  s = p.id;
			  ss = p.id;
		   for (h = p.next;h != m.next;h = h.next)
		   {
			   tt = h.age;
			   ss = h.id;
			h.age = t;
			h.id = s;
			t = tt;
			s = ss;
		   }
		  p.age = t;
		  p.id = s;
	  }
		 }
	 }
	 return (head);
	}
	public static void Main()
	{
		int n;
	 ill head;
	 ill h;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 head = creat(n);
	 head = arrang(head);
	 for (h = head;h != null;h = h.next)
	 {
		 if (h.age >= 60)
		 {
			 System.out.printf("%s\n",h.id);
		 }
	 }
	 for (h = head;h != null;h = h.next)
	 {
		 if (h.age < 60)
		 {
			 System.out.printf("%s\n",h.id);
		 }
	 }
	}
}

