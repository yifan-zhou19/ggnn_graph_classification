package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[300];
		int[] b = new int[300];
		int i;
		int j;
		int m = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		b[0] = a[0];
		for (i = 0;i <= n - 1;i++)
		{
			for (j = 0;j <= m - 1;j++)
			{
				if (a[i] == b[j])
				{
					break;
				}
			}
			if (j == m)
			{
				m++;
				b[m - 1] = a[i];
			}
			else
			{
				continue;
			}
		}
		for (i = 0;i <= m - 1;i++)
		{
			if (i != 0)
			{
				System.out.print(",");
			}
			System.out.printf("%d",b[i]);
		}
	}


}

