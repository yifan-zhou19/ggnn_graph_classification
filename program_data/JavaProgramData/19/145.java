package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String s = new String(new char[100]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int j = 0;
		int k;
		int m;
		int n = 1;
		String t = new String(new char[100]);

		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();

		//??????
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) == ' ')
			{
				n++;
			}
		}

		//???????????
			for (i = 0;s.charAt(i) != ' ';i++)
			{
				t = tangible.StringFunctions.changeCharacter(t, i, s.charAt(i));
			}
			t = tangible.StringFunctions.changeCharacter(t, i, '\0');
			if (strcmp(t,a) == 0)
			{
				System.out.printf("%s",b);
			}
			else
			{
				System.out.printf("%s",t);
			}
			k = i + 1;

		//?????
			for (i = 1;i < n - 1;i++)
			{
				m = 0;
				for (j = k;s.charAt(j) != ' ';j++)
				{
					t = tangible.StringFunctions.changeCharacter(t, m, s.charAt(j));
					m++;
				}
				t = tangible.StringFunctions.changeCharacter(t, m, '\0');
				if (strcmp(t,a) == 0)
				{
					System.out.printf(" %s",b);
				}
				else
				{
					System.out.printf(" %s",t);
				}
				k = j + 1;
			}

			m = 0;
			for (j = k;s.charAt(j) != '\0';j++)
			{
				t = tangible.StringFunctions.changeCharacter(t, m, s.charAt(j));
				m++;
			}
			t = tangible.StringFunctions.changeCharacter(t, m, '\0');
			if (strcmp(t,a) == 0)
			{
				System.out.printf(" %s",b);
			}
			else
			{
				System.out.printf(" %s",t);
			}

	}

}

