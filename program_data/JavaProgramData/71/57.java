package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int year;
	int leap;
	int i;
	int m;
	int d;
	int re;
	int q;
	int s;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int j = 0;j < n;j++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		year = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		m = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		d = Integer.parseInt(tempVar4);
	}
	if (m > d)
	{
		s = m;
	m = d;
	d = s;
	}
	if (year % 4 == 0)
	{
		if (year % 100 == 0)
		{
		if (year % 400 == 0)
		{
				 leap = 1;
		}
				else
				{
					leap = 0;
				}
		}
					else
					{
						leap = 1;
					}
	}
						else
						{
							leap = 0;
						}
				   if (leap == 1)
				   {
					   int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

						   for (int k = m;k < d;k++)
						   {
							   q += month[k - 1];
						   }
					  if (q % 7 == 0)
					  {
						  re = 1;
					  }
					   else
					   {
						 re = 0;
					   }
				   }
					  else
					  {
						  int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

						   for (int k = m;k < d;k++)
						   {
							   q += month[k - 1];
						   }
						   if (q % 7 == 0)
						   {
							   re = 1;
						   }
							   else
							   {
								re = 0;
							   }
					  }
								q = 0;
	if (re == 1)
	{
	System.out.print("YES\n");
	}
	else
	{
	System.out.print("NO\n");
	}
	}
	return 0;
	}
}

