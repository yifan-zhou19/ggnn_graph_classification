package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String c = new String(new char[81]);
		int t;
		int len;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		for (x = 0;x < n;x++)
		{
			c = new Scanner(System.in).nextLine();
			len = c.length();
			p = c;
			if (*p == '_' || ((*p) >= 65 && *p <= 90) || (*p >= 97 && *p <= 122))
			{
				t = 1;
				for (p = c.Substring(1);p < c.Substring(len);p++)
				{
					if (*p == '_' || (*p >= 65 && *p <= 90) || (*p >= 97 && *p <= 122) || (*p >= 48 && *p <= 57))
					{
						t = 1;
					}
					else
					{
						t = 0;
						break;
					}
				}
			}
			else
			{
				t = 0;
			}
			if (t == 1)
			{
			System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}
}

