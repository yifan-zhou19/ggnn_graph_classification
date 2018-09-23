package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int max;
		int[] f = new int[26];
		int[] g = new int[26];
		/*g[i]???i??????*/
		/*f[i]????i?????????????????*/
		/*f[k]=max{f[i]:k+1<=j<=n&&g[i]<=g[k]}*/
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
				g[i] = Integer.parseInt(tempVar2);
			}
			f[i] = 0;
		}
		f[n] = 1;
		for (i = n - 1;i >= 1;i--)
		{
			max = 0;
			for (j = i + 1;j <= n;j++)
			{
				if ((g[j] <= g[i]) && (f[j]> max))
				{
					max = f[j];
				}
			}
			f[i] = max + 1;
		}
		max = 0;
		for (i = 1;i <= n;i++)
		{
			if (f[i] > max)
			{
				max = f[i];
			}
		}
		System.out.printf("%d\n",max);
		return 0;
	}

}

