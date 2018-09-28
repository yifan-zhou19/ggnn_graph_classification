package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String first = new String(new char[50]);
		String second = new String(new char[50]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		int i;
		int court;
		p = first;
		q = second;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			q = tempVar2.charAt(0);
		}
		for (i = 0; * q != '\0';i++,q++)
		{
			if (*q == *p)
			{
				p++;
			}
			else
			{
				p = first;
			}
			if (*p == '\0')
			{
				court = i;
				break;
			}
		}
		System.out.printf("%d\n",court - first.length() + 1);
		return 0;
	}
}

