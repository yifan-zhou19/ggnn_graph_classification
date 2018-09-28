package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[A];
	public static int Main()
	{
		int n;
		int i;
		int s;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 2;i < A;i++)
		{
			if (a[i] == 0)
			{
				for (j = i << 1;j < A;j += i)
				{
					a[j] = 1;
				}
			}
		}
		for (i = 3;i <= n / 2;i += 2)
		{
			if (a[i] == 0)
			{
				if (a[n - i] == 0)
				{
					System.out.printf("%d %d\n",i,n - i);
				}
			}
		}
		return 0;

	}


}

