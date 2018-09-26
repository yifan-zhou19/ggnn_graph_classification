package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int reverse = int num;
		int i;
		int num;
		int a;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				num = Integer.parseInt(tempVar);
			}
			a = reverse(num);
			System.out.printf("%d\n",a);
		}
		return 0;
	}
	public static int reverse(int num)
	{
		int z = 0;
		int a;
		int i;
		int j;
		if (num >= 0)
		{
			for (i = 0;i < 10;i++)
			{
				a = num % 10;
				num = num / 10;
				z = z * 10 + a;
				if (num == 0)
				{
					break;
				}
			}
		}
		else
		{
			num = -num;
			for (j = 0;j < 32;j++)
			{
				a = num % 10;
				num = num / 10;
				z = z * 10 + a;
				if (num == 0)
				{
					break;
				}
			}
			z = -z;
		}
		return z;
	}

}

