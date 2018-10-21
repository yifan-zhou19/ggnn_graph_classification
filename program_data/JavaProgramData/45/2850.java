package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		w = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (int i = 0 ; ; i++)
		{
			for (int j = 0 ;;j++)
			{
				if (s.charAt(j) == 0)
				{
					System.out.print(i);
					return 0;
				}
				else if (s.charAt(j) != w.charAt(i + j))
				{
					break;
				}
			}
		}
	}
}

