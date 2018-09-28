package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		if (m % 3 * m % 5 * m % 7 == 0)
		{
			if (m % 3 == 0 && m % 5 * m % 7 == 0)
			{
			System.out.print("3 ");
			}
			if (m % 3 == 0 && m % 5 * m % 7 != 0)
			{
				System.out.print("3");
			}
		if (m % 5 == 0 && m % 7 == 0)
		{
			 System.out.print("5 ");
		}
		if (m % 5 == 0 && m % 7 != 0)
		{
			System.out.print("5");
		}
		if (m % 7 == 0)
		{
			System.out.print("7\n");
		}
		}
		else
		{
			System.out.print("n\n");
		}
	}
}

