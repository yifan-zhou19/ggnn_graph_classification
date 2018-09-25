package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1000];
	public static int[] b = new int[1000];
	public static int[] c = new int[2000];
	public static int M;
	public static int N;
	public static void x()
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			M = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			N = Integer.parseInt(tempVar2);
		}
		for (i = 0;i <= M - 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i <= N - 1;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}
	}
	public static void y()
	{
		int i;
		int j;
		int m;
		for (i = 1;i <= M - 1;i++)
		{

			for (j = 0;j <= i - 1;j++)
			{
				if (a[i] < a[j])
				{
					m = a[i];
					a[i] = a[j];
					a[j] = m;
				}
			}
		}
		for (i = 1;i <= N - 1;i++)
		{

			for (j = 0;j <= i - 1;j++)
			{
				if (b[i] < b[j])
				{
					m = b[i];
					b[i] = b[j];
					b[j] = m;
				}
			}
		}
	}
	public static void z()
	{
		int i;
		for (i = 0;i <= M - 1;i++)
		{
			c[i] = a[i];
		}
		for (i = 0;i <= N - 1;i++)
		{
			c[i + M] = b[i];
		}
	}
	public static void u()
	{
		int i;
		for (i = 0;i <= M + N - 2;i++)
		{
			System.out.printf("%d ",c[i]);
		}
		System.out.printf("%d",c[M + N - 1]);
	}
	public static int Main()
	{
		x();
		y();
		z();
		u();
		return 0;
	}
}

