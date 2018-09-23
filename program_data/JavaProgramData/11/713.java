package <missing>;

public class GlobalMembers
{
	public static int RunNian(int y)
	{
			int result;
			 if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
			 {
						result = 1;
			 }
			 else
			 {
				result = 0;
			 }
			 return result;
	}

	public static int DiJiTian(int y,int m,int d)
	{
			 int result = 0;
			  for (int i = 1;i < m;i++)
			  {
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
					   if (RunNian(y) != 0)
					   {
						  result += 29;
					   }
						else
						{
						   result += 28;
						}
				  }
			  }

			  result += d;
			  return result;
	}

	public static int Main()
	{

		 int y2;
		 int m2;
		 int d2;
		 int a;
		 int e;
		 int T = 0;

		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   y2 = Integer.parseInt(tempVar);
		   }
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   m2 = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   d2 = Integer.parseInt(tempVar3);
		   }

			  T += DiJiTian(y2, m2, d2);
			   System.out.printf("%d\n",T);
	return 0;
	}
}

