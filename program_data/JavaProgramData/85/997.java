package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		String sen = new String(new char[21]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			sen = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if ((sen.charAt(0) >= 'a' && sen.charAt(0) <= 'z') || (sen.charAt(0) >= 'A' && sen.charAt(0) <= 'Z') || sen.charAt(0) == '_')
			{
				for (i = 1;i < sen.length();i++)
				{
					if ((sen.charAt(i) >= 'a' && sen.charAt(i) <= 'z') || (sen.charAt(i) >= 'A' && sen.charAt(i) <= 'Z') || (sen.charAt(i) >= '0' && sen.charAt(i) <= '9') || sen.charAt(i) == '_')
					{
						continue;
					}
					else
					{
						System.out.print("no");
						System.out.print("\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
						goto lable;
					}
				}
				System.out.print("yes");
				System.out.print("\n");
			}
			else
			{
				System.out.print("no");
				System.out.print("\n");
			}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	lable:
	continue;
		}
		return 0;
	}
}

