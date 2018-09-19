package <missing>;

public class GlobalMembers
{
	public static int f(String str) //?????str?ASCII??????
	{
		int i;
		int a;
		int n;
		char ch = str[0];
		a = str.length();
		for (i = 1;i < a - 4;i++)
		{
			if (str[i].compareTo(ch) > 0)
			{
				ch = str[i];
				n = i;
			}
		}
		return (n);
	}
	public static void Main()
	{
		int i = 0;
		int n;
		int j;
		int a;
		int[] length = new int[100];
		char[][] str = new char[100][50];
		char[][] str1 = new char[100][50];
		do
		{ //????????
			str[i] = new Scanner(System.in).nextLine();
			length[i] = String.valueOf(str[i]).length();
			i++;
		} while (length[i - 1] != 0);
		n = i - 1;
		for (i = 0;i < n;i++)
		{
			a = f(str[i]);
			for (j = 0;j < 50;j++)
			{
				if (j < a + 1)
				{
					str1[i][j] = str[i][j];
				}
				else if (j > a && j < a + 4)
				{
					str1[i][j] = str[i][length[i] + j - 4 - a];
				}
				else if (j > a + 3 && j < length[i] - 1)
				{
					str1[i][j] = str[i][j - 3];
				}
				else if (j >= length[i] - 1)
				{
					str1[i][j] = '\0';
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",str1[i]);
		}
	}
}
