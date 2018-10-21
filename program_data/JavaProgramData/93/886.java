package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		b = 0;
		c = a % 3;
		if (c == 0)
		{
			b++;
		}
		c = a % 5;
		if (c == 0)
		{
			b = b + 2;
		}
		c = a % 7;
		if (c == 0)
		{
			b = b + 4;
		}
		switch (b)
		{
		case 7:
			System.out.print("3 5 7");
			break;
		case 6:
			System.out.print("5 7");
			break;
		case 5:
			System.out.print("3 7");
			break;
		case 4:
			System.out.print("7");
			break;
		case 3:
			System.out.print("3 5");
			break;
		case 2:
			System.out.print("5");
			break;
		case 1:
			System.out.print("3");
			break;
		case 0:
			System.out.print("n");
			break;
		}

	}

}

