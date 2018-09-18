package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] str = new char[100][50];
		char[][] result = new char[100][50];
		int m;
		int[] length = new int[100];
		int i = 0;
		int j;
		int l;
		int max;
		int p;
		int k;
		int t;
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
			p = 0;
			for (j = 1;j < length[i] - 4;j++)
			{
				if (str[i][j] > max)
				{
					max = str[i][j];
					p = j;
				}
			}
			for (j = 0;j <= p;j++)
			{
				result[i][j] = str[i][j];
			}
			for (j = p + 1;j <= p + 3;j++)
			{
				result[i][j] = str[i][length[i] + j - p - 4];
			}
			for (j = p + 4;j < length[i];j++)
			{
				result[i][j] = str[i][j - 3];
			}
			for (j = length[i] - 1;j < 50;j++)
			{
				result[i][j] = '\0';
			}
		}
		for (j = 0;j < l;j++)
		{
			t = String.valueOf(result[j]).length();
			for (k = 0;k < t;k++)
			{
				System.out.printf("%c",result[j][k]);
			}
			System.out.print("\n");
		}
	}

}
