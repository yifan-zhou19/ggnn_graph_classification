package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[20000];
		int[] b = new int[20000];
		int n;
		int i;
		int k;
		int j;
		int l;
		int m;
		int bn;
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
		m = 0;
		for (j = 1;j < n;j++)
		{
			for (k = 0,l = 1;k < j;k++)
			{
				if (a[j] == a[k])
				{
					l = 0;
					break;
				}
			}
			if (l != 0)
			{
				m += 1;
				b[m] = a[j];
			}
		}
		for (bn = 0;bn < m;bn++)
		{
			System.out.printf("%d ",b[bn]);
		}
		System.out.printf("%d",b[m]);
	}
}

