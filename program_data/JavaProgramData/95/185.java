package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] s = new char[1][100];
		int i;
		for (i = 0;i < 2;i++)
		{
			s[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;;i++)
		{
			if (s[0][i] >= 'a' && s[0][i] <= 'z')
			{
				s[0][i] = s[0][i] - 32;
			}
			if (s[1][i] >= 'a' && s[1][i] <= 'z')
			{
				s[1][i] = s[1][i] - 32;
			}
			if (s[0][i] > s[1][i])
			{
				System.out.print(">");
				System.out.print("\n");
				break;
			}
			if (s[0][i] < s[1][i])
			{
				System.out.print("<");
				System.out.print("\n");
				break;
			}
			if (s[0][i] == '\0' || s[1][i] == '\0')
			{
				System.out.print("=");
				System.out.print("\n");
				break;
			}
		}
		return 0;
	}
}
