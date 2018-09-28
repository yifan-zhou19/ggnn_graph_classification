package <missing>;

public class GlobalMembers
{
	public static void sub(String common, String minlen, int n, int now)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * a;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * b;
		for (a = common,b = minlen + now;a < common + n;a++,b++)
		{
			*a = b;
		}
		*a = '\0';
	}
	public static int compare(String a, int n)
	{
		int i;
		int flag = 1;
		for (i = 0;i < a.length() / 2;i++)
		{
			if (!a[i].equals(a[a.length() - i - 1]))
			{
				flag = 0;
				break;
			}
		}
		return flag;
	}
	public static int Main()
	{
		void sub(char common[],char minlen[],int n,int now);
		int compare = new int(char a[],int n);
		String str = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		int i;
		int j;
		if (str.length() > 1)
		{
			for (i = 2;i <= str.length();i++)
			{
				for (j = 0;j < str.length() - i + 1;j++)
				{
					String substr = new String(new char[500]);
					sub(substr, str, i, j);
					if (compare(substr, i) == 1)
					{
						System.out.printf("%s\n",substr);
					}
				}
			}
		}
		return 0;
	}
}

