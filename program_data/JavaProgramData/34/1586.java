package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = n;
		if (n == 1)
		{
			System.out.print("End");
			System.out.print("\n");
		}
		else
		{
		for (;m != 1;)
		{
			if (n % 2 == 1)
			{
			n = m * 3 + 1;
			System.out.print(m);
			System.out.print("*3+1=");
			System.out.print(n);
			System.out.print("\n");
			m = n;
			}
			else
			{
				n = m / 2;
			System.out.print(m);
			System.out.print("/2=");
			System.out.print(n);
			System.out.print("\n");
			m = n;
			}
		}
		System.out.print("End");
		System.out.print("\n");
		}
		return 0;
	}
}

