package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int i;
		int j;
		int x1 = 1;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (a = 6;a <= n;a = a + 2)
		{
		for (i = 2;i <= a;i++)
		{
			if ((i == 2) || (i % 2 == 1))
			{
				x1 = 1;
					for (j = 2;j <= Math.sqrt(i - 1) + 1;j++)
					{
					if (i % j == 0)
					{
					x1 = 0;
					break;
					}
					}
					if (x1 != 0)
					{
						for (j = 2;j < Math.sqrt(a - i) + 1;j++)
						{
					if ((a - i) % j == 0)
					{
					x1 = 0;
					break;
					}
						}
					}
					if (x1 != 0)
					{
						System.out.printf("%d=%d+%d\n",a,i,a - i);
						break;
					}
			}
		}
		}
	}

}

