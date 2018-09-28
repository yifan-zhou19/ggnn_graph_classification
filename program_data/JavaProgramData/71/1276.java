package <missing>;

public class GlobalMembers
{
	public static int isRunNian(int year)
	{
	 int result;
	if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
	{
	result = 1;
	}
	else
	{
	 result = 0;
	}
	 return result;
	}
	public static int Main()
	{
		int n;
		int d;
		int[][] s = new int[200][100];
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			d = 0;
		   for (int k = 0;k < 3;k++)
		   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   (s[i][k]) = Integer.parseInt(tempVar2);
		   }
		   }
		   if ((s[i][1]) > (s[i][2]))
		   {
			e = s[i][1];
			s[i][1] = s[i][2];
			s[i][2] = e;
		   }
			for (int m = (s[i][1]);m < (s[i][2]);m++)
			{
			if ((m == 1) || (m == 3) || (m == 5) || (m == 7) || (m == 8) || (m == 10))
			{
			   d += 31;
			}
			else if ((m == 4) || (m == 6) || (m == 9) || (m == 11))
			{
			   d += 30;
			}
			else if (m == 2)
			{
				if (isRunNian(s[i][0]) != 0)
				{
				 d += 29;
				}
				else
				{
				  d += 28;
				}
			}
			}
			 if ((d % 7) == 0)
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

