package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int judge = 0;
		int n;
		int[] a = new int[20000];
		int count1 = 0;
		int count2 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n;i += 2)
		{
			count1 = 0;
			for (j = 1;j <= i;j++)
			{
				if (i % j == 0)
				{
					count1 += 1;
				}
			}
			if (count1 == 2)
			{
				a[count2] = i;
				count2 += 1;
			}
		}
		for (i = 0;i <= count2 - 1;i++)
		{
			if ((a[i + 1] - a[i]) == 2)
			{
				System.out.printf("%d %d\n", a[i],a[i + 1]);
				judge = 1;
			}
		}
		if (judge == 0)
		{
			System.out.print("empty\n");
		}
		return 0;
	}

}

