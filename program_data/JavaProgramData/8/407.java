package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[100];
	public static int[] b = new int[50];
	public static void read(int[] a, int[] b)
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b[0] = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= a[0];i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i <= b[0];i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}
	}
	public static void change(int c, int[] x)
	{
		int i;
		int j;
		int k;
		int l;
		for (i = 1;i <= c;i++)
		{
			k = x[i];
			l = i;
			for (j = i + 1;j <= c;j++)
			{
				if (x[j] < k)
				{
					k = x[j];
					l = j;
				}
			}
			j = x[i];
			x[i] = k;
			x[l] = j;
		}
	}
	public static void one(int m, int n, int[] a, int[] b)
	{
		int i;
		for (i = 0;i < n;i++)
		{
			a[m + i + 1] = b[i + 1];
		}
	}
	public static void out(int m, int n, int[] x)
	{
		int i;
		for (i = 1;i < m + n;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d\n",a[m + n]);
	}
	public static int Main()
	{

		read(a, b);
		change(a[0], a);
		change(b[0], b);
		one(a[0], b[0], a, b);
		out(a[0], b[0], a);
	}
}

