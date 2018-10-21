package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int len;
		char[][] s = new char[50][15];
		String p;
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
				s[i] = tempVar2.charAt(0);
			}
			len = String.valueOf(s[i]).length();
			for (j = 0;j < len;j++)
			{
				p = s[i] + j;
				while (strcmp(p,"er\0") == 0 || strcmp(p,"ly\0") == 0 || strcmp(p,"ing\0") == 0)
				{
					p = '\0';
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n", s[i]);
		}
	}
}

