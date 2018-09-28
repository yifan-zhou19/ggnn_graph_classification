package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int[] a = new int[300];
		int[] b = new int[300];
		int m;
		int k = 1;
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
		b[0] = a[0];
		for (i = 1;i < n;i++)
		{
			j = 0;
			m = 1;
		while (j < i)
		{
			if (a[i] != a[j])
			{
				m = m * 1;
			}
		else
		{
			m = m * 0;
		}
		j++;
		}
		if (m == 1)
		{
			b[k] = a[i];
			k++;
		}
		}
		for (i = 0;i < k - 1;i++)
		{
			System.out.printf("%d,",b[i]);
		}
		System.out.printf("%d\n",b[k - 1]);
	}
}

