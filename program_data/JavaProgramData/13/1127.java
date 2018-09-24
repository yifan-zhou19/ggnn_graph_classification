package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] num = new int[n];
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			num[0] = Integer.parseInt(tempVar2);
		}
		System.out.printf("%d",num[0]);
		for (i = 1;i <= n - 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				num[i] = Integer.parseInt(tempVar3);
			}
			for (j = 0;j <= i;j++)
			{
			if (j < i && num[j] == num[i])
			{
				break;
			}
			if (j == i)
			{
				System.out.printf(" %d",num[i]);
			}
			}
		}
	return 0;
	}
}

