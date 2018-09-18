package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k = 0;
		int m = 1;
		int n;
		int[] a = new int[20000];
		int[] b = new int[20000];
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
			for (j = 0;j < i;j++)
			{
				if (a[i] == a[j])
				{
					k++;
				}
			}
			if (k == 0)
			{
				b[m] = a[i];
				m++;
			}
			k = 0;
		}
		System.out.printf("%d",b[0]);
		for (i = 1;i < m;i++)
		{
			System.out.printf(" %d",b[i]);
		}
	}
}

