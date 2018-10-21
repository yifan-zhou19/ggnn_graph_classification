package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int j;
	  int n;
	  int[][] s = new int[100][2];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  i = 0,j = 0;
	  double a;
	  double b;
	  a = 0,b = 0;
	  for (i = 0;i < n;i++)
	  {
		  for (j = 0;j < 2;j++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  s[i][j] = Integer.parseInt(tempVar2);
			  }
		  }
	  }
	  a = 1.0 * s[0][1] / s[0][0];
	  for (i = 1;i < n;i++)
	  {
		  b = 1.0 * s[i][1] / s[i][0];
		  if ((b - a) > 0.05)
		  {
			  System.out.print("better\n");
		  }
		  else if ((a - b) > 0.05)
		  {
			  System.out.print("worse\n");
		  }
		  else
		  {
			  System.out.print("same\n");
		  }
	  }
	  return 0;
	}

}

