package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[100]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		char[][] t = new char[50][100];
		int s1;
		int n;
		int i;
		int j;
		int m;
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		s1 = s.length();
		for (i = 0,n = 1;i < s1;i++)
		{
			if (s.charAt(i) == ' ')
			{
				n++;
			}
		}
		for (i = 0,m = 0;i < n;i++)
		{
			for (j = 0;;j++)
			{
				if (s.charAt(m + j) == ' ')
				{
					t[i][j] = '\0';
					m = m + j + 1;
					break;
				}
				else
				{
					t[i][j] = s.charAt(m + j);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (strcmp(t[i],a) == 0)
			{
				t[i] = b;
			}
			else
			{
				t[i] = t[i];
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%s ",t[i]);
		}
		System.out.printf("%s\n",t[n - 1]);
	}
}
