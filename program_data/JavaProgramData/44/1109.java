package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int reverse = int num;
		int i;
		int num;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				num = Integer.parseInt(tempVar);
			}
			System.out.printf("%d\n",reverse(num));
		}
	}
	public static int reverse(int num)
	{
		int a;
		int b;
		int r;
		int j;
		if (num >= 0)
		{
			b = num;
			r = 0;
			for (j = 0;j < 32;j++)
			{
				a = b % 10;
				b = b / 10;
				r = r * 10 + a;
				if (b == 0)
				{
					break;
				}
			}
		}
		else
		{
			b = -num;
			r = 0;
			for (j = 0;j < 32;j++)
			{
				a = b % 10;
				b = b / 10;
				r = r * 10 + a;
				if (b == 0)
				{
					break;
				}
			}
			r = -r;
		}
		return r;
	}
}

