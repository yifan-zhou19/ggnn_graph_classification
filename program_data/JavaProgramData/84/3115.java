package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int n;
		int t;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n > 1 && n < 100)
		{
			for (i = 0;i <= n - 1;i++)
			{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			}
			System.out.print("\n");
			for (j = 0;j < n - 1;j++)
			{
				for (i = 0;i < n - 1 - j;i++)
				{
					if ((Math.abs(a[i])) > (Math.abs(a[i + 1])))
					{
						t = a[i];
						a[i] = a[i + 1];
						a[i + 1] = t;
					}
				}
			}
			System.out.printf("%d\n%d\n",a[n - 1],a[n - 2]);

		}
	}
}

