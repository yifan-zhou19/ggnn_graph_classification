package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String a = new String(new char[82]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read(); //????
		for (i = 1 ; i <= n ; i++)
		{
			p = a;
			a = new Scanner(System.in).nextLine(); //??
			for (j = 0 ; j < a.length() ; j++, p++)
			{
				if (*p == '_' || (*p >= 'a' && *p <= 'z') || (*p >= 'A' && *p <= 'Z')) //????????ok
				{
					continue;
				}
				if (j != 0 && *p >= '0' && *p <= '9') //?????????
				{
					continue;
				}
				break;
			}
			if (j == a.length())
			{
				System.out.print("1");
				System.out.print("\n");
			}
			else
			{
				System.out.print("0");
				System.out.print("\n");
			}
		}
		return 0;
	}


}

