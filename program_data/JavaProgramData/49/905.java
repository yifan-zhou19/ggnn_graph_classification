package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[500]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int i;
		int l;
		int j;
		int k;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		l = s.length();
		for (i = 2;i < l + 1;i++)
		{
		for (j = 0;j <= l - i;j++)
		{
		k = 0;
		m = i - 1;
		for (p = s.Substring(j);p < s.Substring(j) + i;p++)
		{
		if (*p != *(p + m))
		{
			k++;
		}
		m = m - 2;
		}
		if (k == 0)
		{
		for (p = s.Substring(j);p < s.Substring(j) + i;p++)
		{
		System.out.printf("%c",*p);
		}
		System.out.print("\n");
		}
		}
		}
		return 0;
	}
}

