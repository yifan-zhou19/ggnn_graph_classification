package <missing>;

public class GlobalMembers
{
	public static int op(int x)
	{
		int y = 0;
		int[] a = new int[10];
		int i;
		int j;
		for (i = 0;x != 0;i++)
		{
			a[i] = x % 10;
			x = x / 10;
		}
		for (j = 0;j < i;j++)
		{
			y = y + a[j];
			if (j != i - 1)
			{
				y = y * 10;
			}
		}
		return y;
	}
	public static int Main()
	{
		int k;
		int n;
		for (k = 0;k < 6;k++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n < 0)
			{
				n = 0 - n;
				System.out.printf("-%d",op(n));
			}
			else if (n == 0)
			{
				System.out.print("0");
			}
			else
			{
				System.out.printf("%d",op(n));
			}
			System.out.print("\n");
		}
	}

}

