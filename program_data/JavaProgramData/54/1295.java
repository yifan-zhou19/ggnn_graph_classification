package <missing>;

public class GlobalMembers
{
	public static int function(int n, int k, int last)
	{
		if (n == 1)
		{
			return (totalmember * last + k);
		}
		else
		{
			if (function(n - 1, k, last) % (totalmember - 1) == 0)
			{
				return (totalmember * function(n - 1, k, last) / (totalmember - 1) + k);
			}
			else
			{
				return (-k * (totalmember - 1));
			}
		}
	}
	public static int totalmember;
	public static int lastnumber;
	public static int Main()
	{
		int k;
		int i = 1;
		totalmember = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		lastnumber = 0;
		while (i != 0)
		{
			lastnumber++;
			if (function(totalmember, k, lastnumber) != -k * (totalmember - 1))
			{
				System.out.print(function(totalmember, k, lastnumber));
				System.out.print("\n");
				i--;
			}
		}
	}
}

