package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a = 0;
		int b = 0;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] num = new int[n][2];
		int[] dnum = new int[n];
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				num[i][1] = Integer.parseInt(tempVar3);
			}
		}

		for (int i = 0;i < n;i++)
		{
			if (num[i][0] <= 140 && num[i][0] >= 90 && num[i][1] >= 60 && num[i][1] <= 90)
			{
				a++;
			}
			else
			{

				dnum[b] = a;
				b++;
				a = 0;
			}

		}
	   dnum[b] = a;

		for (int i = 0;i < b;i++)
		{
			for (int j = 1;j < b + 1 - i;j++)
			{
				if (dnum[j - 1] > dnum[j])
				{
					c = dnum[j - 1];
					dnum[j - 1] = dnum[j];
					dnum[j] = c;
				}
			}
		}

			 System.out.printf("%d",dnum[b]);
		return 0;
	}

}

