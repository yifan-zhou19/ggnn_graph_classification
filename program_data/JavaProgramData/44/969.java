package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int n = 0;
		int m = 0;
		int i;
		int s;
		int l = 1;
		int x = 1;
		s = num;
		do
		{
			s = s / 10;
			n = n + 1;
			l = 10 * l;
		}while (s > 0);
		for (i = 1;i <= n;i++)
		{
			m = num / (l / 10) * x + m;
			num = num - num / (l / 10) * (l / 10);
			x = x * 10;
			l = l / 10;
		}
		return (m);
	}
	public static void Main()
	{
		int[] a = new int[6];
		int j;
		for (j = 0;j < 6;j++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[j] = Integer.parseInt(tempVar);
			}
		}
		for (j = 0;j < 6;j++)
		{
			if (a[j] != 0)
			{
				while (a[j] % 10 == 0)
				{
					a[j] = a[j] / 10;
				}
				if (a[j] > 0)
				{
					System.out.printf("%d\n",reverse(a[j]));
				}
				else
				{
					System.out.printf("%d\n",-reverse(-a[j]));
				}
			}
			if (a[j] == 0)
			{
				System.out.print("0\n");
			}
		}
	}
}

