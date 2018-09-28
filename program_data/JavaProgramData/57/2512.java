package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l;
		int n;
		String w = new String(new char[33]);
		char[][] t = new char[33][33];
		w = new Scanner(System.in).nextLine();
		n = Integer.parseInt(w);
		for (i = 0;i < n;i++)
		{
			t[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n;i++)
		{
			l = String.valueOf(t[i]).length();
			if (t[i][l - 1] == 'g' && t[i][l - 2] == 'n' && t[i][l - 3] == 'i')
			{
				t[i][l - 3] = '\0';
			}
			else if (t[i][l - 1] == 'r' && t[i][l - 2] == 'e')
			{
				t[i][l - 2] = '\0';
			}
			else if (t[i][l - 1] == 'y' && t[i][l - 2] == 'l')
			{
				t[i][l - 2] = '\0';
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.println(t[i]);
		}
		return 0;
	}
}
