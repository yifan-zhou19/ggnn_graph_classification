package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int[] b = new int[300];
		int n;
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		int j;
		int k;
		int m;
		for (i = 0,j = 0;i < n;i++)
		{
			for (k = 0,m = 0;k < i;k++)
			{
				if (a[k] == a[i])
				{
					m += 1;
				}
			}
			if (m == 0)
			{
				b[j] = a[i];
				j++;
			}
		}

		for (i = 0;i < j;i++)
		{
			System.out.printf("%d",b[i]);
			if (i < j - 1)
			{
				System.out.print(",");
			}
		}
		return (0);
	}
}

