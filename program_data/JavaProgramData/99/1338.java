package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  double a;
	  double b;
	  double c;
	  double d;
	  a = 0;
	  b = 0;
	  c = 0;
	  d = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  int[] haha = new int[1000];
	  for (i = 0;i < n;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  haha[i] = Integer.parseInt(tempVar2);
		  }
	  }
	  for (i = 0;i < n;i++)
	  {
		  if (haha[i] > 0 && haha[i] < 19)
		  {
			  a = a + 1;
		  }
		  else if (haha[i] > 18 && haha[i] < 36)
		  {
			  b = b + 1;
		  }
		  else if (haha[i] > 35 && haha[i] < 61)
		  {
			  c = c + 1;
		  }
		  else if (haha[i] > 60)
		  {
			  d = d + 1;
		  }
	  }

	  a = a / n;
	  b = b / n;
	  c = c / n;
	  d = d / n;
	  System.out.printf("1-18: %.2lf%%\n",a * 100);
	  System.out.printf("19-35: %.2lf%%\n",b * 100);
	  System.out.printf("36-60: %.2lf%%\n",c * 100);
	  System.out.printf("60??: %.2lf%%",d * 100);

		return 0;
	}

}

