package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String s = new String(new char[LEN]);
		String a = new String(new char[5]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int n;
		int i;
		int ct;
		a = new Scanner(System.in).nextLine();
		n = Integer.parseInt(a);
		for (i = 0;i < n;i++)
		{
			s = new Scanner(System.in).nextLine();
			ct = 0;
			p = s;
			if ((*p >= 'a' && *p <= 'z') || (*p >= 'A' && *p <= 'Z') || *p == '_')
			{
				p++;
				while (*p != 0)
				{
					if ((*p >= '0' && *p <= '9') || (*p >= 'a' && *p <= 'z') || (*p >= 'A' && *p <= 'Z') || *p == '_')
					{
						p++;
					}
					else
					{
						ct++;
						break;
					}
				}
			}
			else
			{
				ct++;
			}
			if (ct < 1)
			{
				System.out.print("1\n");
			}
			else
			{
				System.out.print("0\n");
			}
		}
	}
}
