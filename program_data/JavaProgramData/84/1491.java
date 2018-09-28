package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int max1;
		int max2;
		int n;
		int num;
		int i = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i <= n)
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
			if (i == 2)
			{
				if (max1 > num)
				{
					max1 = max1;
					max2 = num;
				}
				else
				{
					max2 = max1;
					max1 = num;
				}
			}
			else
			{
					if ((max2 > num))
					{
					 max1 = max1;
					max2 = max2;
					}
					if ((max2 <= num) && (max1 >= num))
					{
					max1 = max1;
					max2 = num;
					}
					if (max1 <= num)
					{
						max2 = max1;
						max1 = num;

					}
			}
			i++;
		}
		System.out.printf("%d\n",max1);
		System.out.printf("%d\n",max2);
	return 0;
	}

}

