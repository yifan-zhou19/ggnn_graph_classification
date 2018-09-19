package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		char[][] d = new char[50][100];
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

		int chang;
		int i;
		int n;
		int m;
		int u = 0;
		int v = 0;
		chang = a.length();

		for (i = 0;i < chang;i++)
		{
			if (a.charAt(i) != ' ')
			{
				d[u][v] = a.charAt(i);
				v++;
			}
			else
			{
				v = 0;
				u++;
			}
		}

		for (i = 0;i < u;i++)
		{
			if (strcmp(b,d[i]) == 0)
			{
				System.out.printf("%s ",c);
			}
			else
			{
				System.out.printf("%s ",d[i]);
			}

		}


		if (strcmp(b,d[i]) == 0)
		{
			System.out.printf("%s",c);
		}
		else
		{
			System.out.printf("%s",d[u]);
		}

		return 0;
	}


}

