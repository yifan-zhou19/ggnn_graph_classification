package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n % 3 == 0 && n % 5 == 0 && n % 7 == 0)
		{
			System.out.print("3 5 7");
		}

		else if (n % 3 != 0 && n % 5 == 0 && n % 7 == 0)
		{
			System.out.print("5 7");
		}

		else if (n % 3 == 0 && n % 5 != 0 && n % 7 == 0)
		{
			System.out.print("3 7");
		}

		else if (n % 3 == 0 && n % 5 == 0 && n % 7 != 0)
		{
			System.out.print("3 5");
		}

		else if (n % 3 == 0 && n % 5 != 0 && n % 7 != 0)
		{
			System.out.print("3");
		}

		else if (n % 3 != 0 && n % 5 == 0 && n % 7 != 0)
		{
			System.out.print("5");
		}

		else if (n % 3 != 0 && n % 5 != 0 && n % 7 == 0)
		{
			System.out.print("7");
		}

		else
		{
			System.out.print("n");
		}
	}

}

