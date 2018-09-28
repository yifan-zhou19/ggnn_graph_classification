public class mon
{
	public int a;
	public mon next;
}

package <missing>;

public class GlobalMembers
{
	public static mon app(int n)
	{
		mon newnode;
		mon head;
		mon thisnode;
		int i;

		for (i = 1;i <= n;i++)
		{
			newnode = new mon();
			newnode.a = i;
			if (i == 1)
			{
				head = newnode;
				thisnode = head;
			}
			else
			{
				thisnode.next = newnode;
				thisnode = newnode;
			}

		}
		thisnode.next = head;
		return head;
	}

	public static void shuchu(int n, int m)
	{
		mon head;
		int i;
		head = app(n);

		do
		{
		for (i = 1;i < m - 1;i++)
		{
			head = head.next;
		}
		head.next = head.next.next;
		head = head.next;
		}while (head.next != head);

		System.out.printf("%d\n",head.a);

	}


	public static int Main()
	{
		int n;
		int m;
		int sign = 1;

		for (;sign != 0;)
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
			if (m == 1)
			{
				System.out.printf("%d\n",n);
			}
			else
			{
			if (n != 0)
			{
				shuchu(n, m);
			}
			else
			{
				sign = 0;
			}
			}
		}

		return 0;
	}


}

