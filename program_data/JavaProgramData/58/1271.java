package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sz = new String(new char[81]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int n;
		int i;
		int m;
		int right;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 1;i <= n;i++)
		{
			sz = new Scanner(System.in).nextLine();
			m = sz.length();
			p = sz;
			right = 0;
			if (*p == '_' || (*p >= 'A' && *p <= 'Z') || (*p >= 'a' && *p <= 'z'))
			{
				for (p = sz;p < sz.Substring(m);p++)
				{
					if (*p == '_' || (*p >= 'A' && *p <= 'Z') || (*p >= 'a' && *p <= 'z') || (*p >= '0' && *p <= '9'))
					{
						right++;
					}
				}
				if (right == m)
				{
					System.out.print("1\n");
				}
				else
				{
					System.out.print("0\n");
				}
			}
			else
			{
				System.out.print("0\n");
			}
		}
		return 0;
	}

}

