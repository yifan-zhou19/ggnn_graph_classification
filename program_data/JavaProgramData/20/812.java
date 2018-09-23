package <missing>;

public class GlobalMembers
{
	public static void setin(String a, String b)
	{
		int i;
		int stop = 0;
		int max;
		max = (int)a[0];
		for (i = 0; !a[i].equals('\0');i++)
		{
			if ((int)a[i] > max)
			{
				max = (int)a[i];
				stop = i;
			}
		}
		for (i = 0; !a[i].equals('\0');i++)
		{
			if (i == stop)
			{
				System.out.print(a[i]);
				System.out.print(b);
			}
			else
			{
				System.out.print(a[i]);
			}
		}
		System.out.print("\n");
	}
	public static int Main()
	{
		final String a = "";
		final String b = "";
		while ((a = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0 && (b = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			setin(a, b);
		}
		return 0;
	}
}

