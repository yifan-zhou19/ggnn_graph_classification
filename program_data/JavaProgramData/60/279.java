package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n <= 4)
		{
		System.out.print("empty");
		}
		else
		{
			for (i = 3;i <= n - 2;i++)
			{
				for (j = 2;j <= i - 1;j++)
				{
					if (i % j == 0)
					{
						break;
					}
				}
				if (j > i - 1)
				{
					for (k = 2;k <= i + 1;k++)
					{
						if ((i + 2) % k == 0)
						{
							break;
						}
					}
					if (k > i + 1)
					{
						System.out.printf("%d %d\n",i,i + 2);
					}
					else
					{
						;
					}
				}
				else
				{
					;
				}
			}
		}
		System.in.read();
		System.in.read();
	}
}

