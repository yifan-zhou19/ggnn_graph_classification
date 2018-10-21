package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		int n;
		int k;
		int m;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			s = ConsoleInput.readToWhiteSpace(true).charAt(0);
			for (j = 0;s.charAt(j) != '\0';j++)
			{
				if (j == 0)
				{
					if (s.charAt(j) == '_' || (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') || (s.charAt(j) >= 'a' && s.charAt(j) <= 'z'))
					{
					continue;
					}
					else
					{
						System.out.print("no");
						System.out.print("\n");
						break;
					}
				}
				if (j > 0)
				{
					if (s.charAt(j) == '_' || (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') || (s.charAt(j) >= 'a' && s.charAt(j) <= 'z') || (s.charAt(j) >= '0' && s.charAt(j) <= '9'))
					{
					if (s.charAt(j + 1) == '\0')
					{
						System.out.print("yes");
						System.out.print("\n");
					}
					continue;
					}
					else
					{
						System.out.print("no");
						System.out.print("\n");
						break;
					}
				}
			}
		}
		return 0;
	}

}

