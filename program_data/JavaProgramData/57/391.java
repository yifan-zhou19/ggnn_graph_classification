package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int l;
		String t1 = new String(new char[100]);
		String t2 = new String(new char[100]);
		char[][] s = new char[100][100];
		final String s1 = "er";
		final String s2 = "ly";
		final String s3 = "ing";
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
			l = String.valueOf(s[i]).length();
			t1 = s[i] + l - 2;
			t2 = s[i] + l - 3;
			if (strcmp(t1,s1) == 0)
			{
				s[i][l - 2] = '\0';
			}
			if (strcmp(t1,s2) == 0)
			{
				s[i][l - 2] = '\0';
			}
			if (strcmp(t2,s3) == 0)
			{
				s[i][l - 3] = '\0';
			}
			System.out.println(s[i]);
		}
		return 0;
	}
}

