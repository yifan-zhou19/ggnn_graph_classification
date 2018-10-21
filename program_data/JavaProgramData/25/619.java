package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  double result = 1;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  result = Math.pow(2.0,1.0 * n);
	  System.out.printf("%.0lf",result);
	  return 0;
	}

}

