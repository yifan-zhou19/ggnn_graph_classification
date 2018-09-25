package <missing>;

public class GlobalMembers
{
	public static int A;
	public static int B;
	public static int[] a = new int[300];
	public static int[] b = new int[300];
	public static int[] c = new int[600];
	public static void w()
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			A = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			B = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < A;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < B;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}
	}
	public static void x()
	{
		int i;
		int j;
		int t;
		for (i = 0;i < A - 1;i++)
		{
			for (j = 0;j < A - 1 - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
		 for (i = 0;i < B - 1;i++)
		 {
			for (j = 0;j < B - 1 - i;j++)
			{
				if (b[j] > b[j + 1])
				{
					t = b[j];
					b[j] = b[j + 1];
					b[j + 1] = t;
				}
			}
		 }
	}
	public static void y()
	{
		int i;
		for (i = 0;i < A + B;i++)
		{
			if (i < A)
			{
				c[i] = a[i];
			}
			else
			{
				c[i] = b[i - A];
			}
		}
	}
	public static void z()
	{
		int i;
		for (i = 0;i < A + B - 1;i++)
		{
			System.out.printf("%d ",c[i]);
		}
		System.out.printf("%d",c[A + B - 1]);
	}
	public static void Main()
	{
		w();
		x();
		y();
		z();
	}


}

