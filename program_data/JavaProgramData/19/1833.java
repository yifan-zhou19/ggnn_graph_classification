import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] str = new char[4][500];
		int i;
		int j;
		int k;
		int count = 0;
		int[] len = new int[3];
		for (i = 0; i < 3; i++)
		{
			str[i] = new Scanner(System.in).nextLine();
			len[i] = String.valueOf(str[i]).length();
		}

		for (i = 0; str[0][i] != 0; i++)
		{
			if ((i == 0 || (i > 0 && str[0][i - 1] == ' ')) && ((str[0][i + len[1]] == ' ') || (str[0][i + len[1]] == 0)))
			{
				for (j = 0; j < len[1]; j++)
				{
					if (str[0][i + j] != str[1][j])
					{
						break;
					}
				}

					if (j == len[1])
					{
						str[3] = str[0] + i + len[1];
						str[0] + i + len[2] = str[3];

						for (k = 0; str[2][k] != 0; k++)
						{
							str[0][i + k] = str[2][k];
						}

					count++;
					}
			}
			str[0][len[0] + count * (len[2] - len[1]) + 1] = 0;
		}

		System.out.print(str[0]);
		System.out.print("\n");
		return 0;
	}
}
