package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		char[][] d = new char[100][100];
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		int i;
		int j;
		int k = 0;
		for (i = 0;i < a.length();i++,k++)
		{
			for (j = i;a.charAt(j) != ' ';j++)
			{
				d[k][j - i] = a.charAt(j);
				d[k][j - i + 1] = '\0';
				if (a.charAt(j) == '\0')
				{
					break;
				}
			}
			i = j;
		}
		for (i = 0;i < k;i++)
		{
			if (strcmp(b,d[i]) == 0)
			{
				d[i] = c;
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			System.out.printf("%s ",d[i]);
		}
		System.out.printf("%s",d[k - 1]);
		return 0;
	}

}
