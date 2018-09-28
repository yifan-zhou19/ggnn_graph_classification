package <missing>;

public class GlobalMembers
{
	//*****???????????*****
	//*****?????            *****
	//*****???2013.9.27        ****

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int sum = 0;
		if (n % 3 == 0)
		{
			sum = sum + 3;
		}
		if (n % 5 == 0)
		{
			sum = sum + 5;
		}
		if (n % 7 == 0)
		{
			sum = sum + 7;
		}
		switch (sum)
		{
			case 0:
				System.out.print("n");
				System.out.print("\n");
				break;
			case 3:
				System.out.print(3);
				System.out.print("\n");
				break;
			case 5:
				System.out.print(5);
				System.out.print("\n");
				break;
			case 7:
				System.out.print(7);
				System.out.print("\n");
				break;
			case 8:
				System.out.print("3 5");
				System.out.print("\n");
				break;
			case 10:
				System.out.print("3 7");
				System.out.print("\n");
				break;
			case 12:
				System.out.print("5 7");
				System.out.print("\n");
				break;
			case 15:
				System.out.print("3 5 7");
				System.out.print("\n");
				break;
			default:
				System.out.print("error");
				System.out.print("\n");
				break;
		}
		return 0;
	}

}

