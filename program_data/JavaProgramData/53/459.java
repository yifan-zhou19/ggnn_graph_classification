package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[301];
		int[] b = new int[301];
		int i;
		int j = 1;
		int k;
		int m;
		int t;
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
		b[1] = a[1];
		for (i = 2;i <= n;i++)
		{
			for (k = 1;k <= j;k++)
			{
				if (b[k] == a[i])
				{
					break;
				}
			}
			if (k == j + 1 && b[k - 1] != a[i])
			{
				j++;
				b[j] = a[i];
			}
		}
		for (i = 1;i <= j - 1;i++)
		{
			System.out.printf("%d,", b[i]);
		}
		System.out.printf("%d\n",b[j]);
	}


}

