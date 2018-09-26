package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int n;
	  int i;
	  int s2 = 0;
	  float s1 = 0F;
	  float GPA;
	  int[] a = new int[9];
	  int[] b = new int[9];
	  float[] c = new float[9];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i <= n - 1;i++)
	  {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a[i] = Integer.parseInt(tempVar2);
		 }
	  }
	  for (i = n;i <= 9;i++)
	  {
		  a[i] = 0;
	  }
	  for (i = 0;i <= n - 1;i++)
	  {
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 b[i] = Integer.parseInt(tempVar3);
		 }
	  }
	  for (i = n;i <= 9;i++)
	  {
		  a[i] = 0;
	  }
	  for (i = 0;i <= n - 1;i++)
	  {
			if (b[i] >= 90)
			{
				c[i] = 4.0F;
			}
		 else if (b[i] >= 85)
		 {
			 c[i] = 3.7F;
		 }
			  else if (b[i] >= 82)
			  {
				  c[i] = 3.3F;
			  }
				   else if (b[i] >= 78)
				   {
					   c[i] = 3.0F;
				   }
						else if (b[i] >= 75)
						{
							c[i] = 2.7F;
						}
							 else if (b[i] >= 72)
							 {
								 c[i] = 2.3F;
							 }
								  else if (b[i] >= 68)
								  {
									  c[i] = 2.0F;
								  }
									   else if (b[i] >= 64)
									   {
										   c[i] = 1.5F;
									   }
											else if (b[i] >= 60)
											{
												c[i] = 1.0F;
											}
												 else
												 {
													 c[i] = 0.0F;
												 }
		 s1 = s1 + c[i] * a[i];
		 s2 = s2 + a[i];
	  }
	  GPA = s1 / s2;
		  System.out.printf("%.2f",GPA);
	}
}

