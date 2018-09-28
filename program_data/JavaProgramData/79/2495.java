package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[] a = new int[1000];
		int l;
		int i;
		int j;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
		if ((n == 0) && (m == 0))
		{
			break;
		}
		for (i = 1;i <= n;i++)
		{
			a[i] = i;
		}
		l = (m - 1) % n + 1;
		for (i = 1;i <= n - 1;i++)
		{
			for (j = 1;j <= n;j++)
			{
		  if (j >= l)
		  {
			  a[j] = a[j + 1];
		  }
			}
		  l = (l + m - 2) % (n - i) + 1;

		}
		System.out.printf("%d\n",a[1]);
		}
		return 0;
	}
}

