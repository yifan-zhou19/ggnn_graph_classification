package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i = 0;
	 int j = 0;
	 int[] a = new int[50000];
	 int[] b = new int[50000];
	 int e;
	 int f;
	 int n;
	 int t = 1;

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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b[i] = Integer.parseInt(tempVar3);
		}
		}
		for (j = 1;j <= n;j++)
		{
				for (i = 0;i < n - j;i++)
				{
			if (a[i] > a[i + 1])
			{
			e = a[i + 1];
			a[i + 1] = a[i];
			a[i] = e;
			f = b[i + 1];
			b[i + 1] = b[i];
			b[i] = f;
			}
				}
		}
		for (i = 0;i < n - 1;i++)
		{
			if (b[i] >= a[i + 1])
			{
				a[i + 1] = a[0];
				if (b[i] > b[i + 1])
				{
	 b[i + 1] = b[i];
				}
			}
			else
			{
				System.out.print("no");
				t = 0;
			}
		}
		if (t == 1)
		{
			System.out.printf("%d %d",a[0],b[n - 1]);
		}
		return 0;
	}

}

