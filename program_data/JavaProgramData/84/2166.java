package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int max1;
	   int max2;
	   int num;
	   int i = 1;
	   int n;
	   int c;
	   int d;
	   int exc;
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
				   else if (i == 2)
				   {
					   max2 = num;
				   if (max1 < max2)
				   {
					   c = max1;
					   max1 = max2;
					   max2 = c;
				   }
				   }
				   else
				   {
					   if (max1 < num)
					   {
						   d = max1;
						   max1 = num;
						   num = d;
					   }
				   max2 = max2 > num != 0?max2:num;
				   }
				   i++;
	   }
	System.out.printf("%d\n%d\n",max1,max2);
	return 0;
	}
}

