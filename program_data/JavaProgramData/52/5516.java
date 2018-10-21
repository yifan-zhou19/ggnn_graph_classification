package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[] num = new int[220];
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		j = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				num[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = n;i < n + n - m;i++)
		{
			num[i] = num[j];
			j = j + 1;
		}

		System.out.printf("%d",num[n - m]);
		for (i = n - m + 1;i < n + n - m;i++)
		{
			System.out.printf(" %d",num[i]);
		}
		return 0;
	}

}

