package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int temp;
		String s = new String(new char[21]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			s = ConsoleInput.readToWhiteSpace(true).charAt(0);
			temp = 0;
			if ((s.charAt(0) != '_') && ((s.charAt(0) > 'z') || (s.charAt(0) < 'a')) && ((s.charAt(0) < 'A') || (s.charAt(0)>'Z')))
			{
				System.out.print("no");
				System.out.print("\n");
				continue;
			}
			for (j = 1; j < s.length(); j++)
			{
				if ((s.charAt(j) != '_') && ((s.charAt(j) > 'z') || (s.charAt(j) < 'a')) && ((s.charAt(j) < 'A') || (s.charAt(j)>'Z')) && ((s.charAt(j) < '0') || (s.charAt(j)>'9')))
				{
					System.out.print("no");
					System.out.print("\n");
					temp = 1;
					break;
				}
			}
			if (temp == 0)
			{
				System.out.print("yes");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

