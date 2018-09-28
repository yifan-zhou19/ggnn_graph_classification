package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int t;
		i = 0;
		j = 0;
		k = 0;
		t = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n % 3 == 0)
		{
			i = 1;
		}
		if (n % 5 == 0)
		{
			j = 1;
		}
		if (n % 7 == 0)
		{
			k = 1;
		}
		t = i + j + k;
		if (t == 0)
		{
			System.out.print("n");
			System.out.print("\n");
		}
		if (t == 1)
		{
			if (i == 1)
			{
				System.out.print(3);
				System.out.print("\n");
			}
			if (j == 1)
			{
				System.out.print(5);
				System.out.print("\n");
			}
			if (k == 1)
			{
				System.out.print(7);
				System.out.print("\n");
			}
		}
		if (t == 2)
		{
			if (i == 0)
			{
				System.out.print("5 7");
				System.out.print("\n");
			}
			if (j == 0)
			{
				System.out.print("3 7");
				System.out.print("\n");
			}
			if (k == 0)
			{
				System.out.print("3 5");
				System.out.print("\n");
			}
		}
		if (t == 3)
		{
			System.out.print("3 5 7");
			System.out.print("\n");
		}
		return 0;
	}

}

