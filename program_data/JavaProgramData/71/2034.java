package <missing>;

public class GlobalMembers
{
	public static int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public static int[][] hash = new int[13][32];

	public static int Main()
	{
		int Data;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			Data = Integer.parseInt(tempVar);
		}
		while (Data-- != 0)
		{
			  int year;
			  int m1;
			  int m2;
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  year = Integer.parseInt(tempVar2);
			  }
			  String tempVar3 = ConsoleInput.scanfRead(" ");
			  if (tempVar3 != null)
			  {
				  m1 = Integer.parseInt(tempVar3);
			  }
			  String tempVar4 = ConsoleInput.scanfRead(" ");
			  if (tempVar4 != null)
			  {
				  m2 = Integer.parseInt(tempVar4);
			  }
			  if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
			  {
				  month[2] = 29;
			  }
				 else
				 {
					 month[2] = 28;
				 }
			  int cnt = 0;
			  if (m1 > m2)
			  {
				  swap(m1,m2);
			  }
			  for (int i = 1;i <= 12;i++)
			  {
				  for (int j = 1;j <= month[i];j++)
				  {
					  hash[i][j] = ++cnt;
				  }
			  }
			  if ((hash[m2][1] - hash[m1][1]) % 7 == 0)
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

