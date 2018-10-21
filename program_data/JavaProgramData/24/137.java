package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[1000]);
		char[][] b = new char[1000][50];
		int n = 0;
		int p;
		int i;
		int j;
		int s;
		int m;
		a = new Scanner(System.in).nextLine();
		s = a.length();
		for (i = 0;i <= s - 1;)
		{
			for (j = i, m = 0;a.charAt(j) != ' ' && j <= s - 1;j++, m++)
			{
				b[n][m] = a.charAt(j); //?????????
			}
			b[n][m] = '\0'; //?????!!!
			n++; //?????
			i = j;
			if (a.charAt(i) == ' ')
			{
				i++;
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			for (p = j = 0;j <= n - 1;j++)
			{
				if (String.valueOf(b[i]).length() >= String.valueOf(b[j]).length())
				{
				p++;
				}
			}
			if (p == n)
			{
				System.out.printf("%s\n",b[i]);
				break;
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			for (p = j = 0;j <= n - 1;j++)
			{
				if (String.valueOf(b[i]).length() <= String.valueOf(b[j]).length())
				{
				p++;
				}
			}
			if (p == n)
			{
				System.out.printf("%s\n",b[i]);
				break;
			}
		}
	}






}
