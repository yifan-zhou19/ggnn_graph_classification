package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b1;
		int b2;
		int b3;
		int b4;
		int b5;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		b1 = a / 10000;
		b2 = a / 1000 - 10 * b1;
		b3 = a / 100 - 100 * b1 - 10 * b2;
		b4 = a / 10 - 1000 * b1 - 100 * b2 - 10 * b3;
		b5 = a - 10000 * b1 - 1000 * b2 - 100 * b3 - 10 * b4;
		if (b1 != 0)
		{
		System.out.print("00001");
		}
		else if (b2 != 0)
		{
		System.out.printf("%d%d%d%d",b5,b4,b3,b2);
		}
		else if (b3 != 0)
		{
		System.out.printf("%d%d%d",b5,b4,b3);
		}
		else if (b4 != 0)
		{
		System.out.printf("%d%d",b5,b4);
		}
		else
		{
			System.out.printf("%d",b5);
		}
	}
}

