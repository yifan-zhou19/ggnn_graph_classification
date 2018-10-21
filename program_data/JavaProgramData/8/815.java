package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int i;
	public static int j;
	public static int temp;
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int[] c = new int[200];
	public static void Read()
	{
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

		for (i = 1;i <= m;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}
	}
	public static void Order()
	{
		for (i = 1;i <= m;i++)
		{
			for (j = i + 1;j <= m;j++)
			{
				if (a[i] > a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = i + 1;j <= n;j++)
			{
				if (b[i] > b[j])
				{
					temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}
	}
	public static void Combine()
	{
		for (i = 1;i <= m;i++)
		{
			c[i] = a[i];
		}
		for (i = 1;i <= n;i++)
		{
			c[i + m] = b[i];
		}
	}
	public static void Write()
	{
		System.out.printf("%d",c[1]);
		for (i = 2;i <= m + n;i++)
		{
		System.out.printf(" %d",c[i]);
		}
	}
	public static int Main()
	{
		Read();
		Order();
		Combine();
		Write();
		return 0;
	}
}

