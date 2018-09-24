package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int a = 0;
		int b = 0;
		int c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 2;i < n - 1;i++)
		{
			a = 0;
			b = 0;
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					a = 1;
				}
			}
			if (a == 1)
			{
				continue;
			}
			if (a == 0)
			{
				for (j = 2;j < i + 2;j++)
				{
					if ((i + 2) % j == 0)
					{
						b = 1;
					}
				}
			}
			if (a == 0 && b == 0)
			{
				System.out.printf("%d %d\n",i,i + 2);
				c = 1;
			}
		}
		if (c == 0)
		{
			System.out.print("empty");
		}
	}

}

