package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i = 0;
		  int j = 0;
		  int h = 0;
		  int p;
		  int q;
		  int m;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  final String string = "male";
		  char[][] sex = new char[n][6];
		  float[] height = new float[n];
		  float[] male = new float[n];
		  float[] female = new float[n];
		  float change;
		  while (i < n)
		  {
					 String tempVar2 = ConsoleInput.scanfRead();
					 if (tempVar2 != null)
					 {
						 sex[i] = tempVar2.charAt(0);
					 }
					 String tempVar3 = ConsoleInput.scanfRead(" ");
					 if (tempVar3 != null)
					 {
						 height[i] = Float.parseFloat(tempVar3);
					 }
					 i++;
		  }
		  for (i = 0;i < n;i++)
		  {
						   if (strcmp(sex[i],String) == 0)
						   {
														male[j] = height[i];
														j++;
						   }
						   else
						   {
								female[h] = height[i];
								h++;
						   }
		  }
		  for (p = 0;p <= j;p++)
		  {
						   m = j - 1;
						   while (m > 0)
						   {
									  if (male[m] <= male[m - 1])
									  {
															 change = male[m];
															 male[m] = male[m - 1];
															 male[m - 1] = change;
									  }
									   m = m - 1;
						   }
		  }
		  for (p = 0;p <= h;p++)
		  {
						   m = h - 1;
						   while (m > 0)
						   {
									  if (female[m] <= female[m - 1])
									  {
																 change = female[m];
																 female[m] = female[m - 1];
																 female[m - 1] = change;
									  }
									   m = m - 1;
						   }
		  }
		  for (p = 0;p < j;p++)
		  {
						   System.out.printf("%.2f ",male[p]);
		  }
		  for (p = h - 1;p > 0;p--)
		  {
							 System.out.printf("%.2f ",female[p]);
		  }
		  System.out.printf("%.2f",female[0]);
	}

}

