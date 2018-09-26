package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int x = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		char[][] s = new char[n][80];
		for (i = 0;i < n;i++)
		{
						x = 1;
						s[i] = new Scanner(System.in).nextLine();
						if ((s[i][0] >= 'a' && s[i][0] <= 'z') || (s[i][0] >= 'A' && s[i][0] <= 'Z') || s[i][0] == '_')
						{
								   for (j = 1;j < String.valueOf(s[i]).length();j++)
								   {
								   if ((s[i][j] >= 'a' && s[i][j] <= 'z') || (s[i][j] >= 'A' && s[i][j] <= 'Z') || s[i][j] == '_' || (s[i][j] >= '0' && s[i][j] <= '9'))
								   {
											 x = 1;
								   }
								   else
								   {
									   x = 0;
									   break;
								   }
								   }
						}
						else
						{
							x = 0;

						}
						System.out.printf("%d\n",x);
		}
	}


}

