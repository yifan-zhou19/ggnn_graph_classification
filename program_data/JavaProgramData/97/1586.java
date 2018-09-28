package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		b = a / 100;
		a = a - b * 100;
		System.out.printf("%d\n",b);
		b = a / 50;
		a = a - b * 50;
		System.out.printf("%d\n",b);
		b = a / 20;
		a = a - b * 20;
		System.out.printf("%d\n",b);
		b = a / 10;
		a = a - b * 10;
		System.out.printf("%d\n",b);
		b = a / 5;
		a = a - b * 5;
		System.out.printf("%d\n",b);
		System.out.printf("%d\n",a);
		return 0;
	}
}

