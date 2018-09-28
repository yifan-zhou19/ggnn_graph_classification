package <missing>;

public class GlobalMembers
{
	public static int pingguo(int a, int b)
	{
		int i;
		int z;
		int k = 1;
		int j;
		while (true)
		{
			j = 1;
			z = k * a + b;
			for (i = 1;i < a;i++)
			{
				if (z % (a - 1) == 0)
				{
					z = z / (a - 1) * a + b;
					j = j + 1;
				}
				else
				{
					k = k + 1;
					break;
				}

			}
			if (j == a)
			{
				break;
			}
		}
		return z;
	}
	public static int Main()
	{
		int n;
		int k;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		y = pingguo(n, k);
		System.out.printf("%d",y);
		return 0;
	}
}

