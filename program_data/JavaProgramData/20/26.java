package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j = 0;
		int n;
		int p;
		char[][] str = new char[100][50];
		char[][] sub = new char[100][50];
		String c = new String(new char[100]);
		char t;
		c = tangible.StringFunctions.changeCharacter(c, 0, System.in.read());
		do
		{
			p = -1;
			t = c.charAt(j);
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				str[j] = tempVar.charAt(0);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sub[j] = tempVar2.charAt(0);
			}

			for (i = 0;i < String.valueOf(str[j]).length();i++)
			{
				if (str[j][i] > t)
				{
					p = i;
					t = str[j][i];
				}
			}
			for (i = String.valueOf(str[j]).length();i > p;i--)
			{
				str[j][i + (n = String.valueOf(sub[j]).length())] = str[j][i];
			}
			for (i = 0;i < n;i++)
			{
				str[j][p + 1 + i] = sub[j][i];
			}
			j++;
			c = tangible.StringFunctions.changeCharacter(c, j, System.in.read());
		}while (c.charAt(j) == 10);
		for (i = 0;i < j;i++)
		{
			System.out.printf("%c%s\n",c.charAt(i),str[i]);
		}
	}
}

