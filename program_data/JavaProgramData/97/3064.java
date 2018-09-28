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
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		b = a % 100;
		System.out.printf("%d\n",(a - b) / 100);
		c = b % 50;
		System.out.printf("%d\n",(b - c) / 50);
		d = c % 20;
		System.out.printf("%d\n",(c - d) / 20);
		e = d % 10;
		System.out.printf("%d\n",(d - e) / 10);
		f = e % 5;
		System.out.printf("%d\n",(e - f) / 5);
		System.out.printf("%d",f);
		return 0;

	}
}

