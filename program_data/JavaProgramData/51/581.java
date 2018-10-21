package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[501]);
		int n;
		int i;
		int j;
		int e;
		int t = 0;
		int s;
		int g;
		int m = 0;
		char[][] b = new char[500][6];
		String c = new String(new char[6]);
		int[] d = new int[500];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		e = a.length();
		for (i = 0; i <= e - n; i++)
		{
			s = 0;
			g = 0;
			for (j = i; j <= i + n - 1; j++)
			{
				c = tangible.StringFunctions.changeCharacter(c, s, a.charAt(j));
				s++;
			}
			c = c.substring(0, n);
			for (j = 0; j <= t - 1; j++)
			{
				if (strcmp(b[j], c) == 0)
				{
					d[j] = d[j] + 1;
					g = 1;
					break;
				}
			}
			if (g == 0)
			{
				b[t] = c;
				d[t] = 1;
				t++;
			}
		}
		for (i = 0; i <= t - 1; i++)
		{
			if (d[i] > m)
			{
				m = d[i];
			}
		}
		if (m > 1)
		{
			System.out.print(m);
			System.out.print("\n");
			for (i = 0; i <= t - 1; i++)
			{
				if (m == d[i])
				{
					System.out.print(b[i]);
					System.out.print("\n");
				}
			}
		}
		else
		{
			System.out.print("NO");
		}
		return 0;
	}






}

