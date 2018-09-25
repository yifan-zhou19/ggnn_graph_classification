package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String s = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	char * m;
	int i;
	int p;
	for (i = 1;i <= n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		for (m = s; * m != '\0';m++)
		{
			if (m == s)
			{
				if ((*m == '_') || (*m >= 'A' && *m <= 'Z') || (*m >= 'a' && *m <= 'z'))
				{
					p = 1;
				}
				else
				{
					p = 0;
					break;
				}
			}
			else
			{
				if ((*m == '_') || (*m >= 'A' && *m <= 'Z') || (*m >= 'a' && *m <= 'z') || (*m >= '0' && *m <= '9'))
				{
					p = 1;
				}
				else
				{
					p = 0;
					break;
				}
			}
		}
		if (p == 1)
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

