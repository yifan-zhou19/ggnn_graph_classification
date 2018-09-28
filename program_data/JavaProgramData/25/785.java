package <missing>;

public class GlobalMembers
{
	public static int[] x = new int[10000];
	public static int b = 1;
	public static void f(int a,int n)
	{
		int i;
		if (n == 1)
		{
			;
		}
		else
		{
		for (i = 0;i < a;i++)
		{
			x[i] = x[i] * 2;
		}
		for (i = 0;i < a;i++)
		{
			if (i < a - 1)
			{
			if (x[i] >= 10)
			{
				x[i] -= 10;
				x[i + 1] += 1;
			}
			}
			else
			{
				if (x[i] < 10)
				{
					f(a, n - 1);
				}
				else
				{
					x[i + 1] = 1;
				x[i] -= 10;
				b++;
				f(a + 1, n - 1);
				}
			}
		}
		}

	}
	public static int Main()
	{
		int i;
		int j;
		int n;
		int a;
		int q;
		int m;
		int g;
		int k;
		int h;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 0)
		{
			System.out.print("1");
		}
		else
		{
		x[0] = 2;
		f(1, n);
		for (i = b - 1;i >= 0;i--)
		{
			System.out.printf("%d",x[i]);
		}
		}

	}

}

