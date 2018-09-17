package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] d = new int[25];
		int[] f = new int[25];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				d[i] = Integer.parseInt(tempVar2);
			}
		}
		for (int i = 0;i < n;i++)
		{
			f[i] = 1;
			for (int j = 0;j < i;j++)
			{
				if (d[j] >= d[i] != 0 && f[i] < f[j] + 1)
				{
					f[i] = f[j] + 1;
				}
			}
		}
		int ans = -1;
		for (int i = 0;i < n;i++)
		{
			if (ans < f[i])
			{
				ans = f[i];
			}
		}
		System.out.printf("%d\n",ans);
		return 0;
	}
}

