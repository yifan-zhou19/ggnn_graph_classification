package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int money;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			money = Integer.parseInt(tempVar);
		}
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		a = money / 100;
		b = money % 100 / 50;
		c = money % 50 / 20;
		d = (money % 50 - c * 20) / 10;
		e = money % 10 / 5;
		f = money % 10 - e * 5;
		System.out.printf("%d\n",a);
		System.out.printf("%d\n",b);
		System.out.printf("%d\n",c);
		System.out.printf("%d\n",d);
		System.out.printf("%d\n",e);
		System.out.printf("%d\n",f);
	}

}

