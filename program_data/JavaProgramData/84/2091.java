package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		int max1;
		int max2;
		int n;
		int a;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			num = Integer.parseInt(tempVar2);
		}
		max1 = num;
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		num = Integer.parseInt(tempVar3);
	}
			if (num > max1)
			{
			 a = max1;
			 max1 = num;
			 max2 = a;
			}
			else
			{
				max2 = num;
			}
		   for (i = 0;i < n - 2;i++)
		   {
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				num = Integer.parseInt(tempVar4);
			}
			if (num > max1)
			{
			 a = max1;
			 max1 = num;
			 max2 = a;
			}
		else if (num > max2)
		{
			max2 = num;
		}
		   }
		System.out.printf("%d\n%d\n",max1,max2);
		return 0;
	}
}

