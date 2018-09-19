package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[11]);
	String b = new String(new char[101]);
	String z = new String(new char[11]);
	char[][] s = new char[16][11];
	b = new Scanner(System.in).nextLine();
	a = new Scanner(System.in).nextLine();
	z = new Scanner(System.in).nextLine(); //??
	int i;
	int j;
	int m;
	int n;
	int l;
	int[] q = new int[22];
	for (i = 0,m = 0,n = 0;b.charAt(i) != '\0';i++)
	{
		if (b.charAt(i) != ' ')
		{
			s[m][n] = b.charAt(i);
		n++;

		}
		else
		{

			q[m] = n;
			n = 0;
		m++;
		}
	}
	q[m] = n; //????????????
		for (i = 0,j = 0;i <= m;i++)
		{
			if (a.charAt(0) == s[i][0])
			{
				l = 1;
			for (j = 0;j < q[i];j++)
			{
				if (a.charAt(j) != s[i][j])
				{
				l = 0;
				}
				if (q[i] != a.length())
				{
				l = 0;
				}
			}
			if (l != 0)
			{
				for (j = 0;z.charAt(j) != '\0';j++)
				{
				s[i][j] = z.charAt(j);
				}
			q[i] = j;
			}
			}
		} //??

		for (i = 0;i < m;i++)
		{
			for (j = 0;j < q[i];j++)
			{
			System.out.printf("%c",s[i][j]);
			}
			System.out.print(" ");
		}

			for (j = 0;j < q[m];j++)
			{
			System.out.printf("%c\0",s[i][j]);
			} //??
		return 0;
	}
}
