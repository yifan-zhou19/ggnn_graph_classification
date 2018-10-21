package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int x;
		int k;
		char[][] s = new char[100][100];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			k = 0;
			x = String.valueOf(s[i]).length();
			p = s[i];
			if ((*p != '_') && (*p < 'a' || *p>'z') && (*p < 'A' || *p>'Z'))
			{
				System.out.print("no\n");
				k = 1;
			}
			if (k == 0)
			{
			for (p = s[i] + 1;p < s[i] + x;p++)
			{
				if (((*p != '_') && (*p < 'a' || *p>'z')) && (*p < '0' || *p>'9') && (*p < 'A' || *p>'Z'))
				{
					System.out.print("no\n");
					k = 1;
					break;
				}
			}
			}
			if (k == 0)
			{
				System.out.print("yes\n");
			}
		}
	}

}

