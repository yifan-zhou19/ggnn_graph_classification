package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int m;
		int n;
		int i;
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
		for (i = 0;i < n;i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i] = Integer.parseInt(tempVar3);
		}
		}
		for (j = 0,i = n - m;j <= m - 1;j++,i++)
		{
		b[j] = a[i];
		}
		for (j = 0;j < m;j++)
		{
			if (j == 0)
			{
			System.out.printf("%d",b[j]);
			}
			else
			{
			System.out.printf(" %d",b[j]);
			}
		}
		for (i = 0;i < n - m;i++)
		{
		System.out.printf(" %d",a[i]);
		}
		return 0;
	}


}

