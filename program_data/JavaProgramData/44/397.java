package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	void reverse(int num);

	for (i = 0;i < 6;i++)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		reverse(n);
	}

	return 0;
	}
	public static void reverse(int num)
	{
		int i;
		int result;
		int k;

		if (num < 0)
		{
			System.out.print("-");
			num = num * -1;
			k = 0;
				while (num / 10 != 0)
				{
					if (num % 10 != 0)
					{
						k = 1;
					}
					if (k != 0)
					{
					System.out.printf("%d",num % 10);
					}
					num = num / 10;
				}
				if (num < 10 && num>0)
				{
					System.out.printf("%d\n",num);
				}
		}
		else if (num > 0)
		{
		   k = 0;
			while (num / 10 != 0)
			{
				if (num % 10 != 0)
				{
						k = 1;
				}
					if (k != 0)
					{
					System.out.printf("%d",num % 10);

					}
					num = num / 10;
			}
			if (num < 10 && num>0)
			{
					System.out.printf("%d\n",num);
			}

		}
		else if (num == 0)
		{
			System.out.print("0");
		}

	}

}

