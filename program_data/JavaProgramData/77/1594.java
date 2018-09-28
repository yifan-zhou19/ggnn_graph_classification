package <missing>;

public class GlobalMembers
{
	public static int[] flag = new int[101];
	public static String str = new String(new char[101]);
	public static char boy;
	public static char girl;
	public static char num = 0;
	public static void match(int i)
	{
		flag[i] = 1;
		for (int k = i;;k--)
		{
				if (str.charAt(k) == boy && flag[k] == 0)
				{
				   System.out.print(k);
				   System.out.print(' ');
				   System.out.print(i);
				   System.out.print("\n");
				   flag[k] = 1;
				   break;
				}
		}
		num = num + 2;
		if (num == str.length())
		{
			return;
		}
			for (++i;;i++)
			{
				if (str.charAt(i) == girl)
				{
						match(i);
						break;
				}

			}
		return;
	}


	public static int Main()
	{
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		boy = str.charAt(0);
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = str;
		for (i = 0;;p++,i++) //i--first girl
		{
			if (*p != boy)
			{
					girl = p;
					break;
			}
		}
		match(i);
		return 0;
	}



}

