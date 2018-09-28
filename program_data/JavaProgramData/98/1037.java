package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] p = new char[1][20];
		p = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len = String.valueOfp.length();
		System.out.print(p);
		for (int i = 1;i < n;i++)
		{
			p = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (len + String.valueOfp.length() + 1 > 80)
			{
				System.out.print("\n");
				System.out.print(p);
				len = String.valueOfp.length();
			}
			else
			{
				System.out.print(' ');
				System.out.print(p);
				len += String.valueOfp.length() + 1;
			}
		}
		return 0;
	}
}

