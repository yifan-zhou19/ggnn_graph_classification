package <missing>;

public class GlobalMembers
{
	public static int max(int[] a, int m, int n)
	{
		int i;
		int j = 0;
		for (i = n;i < m;i++)
		{
			if (a[i] < a[n])
			{
				j = a[n];
				a[n] = a[i];
				a[i] = j;
			}
		}
		return a[500];
	}
	public static int Main()
	{
		int[] a = new int[500];
		int[] b = new int[500];
		int i;
		int j;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (n = 0;n < m;n++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[n] = Integer.parseInt(tempVar2);
			}
		}
		i = 0;
			for (j = 0;j < m;j++)
			{
				if (a[j] % 2 == 1)
				{
					b[i] = a[j];
					i++;
				}
			}
			j = 0;
			n = 0;
			for (j = 0;j < i + 1;j++)
			{
				max(b, i + 1, j);
			}
			for (n = 1;n < i;n++)
			{
				System.out.printf("%d",b[n]);
				System.out.print(",");
			}
			System.out.printf("%d",b[i]);
			return 0;
	}

}

