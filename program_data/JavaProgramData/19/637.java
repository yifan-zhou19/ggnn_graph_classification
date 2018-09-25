package <missing>;

public class GlobalMembers
{
	/* begin 11:40 */
	public static int Main()
	{
		char[][] s = new char[100][101];
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		int i = 0;
		int j = 0;
		int k = 0;
		for (i = 0;;)
		{
			for (j = 0;;j++)
			{
				String tempVar = ConsoleInput.scanfRead(null, 1);
				if (tempVar != null)
				{
					s[i][j] = tempVar.charAt(0);
				}
				if (s[i][j] == ' ')
				{
					s[i][j] = '\0';
					i++;
					break;
				}
				if (s[i][j] == '\n')
				{
					break;
				}
			}
			if (s[i][j] == '\n')
			{
				break;
			}
		}
		s[i][j] = '\0';
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (k = 0;k <= i;k++)
		{
			if (strcmp(s[k],a) == 0)
			{
				s[k] = b;
			}
		}
		for (k = 0;k <= i;k++)
		{
			if (k == 0)
			{
				System.out.printf("%s",s[k]);
			}
			else
			{
				System.out.printf(" %s",s[k]);
			}
		}
		return 0;
	}
}

