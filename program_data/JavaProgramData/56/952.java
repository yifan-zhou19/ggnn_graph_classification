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
		int m;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}

		a = m % 10,b = (m % 100 - a) / 10,c = (m % 1000 - a - b * 10) / 100,d = (m % 10000 - a - b * 10 - c * 100) / 1000;
		e = (m - a - b * 10 - c * 100 - d * 1000) / 10000;


	   if (m > 10000 && m < 100000)
	   {
	   System.out.printf("%d\n",a * 10000 + b * 1000 + c * 100 + d * 10 + e);
	   }
	   if (m > 1000 && m < 10000)
	   {
	   System.out.printf("%d\n",a * 1000 + b * 100 + c * 10 + d);
	   }

	   if (m > 100 && m < 1000)
	   {
	   System.out.printf("%d\n",a * 100 + b * 10 + c);
	   }
	   if (m > 10 && m < 100)
	   {
	   System.out.printf("%d\n",a * 10 + b);
	   }
		if (m >= 1 && m < 10)
		{
	   System.out.printf("%d\n",a);
		}

	return 0;
	}

}

