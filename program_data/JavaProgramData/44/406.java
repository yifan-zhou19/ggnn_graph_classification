package <missing>;

public class GlobalMembers
{
	public static int reverse(int u)
	{
		int[] a = new int[33];
		int j;
		int k;
		int x = 0;
		for (j = 0;u > 0;j++)
		{
			a[j] = u % 10;

			u = u / 10;
		}
		for (k = 0;k < j;k++)
		{

			x = x * 10 + a[k];
		}
		return x;
	}


	public static int Main()
	{
		int n;
		int b;
		int i;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (i != 0)
			{
				System.out.print("\n");
			}
			if (n < 0)
			{
				System.out.print("-");
				n = -n;
			}
			b = reverse(n);
			System.out.printf("%d",b);
		}
		return 0;
	}

}

