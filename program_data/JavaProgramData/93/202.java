package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n % 3 == 0)
		{
		a = 3;
		}
		else
		{
		a = 0;
		}
		if (n % 5 == 0)
		{
		b = 5;
		}
		else
		{
		b = 0;
		}
		if (n % 7 == 0)
		{
		c = 7;
		}
		else
		{
		c = 0;
		}
		sum = a + b + c;
		switch (sum)
		{
		case 0:
			System.out.print("n");
			break;
		case 7:
			System.out.print("7");
			break;
		case 5:
			System.out.print("5");
			break;
		case 3:
			System.out.print("3");
			break;
		case 12:
			System.out.print("5 7");
			break;
		case 8:
			System.out.print("3 5");
			break;
		case 10:
			System.out.print("3 7");
			break;
		case 15:
			System.out.print("3 5 7");
			break;
		return 0;
		}
	}

}

