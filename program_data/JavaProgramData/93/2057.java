package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int tot = 0;
		int b = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if ((n % 3) == 0)
		{
			tot++;
		}
		if ((n % 5) == 0)
		{
			tot++;
		}
		if ((n % 7) == 0)
		{
			tot++;
		}
		if ((n % 3) == 0)
		{
			System.out.print("3");
			if (tot - 1 != 0)
			{
				System.out.print(' ');
				tot--;
			}
			b = 1;
		}
		if ((n % 5) == 0)
		{
			System.out.print("5");
			if (tot - 1 != 0)
			{
				System.out.print(' ');
				tot--;
			}
			b = 1;
		}
		if ((n % 7) == 0)
		{
			System.out.print("7");
			if (tot - 1 != 0)
			{
				System.out.print(' ');
				tot--;
			}
			b = 1;
		}
		if (b == 0)
		{
			System.out.print('n');
		}
		System.out.print('\n');
		return 0;
	}

}

