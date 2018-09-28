package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[500]);
		String w = new String(new char[500]);
		char[][] e = new char[500][500];
		String c = new String(new char[500]);
		int i;
		int j;
		int m;
		int n;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = tempVar3.charAt(0);
		}
		n = w.length();
		m = s.length();
		for (i = 0;w.charAt(i + m - 1) != '\0';i++)
		{
			for (j = 0;j < m;j++)
			{
				e[i][j] = w.charAt(i + j);
			}
		e[i][j] = '\0';
		}
	for (i = 0;i < n - m + 1;i++)
	{
		if (strcmp(e[i],s) == 0)
		{
			k = 1;
			break;
		}
	}
	int a;
	a = i;
		if (k == 1)
		{
			for (i = 0;i < m;i++)
			{
				w = tangible.StringFunctions.changeCharacter(w, a + i, c.charAt(i));
			}
			System.out.printf("%s",w);
		}
		else if (k == 0)
		{
			System.out.printf("%s",w);
		}
	return 0;
	}

}

