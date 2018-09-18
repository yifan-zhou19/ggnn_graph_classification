package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] str = new char[100][40];
		String su = new String(new char[4]);
		String s = new String(new char[10]);
		char max;
		int m;
		int[] length = new int[100];
		int i = 0;
		int j;
		int l;
		int p;
		do
		{
			str[i] = new Scanner(System.in).nextLine();
			i++;
			m = String.valueOf(str[i - 1]).length();
		} while (m != 0);
		l = i - 1;
		for (i = 0;i < l;i++)
		{
			length[i] = String.valueOf(str[i]).length();
			max = str[i][0];
			for (j = 1;j < length[i] - 4;j++)
			{
				if (str[i][j] > max)
				{
					max = str[i][j];
					p = j;
				}
			}
			for (j = 0;j < 3;j++)
			{
			   su = tangible.StringFunctions.changeCharacter(su, j, str[i][length[i] + j - 3]);
			}
			for (j = 0;j < length[i] - p - 5;j++)
			{
				s = tangible.StringFunctions.changeCharacter(s, j, str[i][p + j + 1]);
			}
			for (j = 0;j <= p;j++)
			{
				str[i][j] = str[i][j];
			}
			for (j = p + 1;j <= p + 3;j++)
			{
				str[i][j] = su.charAt(j - p - 1);
			}
			for (j = p + 4;j < length[i];j++)
			{
				str[i][j] = s.charAt(j - p - 4);
			}
			for (j = length[i] - 1;j < 40;j++)
			{
				str[i][j] = '\0';
			}
			System.out.printf("%s\n",str[i]);
		}
	}



}

