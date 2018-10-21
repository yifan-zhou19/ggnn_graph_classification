package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int m;
		int w;
		String a = new String(new char[300]);
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
				a = tangible.StringFunctions.changeCharacter(a, i, tempVar2);
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p2;
		m = a.length();
		for (p1 = a;p1 < (a.Substring(m));p1++)
		{
			w = 1;
			for (p2 = a;p2 < p1;p2++)
			{
				if (*p2 == *p1)
				{
					w = 0;
					break;
				}
			}
			if (w == 1 && p1 == a)
			{
				System.out.printf("%d",*p1);
			}
			else if (w == 1 && p1 != a)
			{
			System.out.printf(",%d",*p1);
			}
		}
	}

}

