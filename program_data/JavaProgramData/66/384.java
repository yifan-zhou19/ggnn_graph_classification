package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int y;
	  int m;
	  int d;

	  int x = 0;
	  int i;

	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  y = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  m = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  d = Integer.parseInt(tempVar3);
	  }

	  i = (y - 1) / 400 * 400;

	  for (; i + 100 < y ; i += 100)
	  {
		x = x + 36524 % 7;
	  }

	  i = (y - 1) / 100 * 100 + 1;

	  for (; i < y ; i++)
	  {
		if (i % 4 != 0)
		{
		  x = x + 365;
		}
		else
		{
			x = x + 366;
		}
	  }

	  for (i = 1 ; i < m ; i++)
	  {
		if (1 == i || 3 == i || 5 == i || 7 == i || 8 == i || 10 == i || 12 == i)
		{
		  x = x + 31;
		}
		else if (4 == i || 6 == i || 9 == i || 11 == i)
		{
		  x = x + 30;
		}
		else if (y % 4 != 0 || (y % 400 != 0 && y % 100 == 0))
		{
		  x = x + 28;
		}
		else
		{
			x = x + 29;
		}
	  }

	  x = (x + d) % 7;

	  switch (x)
	  {
	  case 0:
		  System.out.print("Sun.\n");
		  break;
	  case 1:
		  System.out.print("Mon.\n");
		  break;
	  case 2:
		  System.out.print("Tue.\n");
		  break;
	  case 3:
		  System.out.print("Wed.\n");
		  break;
	  case 4:
		  System.out.print("Thu.\n");
		  break;
	  case 5:
		  System.out.print("Fri.\n");
		  break;
	  case 6:
		  System.out.print("Sat.\n");
		  break;
	  }
	  return 0;
	}



}

