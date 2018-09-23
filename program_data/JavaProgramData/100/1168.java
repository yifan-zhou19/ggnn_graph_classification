package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[300]);
		final String s2 = "abcdefghijklmnopqrstuvwxyz";
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * ps;
		int count;
		int i;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		int len = s1.length();
		for (ps = s2; * ps != '\0';ps++)
		{
			count = 0;
			for (i = 0;i < len;i++)
			{
				if (s1.charAt(i) == *ps)
				{
					count++;
				}
			}
			if (count != 0)
			{
				k++;
				System.out.printf("%c=%d\n",*ps,count);
			}

		}
		if (k == 0)
		{
			System.out.print("No");
		}
		return 0;
	}
}

