package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int f;
	int a;
	int b;
	int c;
	int d;
	int e;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	a = n / 10000;
	 b = (n % 10000) / 1000;
	 c = (n % 1000) / 100;
	 d = (n % 100) / 10;
	e = n % 10;
	if (n >= 10000)
	{
	  f = 10000 * e+1000 * d + 100 * c + 10 * b + a;
	  System.out.printf("%ld",f);
	}
	else if (n >= 1000)
	{
	  f = 1000 * e+100 * d + 10 * c + b;
	  System.out.printf("%ld",f);
	}
	else if (n >= 100)
	{
	  f = 100 * e+10 * d + c;
	  System.out.printf("%ld",f);
	}
	else if (n >= 10)
	{
	  f = 10 * e + d;
	  System.out.printf("%ld",f);
	}
	else
	{
		System.out.printf("%d",n);
	}
	return 0;
	}



}

