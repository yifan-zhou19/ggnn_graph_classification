package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		char[][] a = new char[100][21];
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
				a[i] = tempVar2.charAt(0);
			}
			p = a[i];

			while (*p != '\0')
			{
				if (a[i][0] >= '0' && a[i][0] <= '9')
				{
					System.out.print("no\n");
					break;
				}
				if ((*p >= '0' && *p <= '9') || (*p >= 'a' && *p <= 'z') || (*p >= 'A' && *p <= 'Z') || *p == '_')
				{
					p++;
				}
				else
				{
					System.out.print("no\n");
					break;
				}
				if (*p == '\0')
				{
					System.out.print("yes\n");
				}
			}

		}
		return 0;
	}
}

