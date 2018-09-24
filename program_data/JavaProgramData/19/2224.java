package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String c = new String(new char[200]);
		int i;
		int j = 0;
		int k = 0;
		int z = 0;
		int p;
		int q;
		int r;
		int m;
		int h = 0;
		int v;
		int[] t = new int[100];
		int[] n = new int[100];
		char u;
		char w;
		c = new Scanner(System.in).nextLine();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		p = a.length();
		q = b.length();
		r = c.length();
		u = a.charAt(0);
		for (i = 0;i < r;i++)
		{
						 w = c.charAt(i);
						 if (u == w)
						 {
								  if (i == 0 || c.charAt(i - 1) == ' ')
								  {
								  t[j] = i;
								  j += 1;
								  }
								  else
								  {
									   k += 1;
								  }
						 }
						 else
						 {
							   k += 1;
						 }
		}
		if (k == r)
		{
				 System.out.printf("%s",c);
		}
		else
		{
			 for (k = 0;k < j;k++)
			 {
			  for (i = 1;i < p;i++)
			  {
							   m = t[k];
							   u = a.charAt(i);
							   w = c.charAt(m + i);
							   if (u != w)
							   {
										 z += 1;
										 break;
							   }
			  }
			  if (i == p)
			  {
						n[h] = t[k];
						h += 1;
			  }
			 }
			  if (z == j)
			  {
					   System.out.printf("%s",c);
			  }
			  else
			  {
					m = n[0];
					if (m == 0)
					{
							  for (i = 0;i < h - 1;i++)
							  {
											   for (k = 0;k < q;k++)
											   {
																  System.out.printf("%c",b.charAt(k));
											   }
											   v = n[i + 1];
											   for (k = p + n[i];k < v;k++)
											   {
																	 System.out.printf("%c",c.charAt(k));
											   }
							  }
							  for (i = 0;i < q;i++)
							  {
												System.out.printf("%c",b.charAt(i));
							  }
							  for (i = p + n[h - 1];i < r;i++)
							  {
													 System.out.printf("%c",c.charAt(i));
							  }
					}
					  else
					  {
							 for (i = 0;i < n[0];i++)
							 {
											  System.out.printf("%c",c.charAt(i));
							 }
							 for (i = 0;i < h - 1;i++)
							 {
											   for (k = 0;k < q;k++)
											   {
																  System.out.printf("%c",b.charAt(k));
											   }
											   v = n[i + 1];
											   for (k = p + n[i];k < v;k++)
											   {
																	 System.out.printf("%c",c.charAt(k));
											   }
							 }
							  for (i = 0;i < q;i++)
							  {
												System.out.printf("%c",b.charAt(i));
							  }
							  for (i = p + n[h - 1];i < r;i++)
							  {
													 System.out.printf("%c",c.charAt(i));
							  }
					  }
			  }
		}
			 return 0;
	}

}

