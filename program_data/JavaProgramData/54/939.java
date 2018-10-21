package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int i;
		int n;
		int k;
		int t = 0;
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		while (++t != 0)
		{
			a[1] = t * n + k;
			flag = 1;
		for (i = 2;i <= n;i++)
		{
			if ((a[i - 1]) % (n - 1) == 0)
			{
		  a[i] = a[i - 1] / (n - 1) * n + k;
			}
		if (a[i - 1] % (n - 1) != 0)
		{
			flag = 0;
			break;
		}

		}
		if (flag == 1)
		{
			break;
		}
		}

		System.out.printf("%d\n",a[n]);
		return 0;
	}

}

