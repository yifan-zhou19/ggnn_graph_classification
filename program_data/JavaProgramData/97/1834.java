package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i = 0;
	 int a = 0;
	 int b = 0;
	 int c = 0;
	 int d = 0;
	 int e = 0;
	 int f = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	  a = n / 100;
	  i = n - a * 100;
	  b = i / 50;
	  i = i - b * 50;
	  c = i / 20;
	  i = i - c * 20;
	  d = i / 10;
	  i = i - d * 10;
	  e = i / 5;
	  f = i - e * 5;

	System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",a,b,c,d,e,f);
	 return 0;
	}


}

