package <missing>;

public class GlobalMembers
{
	public static void jiaogu(int n)
	{
		int k;
		if (n == 1)
		{
			System.out.print("End");
			return;
		}
		else
		{
			if (n % 2 == 0)
			{
				k = n / 2;
				System.out.print(n);
				System.out.print("/2=");
				System.out.print(k);
				System.out.print("\n");
				return jiaogu(k);
			}
			else
			{
				k = n * 3 + 1;
				System.out.print(n);
				System.out.print("*3+1=");
				System.out.print(k);
				System.out.print("\n");
				return jiaogu(k);
			}
		}

	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		jiaogu(n);
		return 0;
	}
}

