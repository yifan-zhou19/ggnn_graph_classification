package <missing>;

public class GlobalMembers
{
	public static void delend(String str)
	{
		int l;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		p = str;
		l = str.length();
		p = p + l - 1;
		switch (*p)
		{
		case 'r':

				*p = '\0';
				*(p - 1) = '\0';
				break;

		case 'y':

				*p = '\0';
				*(p - 1) = '\0';
				break;

		case'g':

				*p = '\0';
				*(p - 1) = '\0';
				*(p - 2) = '\0';
				break;
		}

	}
	public static int Main()
	{
		int n;
		int i;
		String str = new String(new char[50]);
		char[][] put = new char[50][50];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str = tempVar2.charAt(0);
			}
			delend(str);
			put[i] = str;
		}
		for (i = 0;i <= n - 2;i++)
		{
			System.out.printf("%s\n",put[i]);
		}
			System.out.printf("%s\n",put[n - 1]);
	}



}

