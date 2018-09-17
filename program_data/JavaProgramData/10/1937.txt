package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		int[] q = new int[100];
		int j;
		int k;
		for (i = n - 2;i >= 0;i--)
		{
			for (j = i,k = i;j < n;j++)
			{
				if (a[j] <= a[i] != 0 && q[k] <= q[j])
				{
					k = j;
				}
			}
			if (k != i)
			{
				q[i] = q[k] + 1;
			}
		}
		for (i = 0,k = 0;i < n;i++)
		{
			if (q[k] < q[i])
			{
				k = i;
			}
		}
		System.out.printf("%d",q[k] + 1);
		return 0;
	}

}

