package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[1500]);
		int i;
		int j;
		int k;
		int m;
		int n;
		int t;
		int[] x = new int[300];
		int[] y = new int[300];
		int[] l = new int[300];
		int[] s = new int[300];
		int[] w = new int[300];
		int p;
		int q;
		for (i = 0;i < 1500;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, System.in.read());
			if (a.charAt(i) == '\n')
			{
				break;
			}
		}
		m = 0;
		n = 1;
		y[0] = 0;
		for (j = 0;j < i;j++)
		{
			if (a.charAt(j) != ',' && (a.charAt(j + 1) == ',' || a.charAt(j + 1) == '\n'))
			{
				x[m] = j + 1;
				m++;
			}
		}
		for (k = 1;k < i;k++)
		{
			if (a.charAt(k) == ',' && a.charAt(k + 1) != ',')
			{
				y[n] = k + 1;
				n++;
			}
		}
		for (t = 0;t < m;t++)
		{
			l[t] = x[t] - y[t];
		}
		for (t = 0;t < m;t++)
		{
			if (l[t] == 1)
			{
				s[t] = a.charAt(y[t]) - 48;
			}
			if (l[t] == 2)
			{
				s[t] = (a.charAt(y[t]) - 48) * 10 + (a.charAt(y[t] + 1) - 48);
			}
			if (l[t] == 3)
			{
				s[t] = (a.charAt(y[t]) - 48) * 100 + (a.charAt(y[t] + 1) - 48) * 10 + (a.charAt(y[t] + 2) - 48);
			}
			if (l[t] == 4)
			{
				s[t] = (a.charAt(y[t]) - 48) * 1000 + (a.charAt(y[t] + 1) - 48) * 100 + (a.charAt(y[t] + 2) - 48) * 10 + (a.charAt(y[t] + 3) - 48);
			}
		}
		p = 0;
		for (i = 0;i < m;i++)
		{
			if (s[i] == s[0])
			{
				p++;
			}
			for (j = 0;j < m;j++)
			{
				if (s[i] >= s[j])
				{
					w[i]++;
				}
			}
		}
		if (t == 0 || p == m)
		{
			System.out.print("No\n");
		}
		q = 0;
		for (i = 0;i < m;i++)
		{
			if (w[i] == m)
			{
				q++;
			}
		}
		for (i = 0;i < m;i++)
		{
			if (w[i] == m - q)
			{
				System.out.printf("%d\n",s[i]);
				break;
			}
		}
	}
}

