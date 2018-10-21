package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String a = "";
		final String b = "";
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p2;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		p = b;
		p1 = a;
		for (; * p != '\0';p = p + 1)
		{
			if (*p == *p1)
			{
				p2 = p;
				for (; * p1 != '\0';p1 = p1 + 1,p2 = p2 + 1)
				{
					if (*p1 == *p2)
					{
						continue;
					}
					else
					{
						break;
					}
				}
				if (*p1 == '\0')
				{
					System.out.printf("%d",k);
					break;
				}
				p1 = a;
			}
			else
			{
				k++;
			}
		}
	}
}

