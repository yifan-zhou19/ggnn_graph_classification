package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] numble = new int[10];
		int i;
		int a;
		int s = 0;
		double b;
		double sum = 0;
		float GPA;
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				numble[i] = Integer.parseInt(tempVar2);
			}
			s = s + numble[i];
		}
			for (i = 0; i < n; i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a = Integer.parseInt(tempVar3);
				}
				if (a <= 100 && a >= 90)
				{
				   b = 4.0;
				}
				   else if (a <= 89 && a >= 85)
				   {
					   b = 3.7;
				   }
					   else if (a <= 84 && a >= 82)
					   {
						   b = 3.3;
					   }
						   else if (a <= 81 && a >= 78)
						   {
							   b = 3.0;
						   }
							   else if (a <= 77 && a >= 75)
							   {
								   b = 2.7;
							   }
								   else if (a <= 74 && a >= 72)
								   {
									   b = 2.3;
								   }
									   else if (a <= 71 && a >= 68)
									   {
										   b = 2.0;
									   }
										   else if (a <= 67 && a >= 64)
										   {
											   b = 1.5;
										   }
											  else if (a <= 63 && a >= 60)
											  {
											   b = 1.0;
											  }
												 else if (a < 60)
												 {
												   b = 0;
												 }

				sum = sum + numble[i] * b;
			}
		GPA = (float)(sum / s);
		System.out.printf("%.2f",GPA);
		return 0;
	}



}

