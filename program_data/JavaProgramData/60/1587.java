package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int b = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		k = Math.sqrt(n) + 1;
		for (i = 5;i < n + 1;i++)
		{
			for (j = 2;j < i;j++)
			{
				if (i % j == 0 || (i - 2) % j == 0)
				{
					break;
				}
			}
				if (j > i - 3)
				{
					System.out.printf("%d %d\n",i - 2,i);
					b = b + 1;
				}
		}
		if (b == 0)
		{
			System.out.print("empty\n");
		}
		return 0;
	}

}

