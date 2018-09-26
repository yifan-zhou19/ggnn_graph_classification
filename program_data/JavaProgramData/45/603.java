package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int flag;
		String s = new String(new char[51]);
		String w = new String(new char[51]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * ps;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pw;
		String in;
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
		while (*pw != '\0')
		{
			in = pw;
			flag = 1;
			for (ps = s; * ps != '\0';pw++,ps++)
			{
				if (*pw != *ps)
				{
					flag = 0;
					pw = in;
					break;
				}
			}
			if (flag != 0)
			{
				System.out.printf("%d",in - w);
				break;
			}
			pw++;
		}
	}
}

