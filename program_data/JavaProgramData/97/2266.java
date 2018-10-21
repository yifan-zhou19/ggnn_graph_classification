package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (a = 0;n >= 100;a++)
		{
			n = n - 100;
		}
		for (b = 0;n >= 50;b++)
		{
			n = n - 50;
		}
		for (c = 0;n >= 20;c++)
		{
			n = n - 20;
		}
		for (d = 0;n >= 10;d++)
		{
			n = n - 10;
		}
		for (e = 0;n >= 5;e++)
		{
			n = n - 5;
		}
		f = n;
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",a,b,c,d,e,f);
	}
}

