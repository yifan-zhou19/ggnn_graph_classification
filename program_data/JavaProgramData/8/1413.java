package <missing>;

public class GlobalMembers
{
	public static void px(int[] a, int k)
	{
		int i;
		int j;
		int b;
		for (i = 0;i < k;i++)
		{
			for (j = 0;j < k - i - 1;j++)
			{
				if (a[j] > a[j + 1])
				{
					b = a[j];
					a[j] = a[j + 1];
					a[j + 1] = b;
				}
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d",a[k - 1]);
	}
	public static void fz()
	{
		int m;
		int n;
		int i;
		int[] a = new int[100];
		int[] b = new int[100];
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
		px(a, n);
		System.out.print(" ");
		for (i = 0;i < m;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}
		px(b, m);
	}
	public static int Main()
	{
		fz();
		return 0;
	}
}

