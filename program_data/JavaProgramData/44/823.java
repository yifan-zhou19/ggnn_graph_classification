package <missing>;

public class GlobalMembers
{
	public static int inverse(int a)
	{
		int i = 0;
		int b = 0;
		int c = 0;
		do
		{
			if (a < 0)
			{
				c = 1;
				a = Math.abs(a);
			}
			b = b * 10 + a % 10;
			a /= 10;
			i++;
		} while (a > 0);
		if (c == 1)
		{
			b = -b;
		}
		return b;
	}
	public static void Main()
	{
		int i;
		int num;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				num = Integer.parseInt(tempVar);
			}
			System.out.printf("%d\n",inverse(num));
		}
	}

}

