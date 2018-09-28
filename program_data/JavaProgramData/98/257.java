package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[300][40];
		int i = 0;
		int n;
		int words = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		do
		{
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			i++;
		} while (i < n);
		for (i = 0;i < n;i++)
		{
			words = words + String.valueOf(a[i]).length() + 1;
			if (i != n - 1)
			{
				if (words + String.valueOf(a[i + 1]).length() <= 80)
				{
					System.out.print(a[i]);
					System.out.print(" ");
				}
				else
				{
					System.out.print(a[i]);
					System.out.print("\n");
					words = 0;
				}
			}
			if (i == n - 1)
			{
				System.out.print(a[i]);
			}
		}
		return 0;
	}
}

