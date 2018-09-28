package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int temp = 1;
		char[][] s = new char[200][85];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s[0] = new Scanner(System.in).nextLine();
		for (;n > 0;n--)
		{
			temp = 1;
			s[n] = new Scanner(System.in).nextLine();
			if ((s[n][0] == 95) || ((s[n][0] < 123) && (s[n][0]>96)) || ((s[n][0] < 91) && (s[n][0]>64)))
			{
				;
			}
			else
			{
				System.out.print("0\n");
				continue;
			}
			for (i = 1;s[n][i] != '\0';i++)
			{
				if ((s[n][i] == 95) || ((s[n][i] < 123) && (s[n][i]>96)) || ((s[n][i] < 91) && (s[n][i]>64)) || ((s[n][i] < 58) && (s[n][i]>47)))
				{
					;
				}
				else
				{
					System.out.print("0\n");
					temp = 0;
					break;
				}
			}
			if (temp != 0)
			{
				System.out.print("1\n");
			}
		}
		return 0;
	}
}

