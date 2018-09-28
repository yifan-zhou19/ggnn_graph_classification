package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int[] a = new int[800];
	public static int[] b = new int[800];
	public static void Main()
	{
		void f1();
		void f2();
		void f3();
		void f4();
		f1();
		f2();
		f3();
		f4();
	}
	public static void f1()
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
	}
	public static void f2()
	{
		int i;
		for (i = 0;i < m;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
		}
	}
	public static void f3()
	{
		int i;
		int j;
		int temp;
		for (i = 0;i < m;i++)
		{
			for (j = i + 1;j < m;j++)
			{
				if (a[j] < a[i])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (b[j] < b[i])
				{
					temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}
	}
	public static void f4()
	{
		int i;
		int j;
		for (i = 0;i < m;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		for (j = 0;j < n - 1;j++)
		{
			System.out.printf("%d ",b[j]);
		}
		System.out.printf("%d",b[n - 1]);
	}

}

