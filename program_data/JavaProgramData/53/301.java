package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int k;
		int i;
		int j;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		int[] a = new int[k];
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		m = k;
		for (i = 0;i < k;i++)
		{

			for (j = i + 1;j < k;j++)
			{
			if (a[j] == a[i])
			{
				a[j] = -j * 2 * 2 * 2 * 2;
				m--;
			}
			}
		}
		int[] b = new int[m];
		int p;
		b[0] = a[0];
		for (j = 1,i = 1;j < k;j++)
		{
			if (a[j] > 0)
			{
				b[i] = a[j];
				i++;
			}
		}
		p = m - 1;
		for (i = 0;i < p;i++)
		{
			System.out.printf("%d,",b[i]);
		}
		System.out.printf("%d\n",b[m - 1]);
	}
}

