public class mon
{
	public int num;
	public mon next;
}

package <missing>;

public class GlobalMembers
{
	public static void monkey(int m,int n)
	{
		mon[] a = tangible.Arrays.initializeWithDefaultmonInstances(300);
		mon p1;
		mon p2;
		int i;
		int j;
		for (i = 1;i <= n;i++)
		{
			a[i].num = i;
			a[i].next = a + i + 1;
		}
		a[n].next = a + 1;
		p1 = a + 1;
		for (;n > 1;n--)
		{
			for (j = 1;j < m;j++)
			{
				p2 = p1;
				p1 = p2.next;
			}
			p2.next = p1.next;
			p1 = p1.next;
		}
		System.out.printf("%d\n",p1.num);
	}
	public static int Main()
	{
		int n;
		int m;
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
			if (m == 0 && n == 0)
			{
				break;
			}
			monkey(m, n);
		}
		return 0;
	}
}

