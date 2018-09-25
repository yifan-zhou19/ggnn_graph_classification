package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String q;
		int i;
		p = a;
		q = a;
		for (i = 1;i <= 30;i++,p++)
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				p = tempVar.charAt(0);
			}
		if (*p == '\0')
		{
			break;
		}
		}
		for (i = 1;i <= 30;i++,q++)
		{
			if (q >= 48 && q <= 57)
			{
				System.out.printf("%c", q);
			}
			else if (*(q - 1) >= 48 && *(q - 1) <= 57)
			{
				System.out.print("\n");
			}
		}
		return 0;
	}
}

