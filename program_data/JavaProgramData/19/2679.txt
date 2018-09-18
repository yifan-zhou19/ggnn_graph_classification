package <missing>;

public class GlobalMembers
{
	public static char[][] m = new char[110][110];

	public static int Main()
	{
		String s = new String(new char[110]);
		String a = new String(new char[110]);
		String b = new String(new char[110]);
		int num;
		int i;
		int j;
		int len;

		s = new Scanner(System.in).nextLine();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		num = 0;
		for (i = 0;s.charAt(i) != ' ';i++)
		{
			m[0][i] = s.charAt(i);
		}
		m[0][i] = '\0';
		num++;
		i++;
		len = s.length();
		while (s.charAt(i) != '\0')
		{
			j = 0;
			while (s.charAt(i) != ' ' && s.charAt(i) != '\0')
			{
				m[num][j++] = s.charAt(i++);
			}
			m[num++][j] = '\0';
			i++;
			if (i >= len)
			{
				break;
			}
		}

		for (i = 0;i < num;i++)
		{
			if (strcmp(a,m[i]) == 0)
			{
				m[i] = b;
				len = b.length();
				m[i][len] = '\0';
			}
		}
		for (i = 0;i < num - 1;i++)
		{
			System.out.printf("%s ",m[i]);
		}
		System.out.printf("%s\n",m[num - 1]);
		return 0;
	}
}

