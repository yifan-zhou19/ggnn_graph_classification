package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			 int breaktime; //????
			 int j;
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 breaktime = Integer.parseInt(tempVar2);
			 }
			 int[] n = new int[breaktime]; //l???
			 int k = 0;
			 int l = 0;
			 if (breaktime == 0)
			 {
				 System.out.print("60\n");
			 }
			 else
			 {
				 for (j = 1;j <= breaktime;j++)
				 {
					   String tempVar3 = ConsoleInput.scanfRead();
					   if (tempVar3 != null)
					   {
						   n[j] = Integer.parseInt(tempVar3);
					   }
					   if (3 * j + n[j] <= 60)
					   {
						   k = k + 1;
					   }
					   else if (3 * j + n[j] >= 63)
					   {
						   k = k;
					   }
					   else if (3 * j + n[j] == 61)
					   {
							k = k + 1;
							l = 1;
					   }
					   else if (3 * j + n[j] == 62)
					   {
							k = k + 1;
							l = 2;
					   }
				 }
				 int total;
				 total = 60 - 3 * k + l;
				 System.out.printf("%d\n",total);
			 }
		}
		return 0;
	}


}

