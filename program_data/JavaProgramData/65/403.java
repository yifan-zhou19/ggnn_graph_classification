package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int a = 0;
		int b = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] fight = new int[n][2];
		for (i = 0;i < n;i++)
		{
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   fight[i][0] = Integer.parseInt(tempVar2);
	   }
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   fight[i][1] = Integer.parseInt(tempVar3);
	   }
		}
	   for (i = 0;i < n;i++)
	   {
			   if (fight[i][0] == fight[i][1])
			   {
				   ;
			   }
			   else
			   {
					if (fight[i][0] == 1)
					{
									  if (fight[i][1] == 2)
									  {
										  a++;
									  }
									  else
									  {
										  b++;
									  }
					}
				  if (fight[i][0] == 0)
				  {
									if (fight[i][1] == 1)
									{
										a++;
									}
									else
									{
										b++;
									}
				  }
			   if (fight[i][0] == 2)
			   {
								 if (fight[i][1] == 0)
								 {
									 a++;
								 }
								 else
								 {
									 b++;
								 }
			   }

			   }
	   }
		   if (a > b)
		   {
			   System.out.print("A\n");
		   }
		   if (a < b)
		   {
			   System.out.print("B\n");
		   }
		   if (a == b)
		   {
			   System.out.print("Tie\n");
		   }



	}

}

