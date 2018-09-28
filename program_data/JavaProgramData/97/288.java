package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	   int n;
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
	   b = (n - a * 100) / 50;
	   c = (n - a * 100 - b * 50) / 20;
	   d = (n - a * 100 - b * 50 - c * 20) / 10;
	   e = (n - a * 100 - b * 50 - c * 20 - d * 10) / 5;
	   f = n - a * 100 - b * 50 - c * 20 - d * 10 - e * 5;
	   System.out.printf("%d\n",a);
	   System.out.printf("%d\n",b);
	   System.out.printf("%d\n",c);
	   System.out.printf("%d\n",d);
	   System.out.printf("%d\n",e);
	   System.out.printf("%d\n",f);

	}
}

