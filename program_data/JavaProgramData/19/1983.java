package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		char[][] a = new char[100][100];
		s = new Scanner(System.in).nextLine();
		int len = s.length();
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		int lenth = str2.length();
		int i;
		int j;
		int p;
		for (i = 0,j = 0,p = 0;j < len;j++)
		{
			a[i][p++] = s.charAt(j);
			if (s.charAt(j + 1) == ' ')
			{
				j = j + 1;
				a[i][p] = '\0';
				i = i + 1;
				p = 0;
			}
		}
		a[i][p] = '\0';
		int num = i;
		int judge = 0;
		for (i = 0;i < num + 1;i++)
		{
			if (strcmp(a[i], str1) == 0)
			{
				for (j = 0;j < lenth;j++)
				{
					a[i][j] = str2.charAt(j);
				}
				a[i][lenth] = '\0';
				judge = 1;
			}
		}

		if (judge == 0)
		{
			System.out.printf("%s\n", s);
		}
		else
		{
			System.out.printf("%s", a[0]);
			for (i = 1;i < num + 1;i++)
			{
				System.out.printf(" %s", a[i]);
			}
			System.out.print("\n");
		}
		return 0;
	}

}
