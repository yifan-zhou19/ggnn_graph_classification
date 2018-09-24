package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
		int[] a = new int[25];
		int[] f = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		}
		for (i = 0;i < k;i++)
		{
		for (j = 0;j < i;j++)
		{
		if (a[j] >= a[i] != 0 && f[j] >= f[i])
		{
			f[i] = f[j] + 1;
		}
		else if (f[i] == 0)
		{
			f[i] = 1;
		}
		}
		}
		for (i = 0;i < k;i++)
		{
		if (t < f[i])
		{
			t = f[i];
		}
		}
		System.out.printf("\n%d",t);
		return 0;
	}
}

