package <missing>;

public class GlobalMembers
{
	public static char[][] st = new char[50][33];
	public static String src = new String(new char[33]);
	public static int n;
	public static int i;
	public static void del()
	{
		char[] str1 = {'e', 'r', '\0'};
		char[] str2 = {'l', 'y', '\0'};
		char[] str3 = {'i', 'n', 'g', '\0'};
		String str = new String(new char[4]);
		int len;
		len = String.valueOf(st[i]).length();
		str = st[i] + len - 2;
		if (strcmp(str1,str) == 0)
		{
			src = String.valueOf(st[i]).substring(0, len - 2);
		}
		else if (strcmp(str2,str) == 0)
		{
			src = String.valueOf(st[i]).substring(0, len - 2);
		}
		else
		{
			str = st[i] + len - 2;
			if (strcmp(str3,str) == 0)
			{
				;
			}
			src = String.valueOf(st[i]).substring(0, len - 3);
		}
		return;
	}
	public static int Main()
	{
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
			 st[i] = tempVar2.charAt(0);
		 }
		 del();
		 System.out.printf("%s\n",src);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		 memset(src,0,20);
		}
		return 0;
	}
}

