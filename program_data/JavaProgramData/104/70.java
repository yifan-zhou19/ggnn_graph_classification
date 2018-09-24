package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int x;
	  int y;
	  int cx;
	  int cy;
	  int t;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  x = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  y = Integer.parseInt(tempVar2);
	  }
	  t = 2;
	  cx = 1;
	  while (x >= t)
	  {
		t = t * 2;
		cx++;
	  }
	  t = 2;
	  cy = 1;
	  while (y >= t)
	  {
		t = t * 2;
		cy++;
	  }
	  while (!(x == y))
	  {
		if (cx >= cy)
		{
		  x = x / 2;
		  cx--;
		}
		else
		{
		  y = y / 2;
		  cy--;
		}
	  }
	  System.out.printf("%d\n",x);
	}
}

