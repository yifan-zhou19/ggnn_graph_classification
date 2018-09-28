package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int count1 = 0;
		int count2 = 0;
		int num = 0;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n - 2;i++)
		{
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					count1++;
				}
			}
			for (j = 2;j < i + 2;j++)
			{
				if ((i + 2) % j == 0)
				{
					count2++;
				}
			}
			if (count1 == 0 && count2 == 0)
			{
			System.out.printf("%d %d\n",i,(i + 2));
			num = num + 1;
			}
			count1 = 0;
			count2 = 0;
		}
		if (num == 0)
		{
			System.out.print("empty");
		}
		return 0;
	}
}

