package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int[] sz = new int[MAX];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (int i = 0; i < n; i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i] = Integer.parseInt(tempVar3);
			}
		}
		int sum;
		int out_put = 0;
		for (int j = 0; j < n - 1; j++)
		{
			for (int m = j + 1; m < n; m++)
			{
				sum = sz[j] + sz[m];
				if (sum == k)
				{
					out_put = 1;
					break;
				}
			}
			if (out_put == 1)
			{
				break;
			}
		}
		if (out_put == 1)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}
}

