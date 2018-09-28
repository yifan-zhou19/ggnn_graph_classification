package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int t;
		t = 0;
		int[] a = new int[300];
		int[] b = new int[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n - 1;i++)
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
			a[n - 1] = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < i;j++)
			{
				if (a[i] == a[j])
				{
					a[i] = -1;
				break;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] != -1)
			{
				b[t] = a[i];
				t = t + 1;
			}
		}
		for (i = 0;i < t - 1;i++)
		{
			System.out.printf("%d,",b[i]);
		}
		System.out.printf("%d",b[t - 1]);
	}
}

