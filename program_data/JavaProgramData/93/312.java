package <missing>;

public class GlobalMembers
{
	public static int Main()

	{
		int n;
		int a;
		int b;
		int c;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = n % 3;
		b = n % 5;
		c = n % 7;
		if (a == 0 && b == 0 && c == 0)
		{
			t = 1;
		}
		if (a != 0 && b == 0 && c == 0)
		{
			t = 2;
		}
		if (a == 0 && b != 0 && c == 0)
		{
			t = 3;
		}
		if (a == 0 && b == 0 && c != 0)
		{
			t = 4;
		}
		if (a != 0 && b != 0 && c == 0)
		{
			t = 5;
		}
		if (a != 0 && b == 0 && c != 0)
		{
			t = 6;
		}
		if (a == 0 && b != 0 && c != 0)
		{
			t = 7;
		}
		if (a != 0 && b != 0 && c != 0)
		{
			t = 8;
		}
		switch (t)
		{
		case 1:
			System.out.print("3 5 7\n");
			break;
		case 2:
			System.out.print("5 7\n");
			break;
		case 3:
			System.out.print("3 7\n");
			break;
		case 4:
			System.out.print("3 5\n");
			break;
		case 5:
			System.out.print("7\n");
			break;
		case 6:
			System.out.print("5\n");
			break;
		case 7:
			System.out.print("3\n");
			break;
		case 8:
			System.out.print("n\n");
		}
		return 0;


	}
}

