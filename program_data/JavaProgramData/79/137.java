public class monkey
{
	public int num;
	public monkey next;
}

package <missing>;

public class GlobalMembers
{
	public static monkey[] monkey = tangible.Arrays.initializeWithDefaultmonkeyInstances(300);
	public static void Main()
	{
		monkey head;
		monkey p;
		monkey q;
		int n;
		int i;
		int m;
		int j;
		int k;
		for (i = 0;i < 300;i++)
		{
			monkey[i].num = i + 1;
		}
		for (j = 0;;j++)
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
			if (n == 0 && m == 0)
			{
				break;
			}
			head = monkey[0];
			for (i = 0;i < n - 1;i++)
			{
				monkey[i].next = monkey[i + 1];
			}
			monkey[n - 1].next = monkey[0];
			p = head;
			if (m != 1)
			{
				while (p != p.next)
				{
					for (k = 0;k < m - 2;k++)
					{
						p = p.next;
					}
					q = p.next;
					p.next = q.next;
					p = q.next;
				}
				System.out.printf("%d\n",p.num);
			}
			if (m == 1)
			{
				System.out.printf("%d\n",monkey[n - 1].num);
			}
		}
	}

}

