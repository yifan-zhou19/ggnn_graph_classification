public class LinkNode
{
	   public int data;
	   public LinkNode next;
}

package <missing>;

public class GlobalMembers
{
	public static int k;

	public static LinkNode createList()
	{
		   int n;
		   int m;
		   LinkNode head;
		   LinkNode p1;
		   LinkNode p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		   head = (LinkNode) malloc(N);
		   head.next = null;
		   p2 = head;
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   n = Integer.parseInt(tempVar);
		   }
		   while (n-- != 0)
		   {
				 String tempVar2 = ConsoleInput.scanfRead();
				 if (tempVar2 != null)
				 {
					 m = Integer.parseInt(tempVar2);
				 }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				 p1 = (LinkNode) malloc(N);
				 p1.data = m;
				 p1.next = null;
				 p2.next = p1;
				 p2 = p1;
		   }
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   k = Integer.parseInt(tempVar3);
		   }
		   return head;
	}
	public static int Main()
	{
		LinkNode head;
		LinkNode p;
		LinkNode q;
		LinkNode pre;
		//freopen("7.in", "r", stdin);
		//freopen("7.out", "w", stdout); 
		head = createList();
		p = head.next;
		pre = head;
		while (p != null)
		{
			  if (p.data == k)
			  {
				 pre.next = p.next;
				 q = p;
				 p = p.next;
				 q = null;
			  }
			  else
			  {
				   pre = p;
				   p = p.next;
			  }
		}

		p = head.next;
		while (p != null)
		{
			  q = p;
			  p = p.next;
			  System.out.printf("%d%s", q.data, p != null ? " " : "");
			  q = null;
		}

		return 0;
	}

}

