package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int a = 0;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		b = n;
		if (b == 10000)
		{
			System.out.print("00001");
		}
		else
		{
		do
		{
		a = a * 10 + n % 10;
		n = n / 10;
		}while (n != 0);
		if (b % 10 == 0 && b != 0)
		{
			System.out.print("0");
		}
		if (b % 100 == 0 && b != 0)
		{
			System.out.print("0");
		}
		if (b % 1000 == 0 && b != 0)
		{
			System.out.print("0");
		}
		System.out.printf("%d\n",a);
		}
	}
}

