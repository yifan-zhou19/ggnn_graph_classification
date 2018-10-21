package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] s = new char[200][100];
		char c;
		String h = new String(new char[100]);
		String t = new String(new char[100]);
		int i;
		int j;
		int a;
		int min = 1000;
		int max = 0;
		for (i = 0;;i++)
		{
			for (j = 0;;j++)
			{
				String tempVar = ConsoleInput.scanfRead(null, 1);
				if (tempVar != null)
				{
					c = tempVar.charAt(0);
				}
				if (c == ' ' || c == ',' || c == '\n')
				{
					break;
				}
				s[i][j] = c;
			}
			s[i][j] = '\0';
			a = String.valueOf(s[i]).length();
			if (a == 0)
			{
				continue;
			}
			if (a > max)
			{
				max = a;
			h = s[i];
			}
			if (a < min)
			{
				min = a;
			t = s[i];
			}
			if (c == '\n')
			{
				break;
			}
		}
		System.out.printf("%s\n",h);
		System.out.printf("%s\n",t);
		return 0;
	}

}

