package <missing>;

public class GlobalMembers
{
	public static void bubble(int[] a, int l)
	{
		int i;
		int j;
		int temp;
		for (j = 1;j < l;j++)
		{
			for (i = 0;i < l - j;i++)
			{
				if (a[i] > a[i + 1])
				{
					temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
				}
			}
		}
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[] a = new int[10000];
		int[] b = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (j = 0;j < n;j++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[j] = Integer.parseInt(tempVar4);
			}
		}
		bubble(a, m);
		bubble(b, n);
		for (i = 0;i < m;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		for (j = 0;j < n;j++)
		{
			System.out.printf("%d",b[j]);
			if (j < n - 1)
			{
				System.out.print(" ");
			}
		}

		return 0;
	}

}

