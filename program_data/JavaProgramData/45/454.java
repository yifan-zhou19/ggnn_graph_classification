package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		String pin;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pmove;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * ps;
		String pw;
		int flag;
		ps = s;
		pw = w;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			ps = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			pw = tempVar2.charAt(0);
		}
		pmove = pw;
		while (*pmove++!='\0')
		{
			if (*pmove == *ps)
			{
				flag = 1;
				pin = pmove;
				while (*ps != '\0')
				{
					if (*pmove != *ps)
					{
						flag = 0;
						break;
					}
					ps++;
					pmove++;
				}
				if (flag != 0)
				{
					System.out.printf("%d",pin - pw);
					break;
				}
				pmove = pin;
				ps = s;
			}
		}
	}
}

