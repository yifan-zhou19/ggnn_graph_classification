package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int i;
		int b;
		int k;
		int a = 1000;
		int x = 0;
		for (i = 10;a > 0;i = 10 * i,x++)
		{
			a = num / i;
		}
		if (x == 1)
		{
			k = num;
		}
		else
		{
			k = (num % 10);
			for (b = 1;b < x;b++)
			{
				k = k * 10;
			}
			k += reverse(num / 10);
		}
		return k;
	}
	public static int Main()
	{
		int[] u = new int[10];
		int j;
		for (j = 0;j < 6;j++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				u[j] = Integer.parseInt(tempVar);
			}
		}
		for (j = 0;j < 6;j++)
		{
			if (u[j] == 0)
			{
				System.out.printf("%d\n",0);
			}
			if (u[j] > 0)
			{
				System.out.printf("%d\n",reverse(u[j]));
			}
			if (u[j] < 0)
			{
				System.out.printf("%d\n",-reverse(-u[j]));
			}
		}
		return 0;
	}

}

