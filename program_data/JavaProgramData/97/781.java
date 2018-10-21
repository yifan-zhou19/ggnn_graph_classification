package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a1 = 0;
		int a2 = 0;
		int a3 = 0;
		int a4 = 0;
		int a5 = 0;
		int a6 = 0;
		int A1 = 0;
		int A2 = 0;
		int A3 = 0;
		int A4 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a1 = n / 100;
		A1 = n - a1 * 100;
		a2 = A1 / 50;
		A2 = A1 - a2 * 50;
		a3 = A2 / 20;
		A3 = A2 - a3 * 20;
		a4 = A3 / 10;
		A4 = A3 - a4 * 10;
		a5 = A4 / 5;
		a6 = A4 - a5 * 5;
		System.out.printf("%d\n",a1);
		System.out.printf("%d\n",a2);
		System.out.printf("%d\n",a3);
		System.out.printf("%d\n",a4);
		System.out.printf("%d\n",a5);
		System.out.printf("%d\n",a6);
		return 0;
	}

}

