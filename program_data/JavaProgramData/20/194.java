package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] str =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		char[][] substr =
		{
			{0, '\0', '\0'}
		};
		char[][] a =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		char[] max = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[][] c =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int[] len = new int[50];
		int i;
		int n;
		int j;
		int[] num = new int[50];
		int k;
		int[] cl = new int[50];
		for (i = 0;;i++)
		{
			c[i] = new Scanner(System.in).nextLine();
			cl[i] = String.valueOf(c[i]).length();
			if (cl[i] == 0)
			{
				break;
			}
			for (j = 0;j < cl[i];j++)
			{
				if (c[i][j] != ' ')
				{
					str[i][j] = c[i][j];
				}
				else
				{
					k = j;
					break;
				}
			}
			for (j = k + 1;j < cl[i];j++)
			{
				substr[i][j - k - 1] = c[i][j];
			}
		}
		n = i;
		for (i = 0;i < n;i++)
		{
			len[i] = String.valueOf(str[i]).length();
			for (j = 0,max[i] = str[i][0];j < len[i];j++)
			{
				if (str[i][j] > max[i])
				{
					max[i] = str[i][j];
					num[i] = j;
				}
			}
			for (j = 0;j < (len[i] + 3);j++)
			{
				k = j - num[i] - 1;
				if (j <= num[i])
				{
					a[i][j] = str[i][j];
				}
				else
				{
					if (j <= (num[i] + 3))
					{
						a[i][j] = substr[i][k];
					}
					else
					{
						a[i][j] = str[i][j - 3];
					}
				}
			}
			System.out.printf("%s\n",a[i]);
		}
	}
}
