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
		int a = money / 100;
		System.out.printf("%d\n",a);
		int b = (money - 100 * a) / 50;
		System.out.printf("%d\n",b);
		int c = (money - 100 * a - 50 * b) / 20;
		System.out.printf("%d\n",c);
		int d = (money - 100 * a - 50 * b - 20 * c) / 10;
		System.out.printf("%d\n",d);
		int e = (money - 100 * a - 50 * b - 20 * c - 10 * d) / 5;
		System.out.printf("%d\n",e);
		int f = money % 5;
		System.out.printf("%d",f);
		return 0;
	}

}

