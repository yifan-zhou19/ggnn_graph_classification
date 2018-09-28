package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = int n;
		int i;
		int j;
		int z;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			z = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= z;i = i + 2)
		{
			for (j = 3;j <= i - j;j = j + 2)
			{
				if (a(j) != 0 && a(i - j) != 0)
				{
					System.out.printf("%d=%d+%d\n",i,j,i - j);
					break;
				}
			}
		}
				return 0;
	}
	public static int a(int n)
	{
		int k;
		for (k = 3;k <= Math.sqrt(n);k = k + 2)
		{
			if (n % k == 0)
			{
				return (0);
			}
		}
			return (1);
	}
}

