package <missing>;

public class GlobalMembers
{
	public static int isRunNian(int year)
	{
		int result;
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
		{
			result = 1;
		}
		else
		{
			result = 0;
		}
		  return result;
	}


	public static int DiJiTian(int year, int month, int day)
	{
		int result = 0;
		for (int i = 1; i < month; i++)
		{ //step1
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				result += 31;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				result += 30;
			}
			else if (i == 2)
			{
				if (isRunNian(year) != 0)
				{
					result += 29;
				}
				else
				{
					result += 28;
				}
			}
		}
		result += day; //step2
		return result;
	}

	public static void Main(String[] args)
	{
		int n;
	   int[][] sz = new int[200][3];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   int a = 0;
	   int b = 0;

	   for (int i = 0;i < n;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   sz[i][0] = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   sz[i][1] = Integer.parseInt(tempVar3);
		   }
		   String tempVar4 = ConsoleInput.scanfRead(" ");
		   if (tempVar4 != null)
		   {
			   sz[i][2] = Integer.parseInt(tempVar4);
		   }
		   a = DiJiTian(sz[i][0], sz[i][1], 1) - DiJiTian(sz[i][0], sz[i][2], 1);
		   b = a % 7;
		   if (b == 0)
		   {
			   System.out.print("YES\n");
		   }
		   else
		   {
			   System.out.print("NO\n");
		   }


	   }
	}



}

