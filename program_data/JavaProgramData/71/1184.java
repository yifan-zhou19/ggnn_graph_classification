package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] y =
		{
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
		};
		int n;
		int i;
		int j;
		int temp;
		int[] year = new int[200];
		int[] mon1 = new int[200];
		int[] mon2 = new int[200];
		int total;
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
				   year[i] = Integer.parseInt(tempVar2);
			   }
			   String tempVar3 = ConsoleInput.scanfRead(" ");
			   if (tempVar3 != null)
			   {
				   mon1[i] = Integer.parseInt(tempVar3);
			   }
			   String tempVar4 = ConsoleInput.scanfRead(" ");
			   if (tempVar4 != null)
			   {
				   mon2[i] = Integer.parseInt(tempVar4);
			   }
			}
			  for (i = 0;i < n;i++)
			  {
				 if ((year[i] % 4 == 0 && year[i] % 100 != 0) || (year[i] % 4 == 0 && year[i] % 400 == 0))
				 {
						  j = 1;
				 }
				 else
				 {
						  j = 0;
				 }
					if (mon1[i] > mon2[i])
					{
							   temp = mon1[i];
							   mon1[i] = mon2[i];
							   mon2[i] = temp;
					}
						   for (total = 0;mon1[i] < mon2[i];mon1[i]++)
						   {
							  total += y[j][mon1[i] - 1];
						   }
							  if (total % 7 == 0)
							  {
								  System.out.print("YES\n");
							  }
							  else
							  {
								  System.out.print("NO\n");
							  }

			  }
		return 0;
	}


}

