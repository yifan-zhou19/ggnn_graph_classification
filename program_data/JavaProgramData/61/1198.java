package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] f = new int[21];
		int[] a = new int[21];
		int i;
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		f[1] = 1;
		f[2] = 1;
		for (i = 3;i <= 20;i++)
		{
			f[i] = f[i - 1] + f[i - 2];
		}
		for (i = 1;i <= n;i++)
		{
			System.out.printf("%d\n",f[a[i]]);
		}
		return 0;
	}
}

