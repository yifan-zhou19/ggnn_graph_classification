package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String a = "";
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		p = a.charAt(0)[0],q = a.charAt(1)[0];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			q = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p = tempVar2.charAt(0);
		}
		int n = q.length();
		int flag = 0;
		for (; * p != '\0';p++)
		{
			while (*p != *q && *p != '\0')
			{
				p += 1;
			}
			flag = 1;
			while (*(q + 1) != '\0')
			{
				p += 1;
				q += 1;
				if (*p != *q)
				{
					flag = 0;
					break;
				}
			}
			if (flag == 1)
			{
				System.out.printf("%d", p - a.charAt(0)[0] - n + 1);
				break;
			}
		}
	}
}

