package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] str = new char[100][200];
		int i;
		for (i = 0;i < n;i++)
		{
			str[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			char * p;
			int k = 1;
			p = str[i][0];
			if (('A' <= *p && *p <= 'Z') || ('a' <= *p && *p <= 'z') || *p == '_')
			{
				for (p = p + 1; * p != '\0' && k == 1;p++)
				{
					if (('A' <= *p && *p <= 'Z') || ('a' <= *p && *p <= 'z') || *p == '_' || ('0' <= *p && *p <= '9'))
					{
						k = 1;
					}
					else
					{
						k = 0;
					}
				}
			}
			else
			{
				k = 0;
			}
			System.out.printf("%d\n",k);
		}
	}
}

