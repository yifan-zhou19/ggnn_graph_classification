package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s = n;
		a = s / 100;
		s = s % 100;
		b = s / 50;
		s = s % 50;
		c = s / 20;
		s = s % 20;
		d = s / 10;
		s = s % 10;
		e = s / 5;
		s = s % 5;
		f = s / 1;
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d",a,b,c,d,e,f);
		return 0;
	}
}

