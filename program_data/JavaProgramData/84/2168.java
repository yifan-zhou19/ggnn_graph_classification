package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int max1;
		int max2;
		int num;
		int i = 1;
		while (i <= 10)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		if (i == 1)
		{
		  max1 = num;
		}
		else if (i == 2)
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
		 else
		 {
		 if (num > max1)
		 {
		 max2 = max1;
		 max1 = num;
		 }
	else if (num > max2 && num < max1)
	{
	max2 = num;
	}
		 }
	i++;
		}
	System.out.printf("%d\n%d\n",max1,max2);
	return 0;
	}

}

