package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[500][45];
		int n;
		int m = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			*(a + i) = ConsoleInput.readToWhiteSpace(true);
		}
		for (int i = 0;i < n - 1;i++)
		{
			System.out.print((a + i));
			m += String.valueOf(*(a + i)).length();
			if (m + 1 + String.valueOf(*(a + i + 1)).length() <= 80)
			{
				System.out.print(" ");
				m++;
			}
			else
			{
				System.out.print("\n");
				m = 0;
			}
		}
		System.out.print((a + n - 1));
		return 0;
	}
}

