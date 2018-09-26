package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] s = new char[1000][100];
		int i;
		for (i = 0;;i++)
		{
			s[i] = new Scanner(System.in).nextLine();
			if (s[i][0] == 'e')
			{
				i--;
				break;
			}
		}
		for (;i >= 0;i--)
		{
			System.out.printf("%s\n",s[i]);
		}
	}
}
