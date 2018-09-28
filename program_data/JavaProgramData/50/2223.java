package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int day;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 1;i <= 12;i++)
		  {
		  if (i == 1)
		  {
		  day = 12;
		  }
		  else if (i == 2 || i == 4 || i == 6 || i == 8 || i == 9 || i == 11)
		  {
		  day = day + 31;
		  }
		  else if (i == 3)
		  {
		  day = day + 28;
		  }
		  else
		  {
		  day = day + 30;
		  }

		  if ((day % 7 + n) % 7 == 5)
		  {
		  System.out.printf("%d\n",i);
		  }
		  }




	}

}

