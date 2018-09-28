package <missing>;

public class GlobalMembers
{
	public static int F(int x)
	{
		int k;
		int t;
		int[] a = new int[25];
		a[1] = 1;
		a[2] = 1;
		if (x < 3)

		{
			t = a[x];
			return t;
		}
		else
		{
			for (k = 3;k < 21;k++)
			{
				a[k] = a[k - 1] + a[k - 2];
			}
			t = a[x];
			return t;
		}
	}
	public static int Main()
	{
		int n;
		int a;
		int i;
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
				a = Integer.parseInt(tempVar2);
			}
			System.out.printf("%d\n",F(a));
		}


		return 0;
	}
}

