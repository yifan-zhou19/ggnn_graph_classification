package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int year;
		  int m1;
		  int m2;
		  int i;
		  int j;
		  int b;
		  int day;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //???;
		  for (i = 0;i < n;i++)
		  {
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
			  if (m1 > m2) //??m1<m2;
			  {
				  b = m1;
				  m1 = m2;
				  m2 = b;
			  }
			  day = 0;
			  if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) //?????
			  {
				  days[1]++;
				  for (j = m1 - 1;j < m2 - 1;j++)
				  {
					  day = day + days[j];
				  }
				  if (day % 7 == 0)
				  {
					  System.out.print("YES\n");
				  }
				  else
				  {
					  System.out.print("NO\n");
				  }
				  days[1] = 28;
			  }
			  else
			  {
				  for (j = m1 - 1;j < m2 - 1;j++)
				  {
					  day = day + days[j];
				  }
				  if (day % 7 == 0)
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

}

