package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int m;
		int p;
		m = 0;
		p = 0;
		int[] sz = new int[200];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (a - b == 1 || b - a == 2)
			{
				sz[m] = 0;
				m++;
			}
			else if (a != b)
			{
				sz[m] = 1;
				m++;
			}
		}
		for (i = 0;i < m;i++)
		{
			p += sz[i];
		}
		if ((p * 2) > m)
		{
			System.out.print("A");
		}
		else if ((p * 2) == m)
		{
			System.out.print("Tie");
		}
		else
		{
			System.out.print("B");
		}
		return 0;
	}

}

