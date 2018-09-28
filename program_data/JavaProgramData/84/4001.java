package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int max1;
	int max2;
	int num;
	int n;
	int i = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			num = Integer.parseInt(tempVar2);
		}
	if (i == 0)
	{
		max1 = num;
	}
			else if (i == 1)
			{
			if (num > max1)
			{
				max2 = max1;
			max1 = num;
			}
			else
			{
				max2 = num;
			}
			}
			else if (i > 1)
			{
				if (num > max1)
				{
					max2 = max1;
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

