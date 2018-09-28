public class student
{
	public String num = new String(new char[200]);
	public int sum;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		student p1;
		student p2;
		student p3;
		student head;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			p2 = new student();
			if (i == 0)
			{
				head = p2;
				p3 = head;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p2.num = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p2.sum = Integer.parseInt(tempVar3);
			}
				p2.next = null;
			if (p2.sum >= 60)
			{
			   if (i == 1)
			   {
				if (head.sum >= p2.sum)
				{
				  head.next = p2;
				  p2.next = null;
				  p3 = p2;
				}
				else
				{
					p1 = head;
				  p2.next = head;
				  head = p2;
				}
			   }
		   if (i > 1)
		   {
			for (p1 = head;p1.next != null;p1 = p1.next)
			{
				if (p1.sum >= p2.sum != 0 && (p1.next.sum) < p2.sum)
				{
					   p2.next = p1.next;
					   p1.next = p2;
					   break;
				}
			}
			if (p2.next == null)
			{
				if (p2.sum > head.sum)
				{
				   p2.next = head;
					 head = p2;
				}
				if (p2.sum < p1.sum)
				{
						p2.next = null;
						p3 = p2;
					p1.next = p2;
				}
			}
		   }
			}
			else
			{
				if (i != 0)
				{
			 p2.next = null;
			 p3.next = p2;
			 p3 = p2;
				}
			}
		}
		p1 = head;
		for (i = 0;(i < n && p1 != null);i++)
		{
			System.out.printf("%s\n",p1.num);
			p1 = p1.next;
		}
	}
}

