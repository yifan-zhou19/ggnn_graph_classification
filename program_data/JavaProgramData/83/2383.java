package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float[] b = new float[10];
		int[][] a = new int[2][10];
		float GPA;
		int i;
		int j;
		int n;
		int x = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 2;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (j = 0;j < n;j++)
		{
		   if (a[1][j] > 89)
		   {
			   b[j] = 4.0F;
		   }
		   else
		   {
			   if (a[1][j] > 84)
			   {
				   b[j] = 3.7F;
			   }
			   else
			   {
				   if (a[1][j] > 81)
				   {
					   b[j] = 3.3F;
				   }
				   else
				   {
					   if (a[1][j] > 77)
					   {
						   b[j] = 3.0F;
					   }
					   else
					   {
						   if (a[1][j] > 74)
						   {
							   b[j] = 2.7F;
						   }
						   else
						   {
							   if (a[1][j] > 71)
							   {
								   b[j] = 2.3F;
							   }
							   else
							   {
								   if (a[1][j] > 67)
								   {
									   b[j] = 2.0F;
								   }
								   else
								   {
									   if (a[1][j] > 63)
									   {
										   b[j] = 1.5F;
									   }
									   else
									   {
										   if (a[1][j] > 59)
										   {
											   b[j] = 1.0F;
										   }
										   else
										   {
											   b[j] = 0F;
										   }
									   }
								   }
							   }
						   }
					   }
				   }
			   }
		   }
		}
		GPA = 0F;
		for (j = 0;j < n;j++)
		{
			GPA = (double)a[0][j] * b[j] + GPA;
		}
		for (j = 0;j < n;j++)
		{
		   x = x + a[0][j];
		}
		GPA = GPA / x;
		System.out.printf("%.2f",GPA);
	}
}

