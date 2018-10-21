package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[300]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * ps;
		int[] S = new int[26];
		int[] s = new int[26];
		int i;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		for (ps = str; * ps != '\0';ps++)
		{
			if (*ps >= 'a' && *ps <= 'z')
			{
				s[*ps - 'a']++;
				k = 1;
			}
			if (*ps >= 'A' && *ps <= 'Z')
			{
				S[*ps - 'A']++;
				k = 1;
			}
		}
		if (k == 1)
		{
		for (i = 0;i < 26;i++)
		{
			if (S[i] != 0)
			{
				System.out.printf("%c=%d\n",'A' + i,S[i]);
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (s[i] != 0)
			{
				System.out.printf("%c=%d\n",'a' + i,s[i]);
			}
		}
		}
		else
		{
			System.out.print("No");
		}


	}
}

