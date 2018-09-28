package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100000]);
		char[][] d = new char[1000][100];
		int i;
		int m;
		int n;
		int j;
		int p;
		int[] r = new int[1000];
		s = new Scanner(System.in).nextLine();
		m = 0;
		n = 0;
		i = 0;
		p = s.length();
		while (s.charAt(i) != '\0')
		{
			j = 0;
			for (;s.charAt(i) != ' ' && s.charAt(i) != '\0';i++, j++)
			{
				d[m][j] = s.charAt(i);
				r[m]++;
			}
			if (s.charAt(i) == '\0')
			{
				break;
			}
			d[m][j] = '\0';
			m++;
			n++;
			i++;
		}
		d[m][j] = '\0';
		for (i = 0;i < m;i++)
		{
			if (r[i] != 0)
			{
			  System.out.printf("%d,",r[i]);
			}
		}
		System.out.printf("%d",r[m]);
		return 0;
	}

}
