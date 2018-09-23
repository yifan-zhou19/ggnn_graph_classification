package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String word = new String(new char[20]);
		String in = new String(new char[4]);
		//char temp[20];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String q;
		while ((word = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0 && (in = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			p = word;
			q = word;
			while (true)
			{
				if (*p == '\0')
				{
					break;
				}
				if (*p - q > 0)
				{
					q = p;
				}
				p++;
			}
			p = word;
			while (true)
			{
				if (*p == '\0')
				{
					System.out.print("\n");
					break;
				}
				System.out.print(p);
				if (p == q)
				{
					System.out.print(in.charAt(0));
					System.out.print(in.charAt(1));
					System.out.print(in.charAt(2));
				}
				p++;
			}
		}
		return 0;
	}
}

