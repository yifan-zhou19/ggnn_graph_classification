package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] l = new char[n][20];
		for (int i = 0;i < n;i++)
		{
			l[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		int len = 0;
		for (int i = 0;i < n;i++)
		{
			if (len + String.valueOf(l[i]).length() >= 80)
			{
				System.out.print("\n");
				System.out.print(l[i]);
				len = String.valueOf(l[i]).length();
			}
			else if (len == 0)
			{
				System.out.print(l[i]);
				len += String.valueOf(l[i]).length();
			}
			else
			{
				System.out.print(' ');
				System.out.print(l[i]);
				len += String.valueOf(l[i]).length() + 1;
			}
		}
		return 0;
	}
}

