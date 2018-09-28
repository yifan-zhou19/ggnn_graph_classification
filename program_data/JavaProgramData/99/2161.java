package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n = 0;
	  int a = 0;
	  int b = 0;
	  int c = 0;
	  int d = 0;
	  double sum = 0;
	  int buffer = 0;

	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (int i = 1; i <= n; ++i)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			buffer = Integer.parseInt(tempVar2);
		}
		if (buffer >= 1 && buffer <= 18)
		{
		  ++a;
		}
		if (buffer >= 19 && buffer <= 35)
		{
		  ++b;
		}
		if (buffer >= 36 && buffer <= 60)
		{
		  ++c;
		}
		if (buffer >= 61)
		{
		  ++d;
		}

	  }
	  sum = a + b + c + d;
	  System.out.printf("1-18: %.2lf%%\n", a / sum * 100);
	  System.out.printf("19-35: %.2lf%%\n", b / sum * 100);
	  System.out.printf("36-60: %.2lf%%\n", c / sum * 100);
	  System.out.printf("60??: %.2lf%%\n", d / sum * 100);
	  return 0;
	}
}

