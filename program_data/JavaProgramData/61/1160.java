package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 double a = 1;
	 double b = 1;
	 double c;
	 int i;
	 int n;
	 int j;
	 int x;

	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 1;i <= n;i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  x = Integer.parseInt(tempVar2);
	  }
	  a = 1;
	  b = 1;
	  for (j = 3;j <= x;j++)
	  {
		  c = b;
	   b = a + b;
	   a = c;
	  }
	  System.out.printf("%.0lf\n",b);
	 }
	 return 0;
	}
}

