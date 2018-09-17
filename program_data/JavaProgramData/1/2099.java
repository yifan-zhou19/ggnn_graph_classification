package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //x?????????y???????????
		int i;
		int fenjie = new int(int x,int y);
		int[] a;
		int re = 0;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = new int[n];
		for (i = 0;i < n;i++)
		{
						String tempVar2 = ConsoleInput.scanfRead();
						if (tempVar2 != null)
						{
							a[i] = Integer.parseInt(tempVar2);
						}

		}
		for (i = 0;i < n;i++)
		{
					   System.out.printf("%d\n",fenjie(a[i],2) + 1);
		}
		return 0;
	}

//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static fenjie(int x,int y)
	{
			   int i;
			   int flag = 0;
			   int re = 0;
			   int flag2 = 0;
			   int k = 0;
			   if (x < y)
			   {
				   return 0;
			   }
			   else if (x == y)
			   {
				   return 0;
			   }
			   else
			   {
					for (i = y;i < x;i++)
					{
									 if (x % i == 0)
									 {
										 flag2 += 1;
									 }
					}
					if (flag2 == 0)
					{
						return 0;
					}
					else
					{
					   for (i = y;i <= x;i++)
					   {
										if (x % i == 0)
										{
												   re += fenjie(x / i,i);
												   if (x / i >= i)
												   {
													   k += 1;
												   }
										}
					   }
					   re += k;
					   return (re);
					}
			   }
	}
}

