package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int sum = 0;
		int i;
		int[] a = new int[10];
		float[] b = new float[10];
		float gpa = 0F;
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
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Float.parseFloat(tempVar3);
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
		   if (b[i] >= 90F)
		   {
			   b[i] = 4.0F;
		   }
			  else if (b[i] >= 85F)
			  {
				  b[i] = 3.7F;
			  }
				   else if (b[i] >= 82F)
				   {
					   b[i] = 3.3F;
				   }
						else if (b[i] >= 78F)
						{
							b[i] = 3.0F;
						}
							 else if (b[i] >= 75F)
							 {
								 b[i] = 2.7F;
							 }
								  else if (b[i] >= 72F)
								  {
									  b[i] = 2.3F;
								  }
									   else if (b[i] >= 68F)
									   {
										   b[i] = 2.0F;
									   }
											else if (b[i] >= 64F)
											{
												b[i] = 1.5F;
											}
												 else if (b[i] >= 60F)
												 {
													 b[i] = 1.0F;
												 }
													  else
													  {
														  b[i] = 0.0F;
													  }
		}
		for (i = 0;i <= n - 1;i++)
		{
		   sum += a[i];
		   b[i] *= a[i];
		   gpa += b[i];
		}
		gpa /= sum;
		System.out.printf("%.2f\n",gpa);
	}

}

