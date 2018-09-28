package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[10000]);
		char[][] b = new char[50][100];
		int[] c = new int[50];
		int m;
		int n;
		int i = 0;
		int j = 0;
		int p = 0;
		a = new Scanner(System.in).nextLine();
		m = a.length();
		for (;i < m;i++,p++)
		{
			b[j][p] = a.charAt(i);
			c[j]++;
			if (a.charAt(i) == ' ')
			{
				b[j][p] = '\0';
				c[j]--;
				j++;
				p = -1;
			}
		}
		b[j][p + 1] = '\0';
		m = n = c[0];
		for (i = 1;i <= j;i++)
		{
			if (m < c[i])
			{
				m = c[i];
			}
			if (n > c[i])
			{
				n = c[i];
			}
		}
		for (i = 0;i <= j;i++)
		{
			if (c[i] == m)
			{
				break;
			}
		}
			System.out.printf("%s\n",b[i]);
		for (i = 0;i <= j;i++)
		{
			if (c[i] == n)
			{
				break;
			}
		}
			System.out.printf("%s\n",b[i]);
			return 0;
	}
}
