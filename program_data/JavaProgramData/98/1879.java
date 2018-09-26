package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int s;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] a = new char[n][20];
		String p = a[0];
		for (int i = 0;i < n;i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		s = String.valueOf(a[0]).length();
		System.out.print(a[0]);
		for (int i = 1;i < n;i++)
		{
			s += String.valueOf(a[i]).length() + 1;
			if (s <= 80)
			{
				System.out.print(" ");
				System.out.print((p.Substring(i) * 20));
			}
			else
			{
				System.out.print("\n");
				System.out.print((p.Substring(i) * 20));
				s = String.valueOf(a[i]).length();
			}
		}
	}
}

