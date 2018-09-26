package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int l;
		String str = new String(new char[256]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			str = ConsoleInput.readToWhiteSpace(true).charAt(0);
			l = str.length();
			for (p = str; p < str.Substring(l); p++)
			{
				if (*p == 'A')
				{
					System.out.print('T');
				}
				else if (*p == 'T')
				{
					System.out.print('A');
				}
				else if (*p == 'C')
				{
					System.out.print('G');
				}
				else
				{
					System.out.print('C');
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}

