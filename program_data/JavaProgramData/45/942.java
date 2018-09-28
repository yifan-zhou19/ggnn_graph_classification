package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int b;
		int a;
		String s1 = new String(new char[50]);
		String s2 = new String(new char[50]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * ps1 = s1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * ps2 = s2;
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
		int l1 = s1.length();
		int l2 = s2.length();
		for (a = 0, b = 0;a < l2 && b == 0;a += i + 1)
		{
			for (i = a; * ps1 != *ps2 && *ps1 != '\0' && *ps2 != '\0';ps2++, i++)
			{
				;
			}
			for (j = 0, b = 1; * ps1 != '\0' && *ps2 != '\0';ps1++, ps2++, j++)
			{
				if (*ps1 != *ps2 && (j + 1) < l1)
				{
					b = 0;
					break;
				}
			}
		}
		System.out.printf("%d",i);
		return 0;
	}

}

