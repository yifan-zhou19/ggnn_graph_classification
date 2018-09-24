package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sz = new String(new char[81]);
		int i;
		int n;
		int judge;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			judge = 0;
			if (i == 0)
			{
				System.in.read();
			}
			sz = new Scanner(System.in).nextLine();

//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			char * p;

			for (p = sz;p < sz + sz.length();p++)
			{
				if (p == sz)
				{
					if ((*p >= 'A' && *p <= 'Z') || (*p >= 'a' && *p <= 'z') || *p == '_')
					{
						judge = 1;
					}
					else
					{
						break;
					}
				}
				else
				{
					if ((*p >= 'A' && *p <= 'Z') || (*p >= 'a' && *p <= 'z') || (*p >= '0' && *p <= '9') || *p == '_')
					{
						judge = 1;
					}
					else
					{
						judge = 0;
						break;
					}
				}
			}

		System.out.printf("%d\n",judge);

		}

		return 0;
	}


}

