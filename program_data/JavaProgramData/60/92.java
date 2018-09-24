package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int b;
		int a;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n <= 4)
		{
			System.out.print("empty\n");
		}
		else
		{
		for (i = 3;i <= n - 2;i++)
		{
			a = i;
			for (j = 2;j <= a;j++)
			{
				b = a % j;
				if (b == 0)
				{
					break;
				}
			}
			if (j == a)
			{
				c = a + 2;
				for (j = 2;j <= c;j++)
				{
					b = c % j;
					if (b == 0)
					{
						break;
					}
				}
				if (j == c)
				{
					System.out.printf("%d %d\n",a,c);
				}
			}

		}
		}
	}
}

