package <missing>;

public class GlobalMembers
{
	public static int f(String a)
	{
		int len;
		int count = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		len = a.length();
		for (p = a;p < (a + len);p++)
		{
			if ((*p >= 'A' && *p <= 'Z') || (*p >= 'a' && *p <= 'z') || (*p >= '0' && *p <= '9') || (*p == '_'))
			{
				count++;
			}
		}


			if ((count == len) && (((a[0].compareTo('A') >= 0 && *p <= 'Z') || (a[0].compareTo('a') >= 0 && *p <= 'z')) || a[0].equals('_')))
			{
			   return (1);
			}
			else
			{
			   return (0);
			}

	}
	public static void Main()
	{
		int n;
		int i;
		String a = new String(new char[30]);
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
				a = tempVar2.charAt(0);
			}
			if (f(a) == 1)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
		}
	}
}

