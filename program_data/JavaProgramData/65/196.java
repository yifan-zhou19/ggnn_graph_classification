package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int a;
	  int b;
	  int x = 0;
	  int y = 0;
	  int i;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < n;i++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		if ((a == 0 && b == 1) || (a == 1 && b == 2) || (a == 2 && b == 0))
		{
		x = x + 1;
		}
		else if ((b == 0 && a == 1) || (b == 1 && a == 2) || (b == 2 && a == 0))
		{
		y = y + 1;
		}
		else if (a == b)
		{
			x = x,y = y;
		}
	  }
	  if (x == y)
	  {
	  System.out.print("Tie");
	  }
	  else if (x > y)
	  {
	  System.out.print("A");
	  }
	  else if (x < y)
	  {
	  System.out.print("B");
	  }
	  return 0;
	}
}

