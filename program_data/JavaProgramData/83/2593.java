package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int b;
		  int n;
		  float GPA;
		  float e;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  float[] sz = new float[n];
		  float[] xy = new float[n];
		  float[] mm = new float[n];
		  for (i = 0;i < n;i++)
		  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  sz[i] = Float.parseFloat(tempVar2);
		  }
		  e += sz[i];
		  }
		  for (i = 0;i < n;i++)
		  {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  xy[i] = Float.parseFloat(tempVar3);
		  }
		  }
		  for (i = 0;i < n;i++)
		  {
		  if (xy[i] >= 90F)
		  {
			 mm[i] = 4.0F;
		  }
		  else
		  {
			  if (xy[i] >= 85F)
			  {
				 mm[i] = 3.7F;
			  }
			   else
			   {
					if (xy[i] >= 82F)
					{
						   mm[i] = 3.3F;
					}
						else
						{
							if (xy[i] >= 78F)
							{
							   mm[i] = 3.0F;
							}
							else
							{
								if (xy[i] >= 75F)
								{
								mm[i] = 2.7F;
								}
								else
								{
									if (xy[i] >= 72F)
									{
									   mm[i] = 2.3F;
									}
									else
									{
										if (xy[i] >= 68F)
										{
										mm[i] = 2.0F;
										}
										else
										{
											if (xy[i] >= 64F)
											{
											   mm[i] = 1.5F;
											}
											else
											{
												if (xy[i] >= 60F)
												{
												   mm[i] = 1.0F;
												}
												else
												{
													mm[i] = 0.0F;
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
		  for (i = 0;i < n;i++)
		  {
		  GPA += sz[i] * mm[i] / e;
		  }
		  System.out.printf("%.2f",GPA);
		  return 0;
	}
}

