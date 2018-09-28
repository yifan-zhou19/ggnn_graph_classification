package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] a = new int[20];
		int m;
		int[] f = {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		for (i = 2;i < 20;i++)
		{
		f[i] = f[i - 2] + f[i - 1];
		}
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
			m = Integer.parseInt(tempVar2);
		}
		a[i] = f[m - 1];
		}
		for (i = 1;i <= n;i++)
		{
		System.out.printf("%d\n",a[i]);
		}
		System.in.read();
		System.in.read();
		return 0;
	}

}

