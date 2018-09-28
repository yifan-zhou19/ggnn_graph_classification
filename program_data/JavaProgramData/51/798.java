package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int p;
		int max;
		String a = new String(new char[500]);
		int[] b = new int[500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		m = a.length();
		for (i = 0;i <= m - n;i++)
		{
						  for (j = i + 1;j < m;j++)
						  {
												if (a.charAt(i) == a.charAt(j))
												{
															  for (k = 1;k < n;k++)
															  {
																				if (a.charAt(i + k) != a.charAt(j + k))
																				{
																								 p = 0;
																								 break;
																				}
																				else
																				{
																					p = 1;
																				}
															  }
															  if (p == 1)
															  {
																  b[i] = b[i] + 1;
															  }
												}
						  }
		}
			max = 0;
			for (i = 0;i <= m - n;i++)
			{
								if (max < b[i])
								{
									max = b[i];
								}
			}
			if (max == 0)
			{
				System.out.print("NO");
			}
			else
			{
					 System.out.printf("%d\n",max + 1);
					 for (i = 0;i <= m - n;i++)
					 {
									   if (b[i] == max)
									   {
													for (k = 0;k < n;k++)
													{
																	System.out.printf("%c",a.charAt(i + k));
													}
													System.out.print("\n");
									   }
					 }
			}
		return 0;
	}
}

