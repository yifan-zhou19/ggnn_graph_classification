package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int flag;
		String s = new String(new char[50]);
		String w = new String(new char[50]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pw;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * ps;
		String pt;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		pw = w;
		for (i = 0;i < w.length();i = i + 1,pw = pw + 1)
		{
			ps = s;
			if (*ps == *pw)
			{
				pt = pw;
				for (j = 0;j < s.length();j = j + 1,ps = ps + 1,pw = pw + 1)
				{
					if (*ps == *pw)
					{
						flag = 1;
						continue;
					}
					else
					{
						pw = pt;
						flag = 0;
						break;
					}
				}
			}
			else
			{
				flag = 0;
			}
			if (flag == 1)
			{
				System.out.printf("%d\n",i);
				break;
			}
		}
	}

}

