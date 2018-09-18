package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int p;
		int j;
		int k;
		int len;
		int i;
	final String str = "";
	char[][] ch = new char[100][3];
	char[][] sub = new char[100][20];
	char[][] tol = new char[100][30];
	for (i = 0;i < 100;i++)
	{
		tol[i] = new Scanner(System.in).nextLine();
		len = String.valueOf(tol[i]).length();
		if (len == 0)
		{
			break;
		}
		for (j = 0;;j++)
		{
				str.charAt(i)[j] = tol[i][j];
			if (str.charAt(i)[j] == ' ')
			{
				str.charAt(i)[j] = '\0';
				break;
			}
		}
		for (k = 0;k < 3;k++)
		{
			   ch[i][k] = tol[i][j + 1];
			   j++;
		}
		for (j = 1,p = 0;j < len;j++)
		{
				if (str.charAt(i)[p] < str.charAt(i)[j])
				{
					p = j;
				}
		}

		sub[i] = String.valueOf(str.charAt(i)).substring(0, p + 1);

		sub[i][p + 1] = ch[i][0];
		sub[i][p + 2] = ch[i][1];
		sub[i][p + 3] = ch[i][2];
		for (j = 0;j <= len - 1 - p;j++)
		{
			sub[i][p + 4 + j] = str.charAt(i)[p + j + 1];
		}
	}
	System.out.printf("%s",sub[0]);
	for (i = 1;String.valueOf(tol[i]).length() != 0;i++)
	{
			System.out.printf("\n%s",sub[i]);
	}
	return 0;
	}
}
