import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] str = new char[100][102];
		int i;
		int n = 0;
		int j;
		int k;
		int l;
		while (str[n++] = new Scanner(System.in).nextLine())
		{
			/*if(getchar()=='0')
				break;*/
		}
		for (i = 0;i < n;i++)
		{
			j = 0;
			System.out.print(str[i]);
			System.out.print("\n");
			while (str[i][j] != '\0')
			{
				if (str[i][j] == '(')
				{
					k = j + 1;
					while (str[i][k] != '\0')
					{
						if (str[i][k] == ')') //"("????")"
						{
							break;
						}
						k++;
					}
					if (str[i][k] == '\0')
					{
						j++;
						continue;
					}
					l = k - 1;
					while (true) //?????
					{
						if (str[i][l] == '(')
						{
							break;
						}
						l--;
					}
					str[i][l] = str[i][k] = 'a'; //?????
				}
				if (str[i][j] != '(')
				{
					j++;
				}
			}
			j = 0;
			while (str[i][j] != '\0')
			{
				if (str[i][j] == '(')
				{
					str[i][j] = '$';
				}
				else if (str[i][j] == ')')
				{
					str[i][j] = '?';
				}
				else
				{
					str[i][j] = ' '; //???????
				}
				j++;
			}
			System.out.print(str[i]);
			System.out.print("\n");
		}
		return 0;
	}

}
