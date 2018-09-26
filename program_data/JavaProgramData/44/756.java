package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int m;
		int b = 0;
		int temp = 0;
		if (num == 0 || num == -0)
		{
			m = 0;
		}
		else
		{
			if (num < 0)
			{
				num = -num;
				temp = 1;
			}
			while (num % 10 == 0)
			{
				num = num / 10;
			}
			while (num != 0)
			{

				b = b * 10 + num % 10;
				num = num / 10;
			}
			if (temp == 0)
			{
				m = b;
			}
			else
			{
				m = -b;
			}
		}
			return (m);
	}

	public static void Main()
	{
		int n;
		int i;
		for (i = 1;i <= 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			System.out.printf("%d\n",reverse(n));
		}
	}
}

