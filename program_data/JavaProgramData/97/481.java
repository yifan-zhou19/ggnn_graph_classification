package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		System.out.printf("%d\n",a / 100);
		a %= 100;
		System.out.printf("%d\n",a / 50);
		a %= 50;
		System.out.printf("%d\n",a / 20);
		a %= 20;
		System.out.printf("%d\n",a / 10);
		a %= 10;
		System.out.printf("%d\n",a / 5);
		a %= 5;
		System.out.printf("%d\n",a);
		return 0;
	}
}

