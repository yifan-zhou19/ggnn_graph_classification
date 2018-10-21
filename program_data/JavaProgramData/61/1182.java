package <missing>;

public class GlobalMembers
{
	public static int f(int a)
	{
		int[] d = {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int i;
		for (i = 2;i < a;i++)
		{
			d[i] = d[i - 1] + d[i - 2];
		}
		return (d[a - 1]);
	}

	public static int Main()
	{
		int[] a = new int[20];
		int i;
		int[] z = new int[20];
		int n;
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			z[i] = f(a[i]);
			System.out.printf("%d\n",z[i]);
		}
		return 0;
	}
}

