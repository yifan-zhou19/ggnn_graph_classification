package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   int s = n / 100;
	   int t = n % 100;
	   int y = t / 50;
	   int u = t % 50;
	   int a = u / 20;
	   int b = u % 20;
	   int c = b / 10;
	   int d = b % 10;
	   int e = d / 5;
	   int f = d % 5;
	   System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",s,y,a,c,e,f);
	return 0;
	}
}

