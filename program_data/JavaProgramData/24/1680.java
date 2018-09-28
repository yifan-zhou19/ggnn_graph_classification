package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[10000]);
		char[][] d = new char[100][100];
		int i;
		int m;
		int n;
		int j;
		int t;
		int a;
		String b = new String(new char[100]);
		int[] r = new int[100];
		s = new Scanner(System.in).nextLine();
		m = 0;
		n = 0;
		i = 0;
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
		a = n;
		for (;n > 0;n--)
		{
			for (m = 0;m < n;m++)
			{
				if (r[m + 1] < r[m])
				{
					t = r[m + 1];
					r[m + 1] = r[m];
					r[m] = t;
					b = d[m + 1];
					d[m + 1] = d[m];
					d[m] = b;
				}
			}
		}
		if (r[a] != r[a - 1])
		{
			 System.out.printf("%s\n",d[a]);
		}
		else
		{
			for (i = 0;i < a;i++)
			{
				if (r[i] == r[a])
				{
					System.out.printf("%s\n",d[i]);
					break;
				}
			}
		}
		System.out.printf("%s",d[0]);
		return 0;
	}

}
