package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int w;
		char[][] s = new char[100][81];
		String str = new String(new char[100]);
		str = new Scanner(System.in).nextLine();
		n = Integer.parseInt(str);
		for (w = 0;w < n;w++)
		{
			s[w] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n;i++)
		{
			int flag = 1;
			for (j = 0;j < String.valueOf(s[i]).length();j++)
			{
				if (s[i][0] != '_' && (s[i][0] < 'A' || (s[i][0]>'Z' && s[i][0] < 'a') || s[i][0]>'z'))
				{
					flag = 0;
					break;
				}
				if (s[i][j] == ' ')
				{
					flag = 0;
					break;
				}
				if (!(s[i][j] == '_' || (s[i][j] >= 'A' && s[i][j] <= 'Z') || (s[i][j] >= 'a' && s[i][j] <= 'z') || s[i][j] >= '0' && s[i][j] <= '9'))
				{
					flag = 0;
					break;
				}
			}
			if (flag == 0)
			{
				System.out.print("0");
			}
			else
			{
				System.out.print("1");
			}
			System.out.print("\n");
		}


		return 0;
	}
}
