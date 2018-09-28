package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int a = 0;
		int[] b = new int[10000];
		int c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n;i += 2)
		{
			a = 0;
			for (j = 1;j <= i;j++)
			{
				if (i % j == 0)
				{
					a++;
				}
			}
			if (a == 2)
			{
				b[c] = i;
				c++;
			}
		}
		for (i = 0;b[i] != 0;i++)
		{
			if (b[i] + 2 == b[i + 1])
			{
				System.out.printf("%d %d\n",b[i],b[i + 1]);
			}
		}
		if (c < 2)
		{
			System.out.print("empty");
		}
		return 0;
	}

}

