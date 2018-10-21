public class jiegou
{
	public int a;
	public jiegou next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		jiegou p1;
		jiegou p2;
		jiegou head;
		jiegou p;
		int n;
		int m;
		int i;
		int count = 1;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (n == 0)
			{
				break;
			}
			p1 = new jiegou();
			for (i = 0;i < n;i++)
			{
				if (i == 0)
				{
				  head = p1,p2 = p1,p1.a = 1;
				}
				else
				{
					p1 = new jiegou();
					p1.a = i + 1;
					p2.next = p1;
					p2 = p1;
				}
			}
			p2.next = head;

			p = head;
			while (head.next != head)
			{
			if (m != 1)
			{
				count++;
				if (count == m)
				{
				   if (p.next != head)
				   {
					 p.next = (p.next).next;
				   }

				   else
				   {
						p.next = (p.next).next;
						head = p;
				   }
				 count = 1;

				}

			   p = p.next;
			}
			else
			{
				System.out.printf("%d\n",n);
				break;
			}


			}
			if (m != 1)
			{
			System.out.printf("%d\n",head.a);
			}
		}

	}

}

