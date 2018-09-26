package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int suffixlen;
		String word = new String(new char[40]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word = tempVar2.charAt(0);
			}
			for (p = word; * p;p++)
			{
				;
			}
			switch (*(p - 1))
			{
				case'r':
				suffixlen = 2;
				break;
				case'y':
				suffixlen = 2;
				break;
				case'g':
				suffixlen = 3;
				break;
			}
			*(p - suffixlen) = '\0';
			System.out.printf("%s\n",word);
		}
			return 0;
	}
}

