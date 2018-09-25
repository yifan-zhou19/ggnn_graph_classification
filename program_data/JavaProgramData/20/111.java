package <missing>;

public class GlobalMembers
{
	public static int f(String str) //?????str?ASCII??????
	{
		int i;
		int a;
		int n;
		char nul = '0';
		a = str.length();
		for (i = 0;i < a - 4;i++)
		{
			if (str[i].compareTo(nul) > 0)
			{
				nul = str[i];
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
		int[] a = new int[100];
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
			a[i] = f(str[i]);
			for (j = 0;j < 50;j++)
			{
				if (j < a[i] + 1)
				{
					str1[i][j] = str[i][j];
				}
				else if (j > a[i] && j < a[i] + 4)
				{
					str1[i][j] = str[i][length[i] + j - 4 - a[i]];
				}
				else if (j > a[i] + 3 && j < length[i] - 1)
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
