package <missing>;

public class GlobalMembers
{
	public static double gc(int m)
	{
		   int v = 1;
		   int x = 60;
		   while (x < 101)
		   {
				 if (x <= m)
				 {
					 v++;
				 }
				 else
				 {
					 break;
				 }
				 if ((x <= 68) || (x == 78))
				 {
					 x += 4;
				 }
				   else
				   {
					   if ((x < 78) || (x == 82))
					   {
						   x += 3;
					   }
						else
						{
							if (x == 85)
							{
								x += 5;
							}
							else
							{
							   if (x == 90)
							   {
								   x = 100;
							   }
							else
							{
								x = 101;
							}
							}
						}
				   }

		   }

		   switch (v)
		   {
				  case 1:
					  return 0;
				  case 2:
					  return 1.0;
					  break;
				  case 3:
					  return 1.5;
					  break;
				  case 4:
					  return 2.0;
					  break;
				  case 5:
					  return 2.3;
					  break;
				  case 6:
					  return 2.7;
					  break;
				  case 7:
					  return 3.0;
					  break;
				  case 8:
					  return 3.3;
					  break;
				  case 9:
					  return 3.7;
					  break;
				  case 10:
					  return 4.0;
					  break;
		   }
	}
	public static int Main()
	{
		int n;
		int s;
		int i;
		s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double gpa = 0;
		int[] a = new int[n];
		int[] b = new int[n];
		for (i = 0;i <= n - 1;i++)
		{
						   String tempVar2 = ConsoleInput.scanfRead();
						   if (tempVar2 != null)
						   {
							   a[i] = Integer.parseInt(tempVar2);
						   }
						   s += a[i];
		}
		for (i = 0;i <= n - 1;i++)
		{
						   String tempVar3 = ConsoleInput.scanfRead();
						   if (tempVar3 != null)
						   {
							   b[i] = Integer.parseInt(tempVar3);
						   }
						   gpa += gc(b[i]) * a[i];
		}
		gpa = gpa / s;
		System.out.printf("%.2lf",gpa);

		return 0;
	}



}

