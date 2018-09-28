package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		int n = 0;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if ((num % 3) == 0)
		{
			n = 1;
			System.out.print(3);
		}
		if ((num % 5) == 0)
		{
			  if (n != 0)
			  {
				  System.out.print(' ');
			  }
			  n = 1;
			  System.out.print(5);
		}
		if ((num % 7) == 0)
		{
			  if (n != 0)
			  {
				  System.out.print(' ');
			  }
			  n = 1;
			  System.out.print(7);
		}
		if (n == 0)
		{
			System.out.print('n');
		}
		System.in.read();
		System.in.read();
		return 0;

	}
}

