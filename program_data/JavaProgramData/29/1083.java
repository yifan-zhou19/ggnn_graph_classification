package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int m;
	 int n;
	 int fenzi;
	 int fenmu;
	 int e;
	 double s = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
	 for (int i = 1;i <= m;i++)
	 {
	  fenmu = 1;
	  fenzi = 2;
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  n = Integer.parseInt(tempVar2);
	  }
	  s = 0;
	  for (int j = 1;j <= n;j++)
	  {
	   s += (double)fenzi / fenmu;
	   e = fenzi;
	   fenzi = fenzi + fenmu;
	   fenmu = e;
	  }
	  System.out.printf("%.3lf\n",s);
	 }
	 return 0;
	}
}

