package <missing>;

public class GlobalMembers
{
	public static int pan(String s, int n)
	{
		int i = 0;
		int t;
		int max;
		int m;
		for (i = 0;i < n;i++)
		{
			if (s[i].equals(' '))
			{
				t = i;
				break;
			}
		}
		for (i = t - 1,max = s[t - 1];i >= 0;i--)
		{
			if (s[i].compareTo(max) >= 0)
			{
				max = s[i];
				m = i;
			}
		}
		return (m);
	}



	public static int kong(String s, int n)
	{
		int i;
		int t;
		for (i = 0;i < n;i++)
		{
			if (s[i].equals(' '))
			{
				t = i;
				break;
			}
		}
		return (t);
	}




	public static void Main()
	{
		char[][] s = new char[1000][20];
		int i;
		int j;
		int t;
		int m;
		for (i = 0;;i++)
		{
			s[i] = new Scanner(System.in).nextLine();
			if (s[i][0] == '\0')
			{
				break;
			}
		}
		for (i = 0;;i++)
		{
			if (s[i][0] == '\0')
			{
				break;
			}
			else
			{
				 t = pan(s[i], String.valueOf(s[i]).length());
				for (j = 0;j <= t;j++)
				{
					System.out.printf("%c",s[i][j]);
				}
				m = String.valueOf(s[i]).length();
				System.out.printf("%c%c%c",s[i][m - 3],s[i][m - 2],s[i][m - 1]);
				for (j = t + 1;j < kong(s[i], m);j++)
				{
					System.out.printf("%c",s[i][j]);
				}
				System.out.print("\n");
			}
		}

	}

}
