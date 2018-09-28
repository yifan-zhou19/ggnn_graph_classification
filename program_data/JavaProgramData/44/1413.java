package <missing>;

public class GlobalMembers
{
	public static void reverse(int a)
	{
		if (a == 0)
		{
		System.out.print("0\n");
		}
		else
		{
			if (a < 0)
			{
				System.out.print("-");
				a = -a;
			}
			int i = 10000000;
			int j;
			int[] x = new int[100000];
			int t = 0;
			int y = 0;
			for (j = 0;i >= 1;j++)
			{
				x[j] = a / i;
				if (x[j] != 0 && y == 0)
				{
				y = j;
				}
				a = a - x[j] * i;
				i = i / 10;
			}
			j = j - 1;
			for (t = j;;t--)
			{
				if (x[t] != 0)
				{
				break;
				}
			}
			for (j = t;j >= y;j--)
			{
				System.out.printf("%d",x[j]);
			}
			System.out.print("\n");
		}
	}
	public static int Main()
	{
		int[] a = new int[6];
		int i;
		for (i = 0;i < 6;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = Integer.parseInt(tempVar);
		}
		}
		for (i = 0;i < 6;i++)
		{
		reverse(a[i]);
		}
	}

}

