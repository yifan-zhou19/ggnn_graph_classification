package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String str = new String(new char[81]);
		int rd;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (rd = 0;rd < n;rd++)
		{
			str = new Scanner(System.in).nextLine();
			p = str;
			for (;p < str.charAt(str.length());p++)
			{
				if (!(Check) && p == str)
				{
					System.out.print("0\n");
					break;
				}
				else
				{
					if (!(Check || (*p >= '0' && *p <= '9')))
					{
						System.out.print("0\n");
						break;
					}
					else if (p == str.charAt(str.length() - 1))
					{
						System.out.print("1\n");
					}
				}
			}
		}
		return 0;
	}
}

