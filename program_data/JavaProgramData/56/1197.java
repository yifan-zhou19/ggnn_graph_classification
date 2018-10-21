package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String str = new String(new char[10]);
		str = String.format("%d", n);
		m = str.length();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		p = str;
		for (p = str.Substring(m) - 1;p >= str;p--)
		{
			System.out.printf("%c",*p);
		}
	}
}

