package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static inserting(String a, String b)
	{
		int i;
		int k;
		int n;
		char c;
		n = a.length();
		c = a[0];
		for (i = 1;i < 15;i++)
		{
			if (c < a[i])
			{
				k = i;
				c = a[i];
			}
		}
		for (i = n - 1 + 3;i > k + 3;i--)
		{
			a[i] = a[i - 3];
		}
		for (i = k + 1;i < k + 4;i++)
		{
			a[i] = b[i - k - 1];
		}
		for (i = 0;i < n + 3;i++)
		{
			System.out.printf("%c",a[i]);
		}
		System.out.print("\n");
	}
	public static void Main()
	{
		int i;
		int j;
		int k;
		int n;
		int m;
		char[][] str = new char[100][50];
		char[][] str1 = new char[100][50];
		i = 0;
		do
		{
			str[i] = new Scanner(System.in).nextLine();
			i++;
			n = String.valueOf(str[i - 1]).length();
		} while (n != 0);
		for (k = 0;k < i - 1;k++)
		{
			for (j = 0;j < 50;j++)
			{
				if (str[k][j] == ' ')
				{
					m = j;
					str[k][j] = '\0';
					break;
				}
			}
			for (j = m + 1;j < m + 4;j++)
			{
				str1[k][j - m - 1] = str[k][j];
				str[k][j] = '\0';
			}
		}
		for (j = 0;j < i - 1;j++)
		{
			inserting(str[j], str1[j]);
		}
	}

}
