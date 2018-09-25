package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] N = new int[n];
		for (int k = 0;k < n;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(N[k]) = Integer.parseInt(tempVar2);
			}
		}
		for (i = 1;i < n;i++)
		{
			for (int r = 0;r < i;r++)
			{
			if (N[i] == N[r])
			{
				for (int j = i;j < n;j++)
				{
					N[j] = N[j + 1];
				}
				n--;
				i--;
			}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (i == n - 1)
			{
				System.out.printf("%d",N[i]);
			}
			else
			{
				System.out.printf("%d ",N[i]);
			}
		}
		return 0;
	}
}

