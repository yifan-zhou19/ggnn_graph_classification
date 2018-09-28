package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int n;
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
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",a,b,c,d,e,f);
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   a = Integer.parseInt(tempVar2);
	   }
		return 0;
	}

}

