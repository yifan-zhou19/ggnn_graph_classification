package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] shu = new int[100];
		int[] shou = new int[100];
		int[] t = new int[100];
		int i;
		int n;
		int j;
		int k;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				shou[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				shu[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (((shou[i + j] >= 90) && (shou[i + j] <= 140)) && ((shu[i + j] >= 60) && (shu[i + j] <= 90)))
				{
					t[i]++;
				}
				else
				{
					break;
				}
			}
		}

		for (k = 1;k <= n;k++)
		{
			for (i = 0;i < n - k;i++)
			{
				if (t[i] > t[i + 1])
				{
					e = t[i + 1];
					t[i + 1] = t[i];
					t[i] = e;
				}
			}
		}
		System.out.printf("%d",t[n - 1]);



		return 0;
	}

}

