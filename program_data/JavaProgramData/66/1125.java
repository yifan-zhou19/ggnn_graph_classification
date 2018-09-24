package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int i;
		int d;
		int sum = 0;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = a % 400;
		if (a == 0)
		{
			a = 400;
		}
		for (i = 1;i < a;i++)
		{
			if ((i % 400 == 0) || (i % 4 == 0 && i % 100 != 0))
			{
				sum = sum + 2;
			}
			else
			{
				sum++;
			}
		}
		for (i = 1;i < b;i++)
		{
			switch (i)
			{
			case 1:
				sum = sum + 3;
				break;
			case 3:
				sum = sum + 3;
				break;
			case 5:
				sum = sum + 3;
				break;
			case 7:
				sum = sum + 3;
				break;
			case 8:
				sum = sum + 3;
				break;
			case 10:
				sum = sum + 3;
				break;
			case 12:
				sum = sum + 3;
				break;
			case 4:
				sum = sum + 2;
				break;
			case 6:
				sum = sum + 2;
				break;
			case 9:
				sum = sum + 2;
				break;
			case 11:
				sum = sum + 2;
				break;
			default:
				break;
			}
		}
		if (b > 2 && (a % 400 == 0) || (a % 4 == 0 && a % 100 != 0))
		{
			sum++;
		}
		sum = sum + c;
		d = sum % 7;
		switch (d)
		{
			case 1:
				System.out.print("Mon.");
				break;
			case 2:
				System.out.print("Tue.");
				break;
			case 3:
				System.out.print("Wed.");
				break;
			case 4:
				System.out.print("Thu.");
				break;
			case 5:
				System.out.print("Fri.");
				break;
			case 6:
				System.out.print("Sat.");
				break;
			default:
				System.out.print("Sun.");
				break;
		}
		return 0;
	}

}

