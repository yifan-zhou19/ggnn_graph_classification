package <missing>;

public class GlobalMembers
{
	public static int[] g = new int[300];



	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		int k = 0;
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				g + k = tempVar2;
			}
			for (int j = 0;j < k;j++)
			{
				if (g[j] == g[k])
				{
					k--;
					break;
				}
			}
			k++;
		}

		System.out.printf("%d",g[0]);
		for (int j = 1;j < k;j++)
		{
			System.out.printf(",%d",g[j]);
		}

		return 0;
	}
}

