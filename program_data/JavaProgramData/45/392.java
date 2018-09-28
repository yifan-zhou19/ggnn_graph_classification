package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s1 = new String(new char[51]);
		String s2 = new String(new char[51]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p2;
		int a;
		int n;
		a = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		n = s1.length();
		for (p2 = s2;(*p2) != '\0';p2++)
		{
			for (p1 = s1;(*p1) != '\0';p1++)
			{
				if ((*p1) == (*p2))
				{
					p2++;
					a = p2 - s2 - n;
				}
				else
				{
					break;
				}

			}
			if (a != 0)
			{
				break;
			}

		}
		System.out.printf("%d",a);

	}

}

