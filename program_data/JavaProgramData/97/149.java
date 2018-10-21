package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n >= 100)
		{
			System.out.printf("%d\n",(n / 100));
		}
		else
		{
			System.out.print("0\n");
		}

		a = n % 100;
		if (a >= 50)
		{
			System.out.printf("%d\n",a / 50);
			a = a % 50;
		}
		else
		{
			System.out.print("0\n");
		}
		if (a >= 20)
		{
			System.out.printf("%d\n",a / 20);
			a = a % 20;
		}
		else
		{
			System.out.print("0\n");
		}
		if (a >= 10)
		{
			System.out.printf("%d\n",a / 10);
			a = a % 10;
		}
		else
		{
			System.out.print("0\n");
		}
		if (a >= 5)
		{
			System.out.printf("%d\n",a / 5);
			a = a % 5;
		}
		else
		{
			System.out.print("0\n");
		}
		if (a <= 4)
		{
			System.out.printf("%d\n",a);

		}
		else
		{
			System.out.print("0");
		}





		return 0;
	}
}

