package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int judge = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] b = new int[n];
		int i;
		int j;
		for (i = 2;i <= n;i++)
		{
			for (j = 2;j <= i - 1;j++)
			{
				if (i % j == 0)
				{
					break;
				}
			}
			if (j == i)
			{
				b[judge] = i;
				judge++;
			}
		}
		int count = 0;
		for (int k = 0;k <= judge-2;k++)
		{
			if (b[k] + 2 == b[k + 1])
			{
				System.out.printf("%d %d\n",b[k],b[k + 1]);
				count++;
			}
		}
		if (count == 0)
		{
			System.out.print("empty");
		}
	}

}

