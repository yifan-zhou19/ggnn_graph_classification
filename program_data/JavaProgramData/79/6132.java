public class node
{
	public int a;
	public node next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		node head;
		node p1;
		node p2;
		int i;
		int n;
		int m;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (n == 0)
			{
				break;
			}
			head = new node();
			p1 = head;
			p1.a = 1;
			for (i = 2;i <= n;i++)
			{
				p2 = new node();
				p2.a = i;
				p1.next = p2;
				p1 = p2;
			}
			p1.next = head;
			while (p1.next != p1)
			{
				for (i = 1;i < m;i++)
				{
					p1 = p1.next;
				}
				p1.next = p1.next.next;
			}
			System.out.printf("%d\n",p1.a);
		}

	}
}

