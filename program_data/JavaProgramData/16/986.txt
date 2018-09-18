package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc((Character.SIZE / Byte.SIZE) * 8);
		int i;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				p = tempVar.charAt(0);
			}
			if (*p == '\n')
			{
				*p = 0;
				break;
			}
			p++;
		}
		for (i = i - 1;i >= 0;i--)
		{
			p--;
			System.out.printf("%c", *p);
		}
		return 0;
	}
}

