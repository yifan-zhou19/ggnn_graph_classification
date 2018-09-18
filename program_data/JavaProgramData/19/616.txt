package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[100]);
		char[][] x = new char[100][26];
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String t = new String(new char[100]);
		int num;
		int i;
		int j;
		int kong;
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		kong = -1;
		num = 0;
		for (i = 0;i < 101;i++)
		{
			if (s.charAt(i) == ' ')
			{
				for (j = 0;j < i - kong - 1;j++)
				{
					x[num][j] = s.charAt(kong + 1 + j);
				}
				x[num][j] = '\0';
				num++;
				kong = i;
			}
			else if (s.charAt(i) == '\0')
			{
				for (j = 0;j < i - kong - 1;j++)
				{
					x[num][j] = s.charAt(kong + 1 + j);
				}
				 x[num][j] = '\0';
				 break;
			}

		}
		for (i = 0;i <= num;i++)
		{
			for (j = 0;x[i][j] != '\0';j++)
			{
				t = tangible.StringFunctions.changeCharacter(t, j, x[i][j]);
			}
			t = tangible.StringFunctions.changeCharacter(t, j, '\0');
			if (strcmp(a,t) == 0)
			{
				for (j = 0;b.charAt(j) != '\0';j++)
				{
					x[i][j] = b.charAt(j);
				}
				x[i][j] = '\0';
			}
		}
		for (i = 0;i < num;i++)
		{
			for (j = 0;x[i][j] != '\0';j++)
			{
				System.out.printf("%c",x[i][j]);
			}
			System.out.print(" ");
		}
		for (j = 0;x[num][j] != '\0';j++)
		{
			System.out.printf("%c",x[num][j]);
		}

	}

}

