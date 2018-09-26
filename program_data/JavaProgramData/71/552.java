package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int year;
		int m1;
		int m2;
		int[] day = new int[13];
		int sum;
		int run = int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		day[1] = 31;
		day[3] = 31;
		day[5] = 31;
		day[7] = 31;
		day[8] = 31;
		day[10] = 31;
		day[12] = 31;
		day[4] = 30;
		day[6] = 30;
		day[9] = 30;
		day[11] = 30;
		for (i = 1;i <= n;i++)
		{
						  String tempVar2 = ConsoleInput.scanfRead();
						  if (tempVar2 != null)
						  {
							  year = Integer.parseInt(tempVar2);
						  }
						  String tempVar3 = ConsoleInput.scanfRead(" ");
						  if (tempVar3 != null)
						  {
							  m1 = Integer.parseInt(tempVar3);
						  }
						  String tempVar4 = ConsoleInput.scanfRead(" ");
						  if (tempVar4 != null)
						  {
							  m2 = Integer.parseInt(tempVar4);
						  }
						  if (run(year) == 1)
						  {
							 day[2] = 29;
						  }
							 else
							 {
							 day[2] = 28;
							 }
						  sum = 0;
						  if (m1 > m2)
						  {
									j = m1;
									m1 = m2;
									m2 = j;
						  }
						  for (j = m1;j <= m2 - 1;j++)
						  {
							  sum = sum + day[j];
						  }
						  if (sum % 7 == 0)
						  {
							 System.out.print("YES\n");
						  }
							 else
							 {
							 System.out.print("NO\n");
							 }
		}

	}
	public static int run(int x)
	{
		if (x % 4 != 0)
		{
		   return 0;
		}
		   else
		   {
		   if (x % 100 != 0)
		   {
			  return 1;
		   }
			  else
			  {
			  if (x % 400 == 0)
			  {
				 return 1;
			  }
				 else
				 {
					 return 0;
				 }
			  }
		   }
	}

}

