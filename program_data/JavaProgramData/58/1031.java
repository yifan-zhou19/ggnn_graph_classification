package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int l;
		int count;
		String sz = new String(new char[81]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		for (i = 1;i <= n;i++)
		{
			sz = new Scanner(System.in).nextLine();
			l = sz.length();
			p = sz;
			count = 0;
			if ((*p >= 'a' && *p <= 'z') || (*p >= 'A' && *p <= 'Z') || *p == '_')
			{
				for (p = sz.Substring(1);p < (sz.Substring(l));p++)
				{
					if ((*p >= 'a' && *p <= 'z') || (*p >= 'A' && *p <= 'Z') || *p == '_' || (*p >= '0' && *p <= '9'))
					{

					}
					else
					{
						count++;
					}
				}
			}
			else
			{
				count++;
			}
			if (count == 0)
			{
				System.out.print("1\n");
			}
			else
			{
				System.out.print("0\n");
			}
		}
			return 0;
	}
}

