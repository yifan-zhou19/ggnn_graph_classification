package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  double a;
	  double b;
	  double e;
	  double s;
	  int m;
	  int n;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
	  for (int i = 1;i <= m;i++)
	  {
		s = 0;
		a = 1;
		b = 2;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (int j = 1;j <= n;j++)
		{
			s = s + b / a;
			e = a + b;
			a = b;
			b = e;
		}
		System.out.printf("%.3lf\n",s);
	  }
		return 0;
	}


}

