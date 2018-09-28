package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] s = new char[1000][1000];
		int i = 0;
		int n = 0;
		while (true)
		{
			s[n] = new Scanner(System.in).nextLine();
			if (s[n][0] == 'e')
			{
			break;
			}
			else
			{
			n++;
			}
		}
		for (i = n - 1;i >= 0;i--)
		{
			System.out.println(s[i]);
			System.out.print("\n");
		}
	}

}
