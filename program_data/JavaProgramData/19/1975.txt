package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[100]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		char[][] s2 = new char[15][20];
		int i;
		int k;
		int x = 0;
		int m;
		int n;
		char c;
		char d;
		s1 = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		m = 0;
		n = 0;
		k = 0;
		for (i = 0;(c = s1.charAt(i)) != '\0';i++)
		{
			if (c != ' ')
			{
				s2[k][m] = c;
				m++;
			}
			else
			{
				s2[k][m] = '\0';
				m = 0;
				k++;
				n++;
			}
		}
		s2[n][m] = '\0';
		for (i = 0;i <= n;i++)
		{
			if (strcmp(s2[i],a) == 0)
			{
				x = 1;
				for (k = 0;(d = b.charAt(k)) != '\0';k++)
				{
					s2[i][k] = b.charAt(k);
				}
				s2[i][k] = '\0';
			}
		}
		if (x == 1)
		{
			for (i = 0;i < n;i++)
			{
				System.out.printf("%s ",s2[i]);
			}
			System.out.printf("%s",s2[n]);
		}
		else
		{
			System.out.println(s1);
		}
		return 0;
	}

}
