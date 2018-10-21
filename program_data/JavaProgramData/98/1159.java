package <missing>;

public class GlobalMembers
{
	/*1200012866 ???*/
	public static int Main()
	{
		int n;
		String a = new String(new char[50]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int count = a.length() + 1;
		System.out.print(a);
		for (int i = 0;i < n - 1;i++)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (count + a.length() <= 80)
			{
				System.out.print(' ');
				System.out.print(a);
				count += a.length() + 1;
			}
			else
			{
				System.out.print("\n");
				System.out.print(a);
				count = a.length() + 1;
			}
		}

		return 0;
	}
}

