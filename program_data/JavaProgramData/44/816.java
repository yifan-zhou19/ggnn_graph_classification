package <missing>;

public class GlobalMembers
{
	public static int reverse(int n)
	{
		int[] a = new int[10];
		int sum;
		int i;
		int j;
		i = 0;
		sum = 0;

		while (n > 0)
		{
			a[i] = n % 10;
			n = n / 10;
			i = i + 1;
		}

		for (j = 0;j <= i - 1;j++)
		{
			sum = sum + a[j] * Math.pow(10,i - 1 - j);
		}

		return sum;
	}



	public static int Main()
	{
		int i;
		int a;
		for (i = 1;i <= 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = Integer.parseInt(tempVar);
			}
			if (a < 0)
			{
				System.out.print("-");
				a = Math.abs(a);
				System.out.printf("%d\n",reverse(a));
			}
			else
			{
				System.out.printf("%d\n",reverse(a));
			}
		}

		return 0;
	}
}

