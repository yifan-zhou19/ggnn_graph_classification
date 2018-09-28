package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[501]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int num = 0;
		int i;
		int j;
		int m;
		int len;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		len = a.length();
		for (i = 2;i <= len;i++)
		{
			for (p = a,j = 0;j <= len - i;j++,p++)
			{
				for (m = i - 1;m > 0;m -= 2,p++)
				{
					if (*p != *(p + m))
					{
						num = 1;
						break;
					}
				}
				if (num == 0)
				{
					for (p = a.charAt(j), m = 1;m <= i;m++, p++)
					{
					System.out.printf("%c",*p);
					}
					System.out.print("\n");
				}
				num = 0;
				p = a.charAt(j);
			}
		}
		return 0;
	}



}

