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
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.out.printf("%d\n", n / 100);
		n %= 100;
		System.out.printf("%d\n", n / 50);
		n %= 50;
		System.out.printf("%d\n", n / 20);
		n %= 20;
		System.out.printf("%d\n", n / 10);
		n %= 10;
		System.out.printf("%d\n", n / 5);
		n %= 5;
		System.out.printf("%d\n", n / 1);
		n %= 1;
		return 0;
	}
}

