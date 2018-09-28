package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] s = new char[1000][100];
		int i = 0;
		int k;
		s[0] = new Scanner(System.in).nextLine();
		while (s[i][0] != 'e')
		{
			i = i + 1;
			s[i] = new Scanner(System.in).nextLine();
		}
		for (k = i - 1;k >= 0;k--)
		{
			System.out.println(s[k]);
		}
	}


}
