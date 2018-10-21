package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int count;
		int i;
		int count_max;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		count = 0;
		count_max = 0;
		for (i = 1;i <= n;i = i + 1)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   b = Integer.parseInt(tempVar3);
		   }
		   if (a >= 90 && a <= 140 && b >= 60 && b <= 90)
		   {
			   count = count + 1;
		   }
		   else
		   {
				   if (count_max < count)
				   {
						 count_max = count;
				   }
				   count = 0;
		   }
		   if (count > count_max)
		   {
			   count_max = count;
		   }
		}
			  System.out.printf("%d",count_max);
		 return 0;
	}
}

