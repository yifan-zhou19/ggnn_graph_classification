package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int[] s = new int[7];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		b = n / 100;
		System.out.printf("%d\n", b);
		a = (b == 0) ? n:(n % 100);
		b = a / 50;
		System.out.printf("%d\n", b);
		a = (b == 0) ? a:(a % 50);
		b = a / 20;
		System.out.printf("%d\n", b);
		a = (b == 0) ? a:(a % 20);
		b = a / 10;
		System.out.printf("%d\n", b);
		a = (b == 0) ? a:(a % 10);
		b = a / 5;
		System.out.printf("%d\n", b);
		a = (b == 0) ? a:(a % 5);
		System.out.printf("%d\n", a);
		return 0;
	}

}

