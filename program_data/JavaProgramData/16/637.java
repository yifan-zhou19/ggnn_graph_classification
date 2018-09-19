package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	//
		int n;
		int a;
		int b;
		int c;
		int d;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	if ((n >= 0) && (n <= 9))
	{
		System.out.printf("%d",n);
	}
	   else if ((n >= 10) && (n <= 99))
	   {
		   a = n % 10;
		b = (n - (n % 10)) / 10;
		System.out.printf("%d%d",a,b);
	   }
		else if ((n >= 100) && (n <= 999))
		{
		   a = n % 10;
		b = ((n - a) % 100) / 10;
		c = (n - a - 10 * b) / 100;
		System.out.printf("%d%d%d",a,b,c);
		}
		else if ((n >= 1000) && (n <= 9999))
		{
		   a = n % 10; //??n????
		b = ((n - a) / 10) % 10; //??n????
		c = ((n - a - 10 * b) / 100) % 10; //??n????
		d = (n - a - 10 * b - 100 * c) / 1000; //??n????
		System.out.printf("%d%d%d%d",a,b,c,d);
		} //?n????
	else
	{
		System.out.print("00001");
	}
	return 0;
	}
}

