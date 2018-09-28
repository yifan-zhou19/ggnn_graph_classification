package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		char[][] c = new char[50][20];
		String t = new String(new char[50]);
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
				c[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			t = tangible.StringFunctions.changeCharacter(t, i, String.valueOf(c[i]).length() - 1);
			if (c[i][t.charAt(i)] == 'r')
			{
				c[i][t.charAt(i)] = '\0';
				c[i][t.charAt(i) - 1] = '\0';
			}

			if (c[i][t.charAt(i)] == 'y')
			{
				c[i][t.charAt(i)] = '\0';
				c[i][t.charAt(i) - 1] = '\0';
			}
			if (c[i][t.charAt(i)] == 'g')
			{
				c[i][t.charAt(i)] = '\0';
				c[i][t.charAt(i) - 1] = '\0';
				c[i][t.charAt(i) - 2] = '\0';
			}
		}

		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",c[i]);
		}
	}


}

