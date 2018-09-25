package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int j;
		int[] mistake = new int[100];
		int k;
		int[] result = new int[100];
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
				m = Integer.parseInt(tempVar2);
			}
			result[i] = 60;
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					mistake[j] = Integer.parseInt(tempVar3);
				}
			}
			for (j = 0;j < m;j++)
			{
				for (k = 0;k <= 3;k++)
				{
					if (mistake[j] + 3 * j + k >= 60)
					{
						result[i] -= (k + 1);
						break;
					}
				}
				if (result[i] != 60)
				{
					result[i]++;
					break;
				}
			}
			result[i] -= 3 * j;
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",result[i]);
		}
		return 0;
	}


}

