package <missing>;

public class GlobalMembers
{
	public static int sushu(int x)
	{
		int j;
		int z = 0;
		if (x % 2 == 0)
		{
			z = 1;
		}
		else
		{
			for (j = 3;j <= Math.sqrt(x);j += 2)
			{
				if (x % j == 0)
				{
					z = 1;
					break;
				}
			}
		}
		return (z);
	}
	public static int Main()
	{
		int max;
		int i;
		int j;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			max = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= max;i += 2)
		{
			for (j = 2;j <= i / 2;j++)
			{
				a = sushu(j);
				b = sushu(i - j);
				if (a == 0 && b == 0)
				{
					System.out.printf("%d=%d+%d\n",i,j,i - j);
					break;
				}
			}
		}
		return 0;
	}
}

