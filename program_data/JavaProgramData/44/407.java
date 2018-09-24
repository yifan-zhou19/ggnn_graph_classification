package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
			int i;
			int x;
			int r;
			int a = 1;
			r = 0;
			if (num < 0)
			{
				num = -num;
				a = -1;
			}
			for (i = 1;i < 12;i++)
			{
				if (num < Math.pow(10,i))
				{
					x = i;
					break;
				}
			}
			for (i = 0;i < x;i++)
			{
				if (i == 0)
				{
					r += num % 10 * (int)(Math.pow(10,x - 1));
				}
				else
				{
					r += (num % (int)(Math.pow(10,i + 1)) - num % (int)(Math.pow(10,i))) / (int)(Math.pow(10,i)) * (int)(Math.pow(10,x - i - 1));
				}
			}
			r = a * r;
			return r;
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
			System.out.printf("%d\n",reverse(n));
		}
		return 0;
	}
}

