package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int i;
		int j;
		int n;
		int m;
		int t;
		int k;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
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
		for (j = 0;j < n - m;j++)
		{
			b[j] = a[j];
		}
		for (t = 0;t < m;t++)
		{
			a[t] = a[n - m + t];
		}
		for (k = 0;k < n - m;k++)
		{
			a[m + k] = b[k];
		}
		for (c = 0;c < n;c++)
		{
			System.out.printf("%d",a[c]);
			if (c == n - 1)
			{
				break;
			}
			else
			{
			System.out.print(" ");
			}
		}
		return 0;
	}
}

