package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int a = 3;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					break;
				}
			}

			if (j == i)
			{
				if (i - a == 2)
				{
				System.out.printf("%d %d\n",a,i);
				};
				a = i;
			}
		}
		if (a == 3)
		{
		System.out.print("empty");
		}
		return 0;
	}
}

