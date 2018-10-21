package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		char[][] s = new char[100][81];
		int g;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i < n;i++)
		{
			s[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n;i++)
		{
			g = 0;
			for (j = 0;j < String.valueOf(s[i]).length();j++)
			{
				  if (s[i][0] == '_' || ((s[i][0] >= 'A') && (s[i][0] <= 'Z')) || ((s[i][0] >= 'a') && (s[i][0] <= 'z')))
				  {
						if (s[i][j] == '_' || ((s[i][j] >= 'A') && (s[i][j] <= 'Z')) || ((s[i][j] >= 'a') && (s[i][j] <= 'z')) || (s[i][j] >= '0' && s[i][j] <= '9'))
						{
							g++;
						}
				  }



			}
					if (g == String.valueOf(s[i]).length())
					{
						System.out.print(1);
						System.out.print("\n");
					}
					else
					{
						System.out.print(0);
						System.out.print("\n");
					}
		}
		 return 0;
	}
}

