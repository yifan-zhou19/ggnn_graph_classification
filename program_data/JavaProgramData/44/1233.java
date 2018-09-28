package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int a = 0;
		int b = 0;
		int c = 0;
		if (num == 0)
		{
			c = num;
		}
		else if (num < 0)
		{
			 a = -num;
			 do
			 {
				 b = a % 10;
			 c = (c + b) * 10;
			 a = a / 10;
			 } while (a > 9);
			 c = -c - a;
		}
		else
		{
			 a = num;
			 do
			 {
				 b = a % 10;
			 c = (c + b) * 10;
			 a = a / 10;
			 } while (a > 9);
			 c = c + a;
		}
		return c;
	}
	public static int Main()
	{
		int m;
		int i;
		for (i = 1;i <= 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				m = Integer.parseInt(tempVar);
			}
		System.out.printf("%d\n",reverse(m));
		}
		return 0;
	}
}

