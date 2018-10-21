package <missing>;

public class GlobalMembers
{
	public static void ji(int shu)
	{
		int m;
		m = shu * 3 + 1;
		System.out.print(shu);
		System.out.print("*3+1=");
		System.out.print(m);
		System.out.print("\n");
		void ou(int shu);
		if (m % 2 == 1)
		{
			ji(m);
		}
		else
		{
			ou(m);
		}
	}

	public static void ou(int shu)
	{
		int m;
		m = shu / 2;
		System.out.print(shu);
		System.out.print("/2=");
		System.out.print(m);
		System.out.print("\n");
		if (m == 1)
		{
			System.out.print("End");
		}
		else
		{
		if (m % 2 == 1)
		{
			ji(m);
		}
		else
		{
			ou(m);
		}
		}
	}

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (n == 1)
			{
				System.out.print("End");
			}
			else
			{
		if (n % 2 == 1)
		{
			ji(n);
		}
		else
		{
			ou(n);
		}
			}
	}
}

