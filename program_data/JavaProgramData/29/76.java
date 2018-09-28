package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int m;
	 int n;
	 int a;
	 int b;
	 int q;
	double s = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
	 for (int i = 0;i < m;i++)
	 {
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 n = Integer.parseInt(tempVar2);
	 }
	 s = 0;
	  for (int h = 0;h < n;h++)
	  {
		  if (h == 0)
		  {
			  a = 2;
		b = 1;
		  }
		else
		{
		q = a;
		a = a + b;
		b = q;
		}
		s = s + a * 1.0 / b;
	  }
	  System.out.printf("%.3lf\n",s);
	 }
	return 0;
	}

}

