package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] len = new int[100];
		char[][] s = new char[100][81];
		String num = new String(new char[10]);
		num = new Scanner(System.in).nextLine();
		n = Integer.parseInt(num);
		for (i = 0;i < n;i++)
		{
			s[i] = new Scanner(System.in).nextLine();
			len[i] = String.valueOf(s[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			if ((s[i] == 95) || (s[i] >= 65 && s[i] <= 90) || (s[i] >= 97 && s[i] <= 122))
			{
				if (len[i] == 1)
				{
					System.out.print("1\n");
				}
				else
				{
					for (j = 1;j < len[i];j++)
					{
						if ((s[i][j] <= 47) || (s[i][j] >= 58 && s[i][j] <= 64) || (s[i][j] >= 91 && s[i][j] <= 94) || (s[i][j] == 96) || (s[i][j] >= 123))
						{
							System.out.print("0\n");
							break;
						}
						if (j == len[i] - 1)
						{
							System.out.print("1\n");
						}
					}
				}
			}
			else
			{
				System.out.print("0\n");
			}
		}
		return 0;
	}
}
