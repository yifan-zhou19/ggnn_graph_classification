package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		char t = 1;
		char[][] tihuan = new char[100][100];
		int i;
		int j = 0;
		int m = -1;
		int n;
		a = new Scanner(System.in).nextLine();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		for (i = 0;;i++)
		{
			if (a.charAt(i) == ' ')
			{
				n = m;
				m = i;
				tihuan[j] = a.substring(n + 1, n + 1 + m - n - 1);
					tihuan[j][m - n - 1] = '\0';
					j++;
			}
			if (a.charAt(i) == '\0')
			{
				n = m;
				m = i;
					tihuan[j] = a.substring(n + 1, n + 1 + m - n - 1);
					tihuan[j][m - n - 1] = '\0';
					j++;
					break;
			}
		}
		for (i = 0;i < j;i++)
		{
			if (strcmp(tihuan[i],b) == 0)
			{
				tihuan[i] = c;
			}
		}
		for (i = 0;i < j;i++)
		{
			if (t != null)
			{
			System.out.printf("%s",tihuan[i]);
			t = 0;
			}
			else
			{
				System.out.printf(" %s",tihuan[i]);
			}
		}
		return 0;
	}


}

