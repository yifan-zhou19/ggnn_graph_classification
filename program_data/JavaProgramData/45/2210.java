package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		char[][] e = new char[50][50];
		int i;
		int j;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		m = s.length();
		n = w.length();
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
		break;
		}
	}

	System.out.printf("%d\n",i);
	return 0;
	}
}

