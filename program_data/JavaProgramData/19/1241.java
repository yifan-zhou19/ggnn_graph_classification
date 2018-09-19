package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String[] p = new String[100];
		String a;
		String b;
		int i;
		int j;
		int t;
		for (i = 0;i < 100;i++)
		{
			p[i] = len;
			for (j = 0;j < 100;j++)
			{
				p[i][j] = '\0';
			}
		}
		for (i = 0;;i++)
		{
			for (j = 0;j < 100;j++)
			{
				String tempVar = ConsoleInput.scanfRead(null, 1);
				if (tempVar != null)
				{
					p[i][j] = tempVar.charAt(0);
				}
				if (p[i][j] == ' ')
				{
					p[i][j] = '\0';
					break;
				}
				if (p[i][j] == '\n')
				{
					break;
				}
			}
			if (p[i][j] == '\n')
			{
				t = i;
				p[i][j] = '\0';
				break;
			}
		}
		a = len;
		b = len;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;i <= t;i++)
		{
			if (!strcmp(a,p[i]))
			{
				for (j = 0;;j++)
				{
					if (p[i][j] == '\0')
					{
						break;
					}
					else
					{
						p[i][j] = '\0';
					}
				}
				p[i] = b;
			}
		}
		for (i = 0;i < t;i++)
		{
			System.out.printf("%s ",p[i]);
		}
		System.out.printf("%s",p[t]);
	}
}

