package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n % 3 == 0)
		{
			System.out.print("3");
			i++;
		}
		if (n % 5 == 0)
		{
			if (i >= 1)
			{
				System.out.print(' ');
			}
			System.out.print("5");
			i++;
		}
		if (n % 7 == 0)
		{
			if (i >= 1)
			{
				System.out.print(' ');
			}
			System.out.print("7");
			i++;
		}
		if (i == 0)
		{
			System.out.print('n');
		}
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
	}
}

