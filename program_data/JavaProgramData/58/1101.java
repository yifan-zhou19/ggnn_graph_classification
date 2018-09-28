package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int l;
		int a;
		String s = new String(new char[81]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			a = 1;
			s = new Scanner(System.in).nextLine();
			l = s.length();
			for (p = s;p < s.Substring(l);p++)
			{
				if (p == s && ((*p >= 65 && *p <= 90) || (*p >= 97 && *p <= 122) || *p == 95))
				{
				}
				else if (p != s)
				{
					if ((*p >= 'a' && *p <= 'z') || (*p >= 'A' && *p <= 'Z') || *p == '_' || (*p >= '0' && *p <= '9'))
					{
					}
					else
					{
						a = 0;
						break;
					}
				}
				else
				{
					a = 0;
					break;
				}
			}
			System.out.printf("%d\n",a);
		}
		return 0;
	}
}

