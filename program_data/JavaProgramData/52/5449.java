package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int m = 0;
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
		int[] a = new int[200];
		for (int i = 1;i <= n;i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i] = Integer.parseInt(tempVar3);
		}
		}
		for (int j = n;j >= 1;j--)
		{
		a[j + m] = a[j];
		}
		for (int b = 1;b <= m;b++)
		{
		a[b] = a[n + b];
		}
		for (int c = 1;c <= n;c++)
		{
			if (c != n)
			{
			System.out.printf("%d ",a[c]);
			}
			else
			{
			System.out.printf("%d",a[n]);
			}
		}
		return 0;
	}
}

