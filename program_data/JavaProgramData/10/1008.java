package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] p = new int[n];
		int[] f = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			f[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			t = 0;
			for (j = 0;j <= i;j++)
			{
				if (p[i] <= p[j] != 0 && t <= f[j])
				{
					t = f[j];
				}
			}
			f[i] = t + 1;
		}
		for (i = 0,t = 1;i < n;i++)
		{
			if (t < f[i])
			{
				t = f[i];
			}
		}
		System.out.printf("%d\n",t);
	}

}

