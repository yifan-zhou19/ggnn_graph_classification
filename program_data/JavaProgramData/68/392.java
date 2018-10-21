package <missing>;

public class GlobalMembers
{
	/* Note:Your choice is C IDE */
	public static void Main()
	{
	   int prime = int n;
		int x = 6;
		int m = 2;
		int z;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			z = Integer.parseInt(tempVar);
		}
		for (x = 6;x <= z;x = x + 2)
		{
			System.out.printf("%d=",x);
			for (m = 2;prime(m) != 0 || prime(x - m) != 0;m++)
			{
			}
			System.out.printf("%d+%d\n",m,x - m);

		}
	}
	public static int prime(int n)
	{
		int i = 2;
		int j = 0;
		while (i < Math.sqrt(n) + 1)
		{
			if (n % i == 0)
			{
			j = j + i;
			}
			i = i + 1;
		}
		return (j);
	}
}

