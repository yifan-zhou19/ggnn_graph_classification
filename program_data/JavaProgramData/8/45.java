package <missing>;

public class GlobalMembers
{
	public static int n1;
	public static int n2;
	public static int[] a = new int[1000];
	public static int[] b = new int[100];
	public static void Main()
	{
		void A();
		void B();
		void c();
		void d();
		A();
		B();
		c();
		d();
	}



	public static void A()
	{
		int i;
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
		for (i = 0;i < n1;i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i] = Integer.parseInt(tempVar3);
		}
		}
		for (i = 0;i < n2;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}
	}
	public static void B()
	{
		int z;
		int i;
		int j;
		for (j = n1;j > 1;j--)
		{
			for (i = 0;i < j - 1;i++)
			{
				if (a[i] > a[i + 1])
				{
					z = a[i];
					a[i] = a[i + 1];
					a[i + 1] = z;
				}
			}
		}
		for (j = n2;j > 1;j--)
		{
			for (i = 0;i < j - 1;i++)
			{
				if (b[i] > b[i + 1])
				{
					z = b[i];
					b[i] = b[i + 1];
					b[i + 1] = z;
				}
			}
		}
	}
	public static void c()
	{
		int i;
		for (i = 0;i < n2;i++)
		{
			a[i + n1] = b[i];
		}
	}
	public static void d()
	{
		int i;
			for (i = 0;i < n1 + n2 - 1;i++)
			{
		System.out.printf("%d ",a[i]);
			}
			System.out.printf("%d",a[n1 + n2 - 1]);
	}




}

