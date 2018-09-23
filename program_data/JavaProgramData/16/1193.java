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
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}

	if (a > 9)
	{
		   if (a > 99)
		   {
				   if (a > 999)
				   {
								b = a % 10;
							c = ((a - b) % 100) / 10;
							d = ((a - b - c) % 1000) / 100;
							e = ((a - b - c - d) % 10000) / 1000;
							System.out.printf("%d%d%d%d",b,c,d,e);
				   }
							else
							{
								b = a % 10;
							c = ((a - b) % 100) / 10;
							d = ((a - b - c) % 1000) / 100;
							System.out.printf("%d%d%d",b,c,d);
							}
		   }
							else
							{
								b = a % 10;
							c = ((a - b) % 100) / 10;
	System.out.printf("%d%d",b,c);
							}
	}
							else
							{
								b = a % 10;
								System.out.printf("%d",b);
							}
							return 0;
	}


}

