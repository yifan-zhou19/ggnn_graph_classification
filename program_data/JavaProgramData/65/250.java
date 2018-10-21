package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int k;
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		k = 0;
		m = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (b - a == 1)
			{
				k = k + 1;
			}
			if (a - b == 2)
			{
				k = k + 1;
			}
			if (a - b == 1)
			{
				m = m + 1;
			}
			if (b - a == 2)
			{
				m = m + 1;
			}
		}
		if (k > m)
		{
			System.out.print("A");
		}
		if (k < m)
		{
			System.out.print("B");
		}
		if (k == m)
		{
			System.out.print("Tie");
		}
		return 0;
	}
}

