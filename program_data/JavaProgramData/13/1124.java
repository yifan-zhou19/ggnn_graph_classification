package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] num = new int[20000];
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num[i - 1] = Integer.parseInt(tempVar2);
			}
			for (j = 1;j <= i - 1;j++)
			{
				if (num[j - 1] == num[i - 1])
				{
					num[i - 1] = 0;
					break;
				}
			}
		}
		System.out.printf("%d",num[0]);
		for (i = 1;i <= n - 1;i++)
		{
			if (num[i] != 0)
			{
				System.out.printf(" %d",num[i]);
			}
		}
		return 0;
	}
}

