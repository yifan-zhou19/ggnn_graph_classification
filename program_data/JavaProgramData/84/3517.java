package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int num;
		int max1;
		int max2;
		int exc;
		i = 1;
		max1 = 0;
		max2 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num = Integer.parseInt(tempVar2);
			}
			if (i == 1)
			{
				max1 = num;
			}
			else if (i == 2)
			{
				if (max1 >= num)
				{
					max2 = num;
				}
				else if (num > max1)
				{
					exc = max1;
					max2 = exc;
					max1 = num;
				}
			}
			else if (i >= 3)
			{
				if (num > max1)
				{
					exc = max1;
					max2 = exc;
					max1 = num;
				}
				else if (num > max2)
				{
					max2 = num;
				}
			}
		}
			System.out.printf("%d\n%d\n",max1,max2);
			return 0;
	}


}

