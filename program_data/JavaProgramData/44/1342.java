package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		int i;

	int reverse = new int(int num,int s);
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				num = Integer.parseInt(tempVar);
			}
			if (num < 0)
			{
				num = -num;
				System.out.printf("-%d\n",reverse(num, 0));
			}
			else
			{
				System.out.printf("%d\n",reverse(num, 0));
			}
		}
		return 0;
	}

	public static int reverse(int num,int s)
	{
		s = s * 10 + num % 10;
		if (num >= 10)
		{
			return reverse(num / 10, s);
		}
		else
		{
			return s;
		}
	}
}

