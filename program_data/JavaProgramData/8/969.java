package <missing>;

public class GlobalMembers
{
	public static int scan()
	{
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		return m;
	}
	public static int fuzhi(int[] a, int n)
	{
		int i;
		int k;
		for (i = 0;i < n;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				k = Integer.parseInt(tempVar);
			}
			a[i] = k;
		}
		return 0;
	}
	public static int paixu(int[] b, int n)
	{
		int i;
		int j;
		int temp;
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (b[j] > b[j + 1])
				{
					temp = b[j];
					b[j] = b[j + 1];
					b[j + 1] = temp;
				}
			}
		}
		return 0;
	}
	public static int print(int[] c, int[] d, int m3, int m4)
	{
		int i = 0;
		for (i = 0;i < m3;i++)
		{
			System.out.printf("%d ",c[i]);
		}
		for (i = 0;i < m4;i++)
		{
			System.out.printf("%d",d[i]);
			if (i != m4 - 1)
			{
				System.out.print(" ");
			}
		}
		return 0;
	}



	public static int Main()
	{
		int m1;
		int m2;
		int[] x = new int[100];
		int[] y = new int[100];
		m1 = scan();
		m2 = scan();
		fuzhi(x, m1);
		fuzhi(y, m2);
		paixu(x, m1);
		paixu(y, m2);
		print(x, y, m1, m2);
		return 0;
	}

}

