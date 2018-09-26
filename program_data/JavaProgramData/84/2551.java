package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int t;
		int i;
		int j;
		int[] a = new int[100];
		int k;
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
			k = i;
			for (j = i + 1;j < n;j++)
			{
				if (a[j] < a[k])
				{
					k = j;
				}
			}
			if (k != i)
			{
				t = a[k];
				a[k] = a[i];
				a[i] = t;
			}
		}
		System.out.printf("%d\n%d",a[n - 1],a[n - 2]);
		return 0;
	}
}

