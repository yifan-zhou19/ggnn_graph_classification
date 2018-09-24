package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int lj = new int(int a[],int n,int m);
		int n;
		int m;
		int i;
		int j;
		int l;
		int k = 0;
		int s;
		int t = 0;
		int[] a = new int[25];
		int[] b = new int[25];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < k;i++)
		{
			b[i] = lj(a, i, k);
		}
		for (i = 0;i < k;i++)
		{
				if (t < b[i])
				{
					t = b[i];
				}
		}
		System.out.printf("%d",t);
		System.in.read();
		System.in.read();
		System.in.read();
	}
	public static int lj(int[] a, int n, int m) //n????m???
	{
		int i;
		int t;
		int p;
		int l = 0;
		int[] b = new int[25];
		if (n == m - 1)
		{
		return 1;
		}
		else
		{
		for (i = 0;i < 25;i++)
		{
			b[i] = 0;
		}
		for (i = n + 1;i < m;i++)
		{
				if (a[i] <= a[n])
				{
							  b[i] = lj(a, i, m);
				}
		}
		t = b[n + 1];
		for (i = n + 1;i < m;i++)
		{
				if (t < b[i])
				{
				t = b[i];
				}
		}
		return t + 1;
		}
	}

}

