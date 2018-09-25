package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		i = 0;

		if (x % 3 == 0)
		{
			System.out.print("3");
		}
		else
		{
			i++;
		}

		if (x % (3 * 5) == 0)
		{
			System.out.print(" ");
		}

		if (x % 5 == 0)
		{
			System.out.print("5");
		}
		else
		{
			i++;
		}

		if (x % (5 * 7) == 0)
		{
			System.out.print(" ");
		}

		if (x % (3 * 7) == 0 && x % 5 != 0)
		{
			System.out.print(" ");
		}

		if (x % 7 == 0)
		{
			System.out.print("7");
		}
		else
		{
			i++;
		}

		if (i == 3)
		{
			System.out.print("n");
		}
	}
}

