package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[][] a =
	  {
		  {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
		  {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	  };
	  int y;
	  int m;
	  int i;
	  int d;
	  int s = 0;
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
	  if (y % 400 == 0 || (y % 100 != 0 && y % 4 == 0))
	  {
		for (i = 0;i < m;i++)
		{
		  s += a[1][i];
		}
		  s += d;
	  }
	  else
	  {
		 for (i = 0;i < m;i++)
		 {
		  s += a[0][i];
		 }
		  s += d;
	  }
	  System.out.printf("%d",s);
	  return 0;
	}
}

