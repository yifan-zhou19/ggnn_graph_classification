package <missing>;

public class GlobalMembers
{
	public static int[] b = new int[100];
	public static int[] c = new int[100];
	public static int d;
	public static int e;
	public static int[] f = new int[200];
	public static int du()
	{
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		return x;
	}
	public static int paib()
	{
		int j;
		int k;
		int r;
		for (j = 0;j < d - 1;j++)
		{
			for (k = j + 1;k < d;k++)
			{
				if (b[k] < b[j])
				{
					r = b[k];
					b[k] = b[j];
					b[j] = r;
				}
			}
		}
		return 0;
	}
	public static int paic()
	{
		int j;
		int k;
		int r;
		for (j = 0;j < e-1;j++)
		{
			for (k = j + 1;k < e;k++)
			{
				if (c[k] < c[j])
				{
					r = c[k];
					c[k] = c[j];
					c[j] = r;
				}
			}
		}
		return 0;
	}
	public static int add()
	{
		int i;
		for (i = 0;i < d;i++)
		{
			f[i] = b[i];
		}
		for (i = 0;i < e;i++)
		{
			f[i + d] = c[i];
		}
		return 0;
	}
	public static int show()
	{
		int i;
		for (i = 0;i < d + e-1;i++)
		{
			System.out.printf("%d ",f[i]);
		}
		System.out.printf("%d",f[d + e-1]);
		return 0;
	}
	public static int Main()
	{
		int i;
		d = du();
		e = du();
		for (i = 0;i < d;i++)
		{
			b[i] = du();
		}
		for (i = 0;i < e;i++)
		{
			c[i] = du();
		}
		paib();
		paic();
		add();
		show();
		return 0;
	}

}

