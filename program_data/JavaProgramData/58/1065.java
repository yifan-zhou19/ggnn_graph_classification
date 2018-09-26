package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		String a = new String(new char[81]);
		a = new Scanner(System.in).nextLine();
		n = Integer.parseInt(a);
		for (i = 1;i <= n;i++)
		{
			int j = 0;
			a = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			char * p = a;
			String q;
			q = p;
			for (p = q; * p != '\0';p++)
			{
				if (p == q)
				{
					if (*p == '_' || ((*p >= 'a' && *p <= 'z') || (*p >= 'A' && *p <= 'Z')))
					{
						j = 1;
					}
					else
					{
						j = 0;
						break;
					}
				}
				else
				{
					if (*p == '_' || ((*p >= 'a' && *p <= 'z') || (*p >= 'A' && *p <= 'Z')) || (*p >= '0' && *p <= '9'))
					{
						j = 1;
					}
					else
					{
						j = 0;
						break;
					}
				}
			}
			System.out.printf("%d\n",j);
		}
		return 0;
	}
}
