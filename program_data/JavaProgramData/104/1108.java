package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int i;
		int a;
		int b;
		int[] m = new int[20];
		int[] n = new int[20];
		int j;
		int f = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		if (x == y)
		{
			System.out.printf("%d",x);
		}
		else
		{
		i = 0;
		while (x > 0)
		{
			m[i] = x;
			x = x / 2;
			i++;
		}
		i = 0;
		while (y > 0)
		{
			n[i] = y;
			y = y / 2;
			i++;
		}
		for (i = 0;i < 13;i++)
		{
			for (j = 0;j < 13;j++)
			{
				if (m[i] == n[j])
				{
					if (f == 0)
					{
					System.out.printf("%d",m[i]);
							 f = 1;
					}
				}
			}
		}
		}
		return 0;
	}
}

