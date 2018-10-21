package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char c;
		int dd1;
		int dd;
		int max;
		int max1;
		int i;
		int j;
		int k;
		int n;
		int a1;
		int a2;
		int a3;
		dd = 1;
		max = 0;
		max1 = 0;
		dd1 = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		max = n;
			c = System.in.read();
		if (c == EOF || c == '\n')
		{
			dd = 0;
		}
		while ((dd = 1) != 0)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (n > max)
			{
				max1 = max;
				max = n;
				dd1 = 1;
			}
			if (n < max && n> max1)
			{
				max1 = n;
				dd1 = 1;
			}
			c = System.in.read();
			if (c == EOF || c == '\n')
			{
				break;
			}
		}
		if (dd1 == 1)
		{
			System.out.print(max1);
		}
		if (dd1 == 0)
		{
			System.out.print("No");
		}
		return 0;

	}

}

