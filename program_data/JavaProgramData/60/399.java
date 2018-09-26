package <missing>;

public class GlobalMembers
{
	public static int judge(int n)
	{
		int i;
		int flag;
		for (i = 2;i < n;i++)
		{
			if (n % i == 0)
			{
				flag = 0;
				break;
			}
			else
			{
				flag = 1;
			}
		}
		return flag;
	}

	public static void Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		if (n < 5)
		{
			System.out.print("empty");
		}
		else
		{
			for (i = 3;i + 2 <= n;i++)
			{
				if (judge(i) != 0)
				{
					if (judge(i + 2) != 0)
					{
						System.out.printf("%d %d\n",i,i + 2);
					}

				}

			}
		}
	}


}

