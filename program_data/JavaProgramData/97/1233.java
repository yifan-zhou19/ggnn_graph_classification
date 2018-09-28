package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int s;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = Integer.parseInt(tempVar);
		}
		if (s / 100 != 0)
		{
			a = s / 100;
			s = s - (s / 100 * 100);
		}
		if (s / 50 != 0)
		{
			b = s / 50;
			s = s - (s / 50 * 50);
		}
		if (s / 20 != 0)
		{
			c = s / 20;
			s = s - (s / 20 * 20);
		}
		if (s / 10 != 0)
		{
			d = s / 10;
			s = s - (s / 10 * 10);
		}
		if (s / 5 != 0)
		{
			e = s / 5;
			s = s - (s / 5 * 5);
		}
		f = s;
		System.out.printf("%d\n",a);
		System.out.printf("%d\n",b);
		System.out.printf("%d\n",c);
		System.out.printf("%d\n",d);
		System.out.printf("%d\n",e);
		System.out.printf("%d\n",f);
		return 0;
	}

}

