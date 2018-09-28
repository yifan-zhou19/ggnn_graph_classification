package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[110];
		int[] b = new int[110];
		int i;
		int n;
		int m;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		j = m;
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		i = 0;
		while (j > 0)
		{
		   b[i] = a[n - j];
		   j--;
		   i++;
		}
		while (j <= 0 && i < n)
		{
			b[i] = a[i - m];
			j--;
			i++;
		}
		for (i = 0;i < n - 1;i++)
		{
		   System.out.printf("%d ",b[i]);
		}
		System.out.printf("%d",b[n - 1]);
		return 0;
	}

}

