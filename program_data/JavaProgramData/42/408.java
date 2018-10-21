package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int k;
		int m = 0;
		int t;
		int[] a = new int[100000];
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] == k)
			{
				m++;
				for (j = 0;j <= i;j++)
				{
					t = a[0];
					a[0] = a[j];
					a[j] = t;
				}
			}
		}
		for (i = m;i < n - 1;i++)
		{
			System.out.printf("%ld ",a[i]);
		}
		System.out.printf("%ld",a[n - 1]);
	}

}

