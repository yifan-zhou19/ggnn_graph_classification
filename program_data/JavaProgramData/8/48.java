package <missing>;

public class GlobalMembers
{
	public static void f1(int[] a, int[] b, int c, int d)
	{
		int i;
		int j;
		int t;
		for (i = 0;i < c;i++)
		{
			for (j = 0;j < c - i - 1;j++)
			{
				if (a[j] > a[j + 1])
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
		for (i = 0;i < d;i++)
		{
			for (j = 0;j < d - i - 1;j++)
			{
				if (b[j] > b[j + 1])
				{
					t = b[j];
					b[j] = b[j + 1];
					b[j + 1] = t;
				}
			}
		}
		System.out.printf("%d",a[0]);
		for (i = 1;i < c;i++)
		{
			System.out.printf(" %d",a[i]);
		}
		for (i = 0;i < d;i++)
		{
			System.out.printf(" %d",b[i]);
		}
	}



	public static void Main()
	{
		int[] a = new int[15];
		int[] b = new int[15];
		int c;
		int d;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			d = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < c;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < d;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}
		f1(a, b, c, d);
	}










}

