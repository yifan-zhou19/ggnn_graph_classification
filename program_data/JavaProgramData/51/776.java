package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int m;
		  int sun = 0;
		  int flag = 0;
		  int aa = 0;
		  int mm = 1;
		  String a = new String(new char[510]);
		  int[] b = new int[510];
		  int[] d = new int[510];
		  int p = 0;
		  int j;
		  int pp;
		  int jj;
		  int ii;
		  int k;
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
		  for (i = 0;i < 510;i++)
		  {
		  b[i] = 0;
		  }
		  for (i = 0;i < 510;i++)
		  {
		  d[i] = 0;
		  }
		  for (i = 0;a.charAt(i) != 0;i++)
		  {
			  p++;
		  }
		  m = p - n + 1;
		  if (m < 1)
		  {
		  System.out.print("NO\n");
		  }
		  else
		  {
							  for (i = 0;i < m;i++)
							  {
							   for (j = 0;j < n;j++)
							   {
											   b[i] = b[i] + a.charAt(i + j) * mm;
												mm = mm * 43;
							   }
												 mm = 1;
							  }

							   for (i = 0;i < m - 1;i++)
							   {
											   for (j = i + 1;j < m;j++)
											   {
												   if (b[i] != b[j])
												   {
											   sun++;
												   }
											   }
							   }




							  if (sun == m * (m - 1) / 2)
							  {
											   System.out.print("NO\n");
							  }
			 else
			 {
														  for (i = 0;i < m;i++)
														  {
																		  for (pp = 0;pp < i;pp++)
																		  {
															if (b[pp] == b[i])
															{
															   flag = 1;
															   break;
															}
														   else
														   {
															flag = 0;
														   }
																		  }
															 if (flag != 0)
															 {
															 continue;
															 }

															 for (j = 0;j < m;j++)
															 {
															 if (b[i] == b[j])
															 {
															 d[i]++;
															 }
															 }

														  }


															 for (i = 0;i < m;i++)
															 {
																 for (j = 0;j < m;j++)
																 {
															  if (d[i] >= d[j])
															  {
															   aa++;
															  }
																 }
																										if (aa == m)
																										{
																											System.out.printf("%d\n",d[i]);
																										for (ii = 0;ii < n;ii++)
																										{
																										System.out.printf("%c",a.charAt(i + ii));
																										}
																									System.out.print("\n");
															 break;
																										}
															 aa = 0;
															 }



										for (k = i + 1;k < m;k++)
										{
											if (d[i] == d[k])
											{
										for (jj = 0;jj < n;jj++)
										{
										System.out.printf("%c",a.charAt(k + jj));
										}
										System.out.print("\n");
											}
										}
			 }
		  }

	}


}

