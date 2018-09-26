package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] z = new int[200000];
		for (a = 1;a <= n;a++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				z[a] = Integer.parseInt(tempVar2);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		d = 0;
		a = n;
		while (z[a] == b)
		{
			a -= 1;
		}
		n = a;
		for (a = 1;a <= n;a++)
		{
			if (z[a] != b)
			{
				if (a < n)
				{
			System.out.printf("%d ",z[a]);
				}
				else
				{
		System.out.printf("%d",z[a]);
				}
			}
		}
		return 0;
	}
}

