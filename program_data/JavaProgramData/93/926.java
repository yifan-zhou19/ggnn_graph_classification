package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int count = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n % 3 == 0)
		{
		count++;
		}
		if (n % 5 == 0)
		{
		count++;
		}
		if (n % 7 == 0)
		{
		count++;
		}
		switch (count)
		{
			   case 0:
					System.out.print('n');
					break;
			   case 1:
			   {
					if (n % 3 == 0)
					{
					System.out.print(3);
					}
					if (n % 5 == 0)
					{
					System.out.print(5);
					}
					if (n % 7 == 0)
					{
					System.out.print(7);
					}
					break;
			   }
			   case 2:
			   {
					if (n % 3 != 0)
					{
					System.out.print(5);
					System.out.print(' ');
					System.out.print(7);
					}
					if (n % 5 != 0)
					{
					System.out.print(3);
					System.out.print(' ');
					System.out.print(7);
					}
					if (n % 7 != 0)
					{
					System.out.print(3);
					System.out.print(' ');
					System.out.print(5);
					}
					break;
			   }
			   case 3:
					System.out.print(3);
					System.out.print(' ');
					System.out.print(5);
					System.out.print(' ');
					System.out.print(7);
					break;
		}
		return 0;
	}
}

