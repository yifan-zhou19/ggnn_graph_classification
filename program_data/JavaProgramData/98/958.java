package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int t = 0;
		for (int i = 0;i < n;i++)
		{
			s = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (t == 0)
			{
				System.out.printf("%s",s);
				t += s.length();
			}
			else
			{
				t += s.length() + 1;
				if (t <= 80)
				{
					System.out.printf(" %s",s);
				}
				else
				{
					System.out.printf("\n%s",s);
					t = s.length();
				}
			}
		}

		return 0;
	}
}

