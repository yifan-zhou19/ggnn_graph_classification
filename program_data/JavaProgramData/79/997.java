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
		int i;
		int j;
		int m;
		int n;
		node head;
		node p1;
		node p2;
		for (i = 1;;i++)
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
			p1 = new node();
			p1.a = 1;
			head = p1;
			for (j = 2;j <= n;j++)
			{
				p2 = new node();
				p2.a = j;
				p1.next = p2;
				p1 = p2;
			}
			p1.next = head;
			while (head.next != head)
			{
				for (i = 1;i < m;i++)
				{
					p1 = head;
					head = head.next;
				}
				p1.next = head.next;
				head = head.next;
			}
			System.out.printf("%d\n",head.a);
		}
	}
}

