package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int t;
		int j;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int[] a;
		int[] b;
		a = new int[m];
		b = new int[m];
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < m;i++)
		{
			b[i] = 0;
			for (j = 0;j < i;j++)
			{
				if (a[j] >= a[i])
				{
				   if (b[j] > b[i])
				   {
					   b[i] = b[j];
				   }
				}
			}
			b[i] = b[i] + 1;
		}
		t = 0;
		for (i = 0;i < m;i++)
		{
			if (b[i] > t)
			{
				t = b[i];
			}
		}
		System.out.printf("%d\n",t);
	}
}

