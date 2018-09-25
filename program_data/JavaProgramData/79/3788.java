public class monkey
{
		public int num;
		public monkey next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int kingf = new int(int n,int m);
		int m = 1;
		int n = 1;
		int king;
		for (;;)
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
			if (m == 1)
			{
				System.out.printf("%d\n",n);
			}
			else
			{
				king = kingf(n, m);
				System.out.printf("%d\n",king);
			}
		}
	}
	public static int kingf(int n,int m)
	{
		int i;
		monkey[] monkey = tangible.Arrays.initializeWithDefaultmonkeyInstances(800);
		monkey p1 = monkey[0];
		monkey p2 = monkey[0];

		for (i = 0;i < n - 1;i++)
		{
			monkey[i].next = monkey[i + 1];
			monkey[i].num = i + 1;
		}
		monkey[i].next = monkey[0];
		monkey[i].num = i + 1;

		for (;p1 != p1.next;p1 = p1.next)
		{
			for (i = 1;i < m - 1;p1 = p1.next,i++)
			{
				;
			}
			p2 = p1;
			p2 = p2.next;
			p1.next = p2.next;
		}
		return p1.num;
	}

}

