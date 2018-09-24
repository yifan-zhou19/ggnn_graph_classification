package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc1 = new String(new char[100]);
		String zfc2 = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zfc1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			zfc2 = tempVar2.charAt(0);
		}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1 = zfc1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p2 = zfc2;
		int judge = 1;
		int judge2 = 0;
		for (; * p1 != '\0';p1++)
		{
			judge2 = 0;
			for (p2 = zfc2; * p2 != '\0';p2++)
			{
				if (*p1 == *p2)
				{
					*p2 = ' ';
					judge2 = 1;
					break;
				}
			}
			if (judge2 != 1)
			{
				judge = 0;
				break;
			}
		}
		if (judge != 0 && zfc1.length() == zfc2.length())
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
		return 0;
	}
}

