package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		int a1;
		int a2;
		int a3;
		int a4;
		int a5;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		a1 = x / 10000;
		a2 = (x - 10000 * a1) / 1000;
		a3 = (x - 10000 * a1 - 1000 * a2) / 100;
		a4 = (x - 10000 * a1 - 1000 * a2 - 100 * a3) / 10;
		a5 = (x - 10000 * a1 - 1000 * a2 - 100 * a3 - 10 * a4) / 1;
		t = a1;
		a1 = a2;
		a2 = t;

		t = a1;
		a1 = a3;
		a3 = t;

		t = a1;
		a1 = a4;
		a4 = t;

		t = a1;
		a1 = a5;
		a5 = t;

		t = a2;
		a2 = a3;
		a3 = t;

		t = a2;
		a2 = a4;
		a4 = t;

		t = a2;
		a2 = a5;
		a5 = t;

		t = a3;
		a3 = a4;
		a4 = t;

		t = a3;
		a3 = a5;
		a5 = t;

		t = a4;
		a4 = a5;
		a5 = t;
		if (a1 * a2 * a3 * a4 * a5 != 0)
		{
		System.out.printf("%d%d%d%d%d\n",a1,a2,a3,a4,a5);
		}
		else if (a2 * a3 * a4 * a1 != 0)
		{
			System.out.printf("%d%d%d%d\n",a1,a2,a3,a4);
		}
		else if (a3 * a2 * a1 != 0)
		{
			System.out.printf("%d%d%d\n",a1,a2,a3);
		}
		else if (a2 * a1 != 0)
		{
			System.out.printf("%d%d\n",a1,a2);
		}
		else if (a1 != 0)
		{
			System.out.printf("%d\n",a1);
		}
		else
		{
			System.out.print("0");
		}
	}

}

