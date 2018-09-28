package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int num1;
		int a;
		num1 = Math.abs(num);
		int num2 = 0;
		while (num1 >= 10)
		{
			a = num1 % 10;
			num1 = num1 / 10;
			num2 = num2 * 10 + a;
		}
		a = num1 % 10;
		num2 = num2 * 10 + a;
		if (num == 0)
		{
			return 0;
		}
		else if (num > 0)
		{
			return num2;
		}
		else if (num < 0)
		{
			return 0 - num2;
		}
	}
	public static int Main()
	{
		int a;
		int k;
		for (k = 1;k <= 6;k++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = Integer.parseInt(tempVar);
			}
			a = reverse(a);
			System.out.printf("%d\n",a);
		}
		return 0;
	}
}

