package <missing>;

public class GlobalMembers
{
	public static void f(int n1,int n2)
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int p;
		int q;
		int term = 0;
		for (i = 0;i < n1;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
		for (j = 0;j < n2;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[j] = Integer.parseInt(tempVar2);
			}
		}
		for (k = 0;k < n1;k++)
		{
			for (m = k + 1;m < n1;m++)
			{
				if (a[m] < a[k])
				{
					term = a[k];
					a[k] = a[m];
					a[m] = term;
				}
			}
		}
		for (n = 0;n < n2;n++)
		{
			for (l = n + 1;l < n2;l++)
			{
				if (b[l] < b[n])
				{
					term = b[n];
					b[n] = b[l];
					b[l] = term;
				}
			}
		}
		for (p = 0;p < n1;p++)
		{
			System.out.printf("%d ",a[p]);
		}
		for (q = 0;q < n2 - 1;q++)
		{
			System.out.printf("%d ",b[q]);
		}
		System.out.printf("%d",b[n2 - 1]);
	}
	public static int Main()
	{
		int n1;
		int n2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n2 = Integer.parseInt(tempVar2);
		}
		f(n1, n2);
		return 0;
	}



}

