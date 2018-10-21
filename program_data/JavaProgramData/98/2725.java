package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int length = 0;
		int l;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] a = new char[1000][40];
		for (int i = 0;i < n;i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		for (int i = 0;i < n;i++)
		{
			l = String.valueOf(a[i]).length();
			if (i == n - 1)
			{
				System.out.print(a[i]);
				System.out.print("\n");
			break;
			}
			if (length + l + 1 + String.valueOf(a[i + 1]).length() <= 80)
			{
				System.out.print(a[i]);
				System.out.print(' ');
				length += l + 1;
			}
			else
			{
				System.out.print(a[i]);
				System.out.print("\n");
				length = 0;
			}

		}








		return 0;
	}
}

