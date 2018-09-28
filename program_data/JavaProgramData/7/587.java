package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
		String b = new String(new char[300]);
		String c = new String(new char[300]);
		char[][] d = new char[100][100];
		int la;
		int lb;
		int i;
		int j;
		int x = 0;
		int m = 0;
		int wz;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		la = a.length();
		lb = b.length();
		for (i = 0;i < la;i++)
		{
			if (a.charAt(i) == b.charAt(0))
			{
				m = 0;
				wz = i;
				for (j = 0;j < lb;j++)
				{
					if (a.charAt(i + j) != b.charAt(j))
					{
						i = i + j - 1;
						break;
					}
					else
					{
						m++;
					}
				}
			}
			if (m == lb)
			{
				for (j = 0;j < wz;j++)
				{
					d[0][j] = a.charAt(j);
					d[0][wz] = '\0';
				}
				for (j = wz + lb;j < la;j++)
				{
					d[1][j - wz - lb] = a.charAt(j);
					d[1][la - wz - lb] = '\0';
				}
				break;
			}
		}
		if (m > 0)
		{
		if (wz == 0)
		{
			d[0] = c;
		}
		else
		{
		  d[0] += c;
		}
		if (wz + lb == la)
		{
			  System.out.println(d[0]);
		}
		else
		{
			d[0] += d[1];
			System.out.println(d[0]);
		}
		}
		else
		{
			System.out.println(a);
		}
		return 0;
	}

}
