package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int a;
		int x = 0;
		int y = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (n = 6;n <= m;n = n + 2)
		{
			for (i = 3;i <= n / 2;i = i + 2)
			{
				for (a = 3;a <= Math.sqrt(i);a = a + 2)
				{

					if (i % a == 0)
					{
						break;
					}
				}
					if (a > Math.sqrt(i))

					{
						for (a = 3;a <= Math.sqrt(n - i);a = a + 2)
						{

					if ((n - i) % a == 0)
					{
						break;
					}
						}
					if (a > Math.sqrt(n - i))

					{
					System.out.printf("%d=%d+%d\n",n,i,n - i);
					break;
					}
					}


			}
		}
	}
}

