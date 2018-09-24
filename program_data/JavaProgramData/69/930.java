package <missing>;

public class GlobalMembers
{
	public static int trans(char x)
	{

		int y;
		int[] s = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		int i;
		for (i = 0;i < 10;i++)
		{
			if (x == s[i])
			{
				y = i;
				break;
			}
		}
		return y;
	}
	public static int Main()
	{
		String a = new String(new char[250]);
		String b = new String(new char[250]);
		int[] c = new int[250];
		int[] d = new int[250];
		int[] e = new int[250];
		int[] f = new int[250];
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		int na;
		int nb;
		na = a.length();
		nb = b.length();
		int n;
		if (na > nb)
		{
			n = na;
		}
		else
		{
			n = nb;
		}
		int i;
		int j;
		for (i = 0;i < 250;i++)
		{
			c[i] = 0;
			d[i] = 0;
			e[i] = 0;
			f[i] = 0;
		}
		for (i = n,j = na - 1;j >= 0;i--,j--)
		{
			c[i] = trans(a.charAt(j));
		}
		for (i = n,j = nb - 1;j >= 0;i--,j--)
		{

			d[i] = trans(b.charAt(j));
		}
		for (i = n;i >= 0;i--)
		{
			if (i == n)
			{
				if (c[i] + d[i] < 10)
				{
					e[i] = c[i] + d[i];
				}
				else
				{
					e[i] = c[i] + d[i] - 10;
					f[i] = 1;
				}
			}
			else
			{

					if (c[i] + d[i] + f[i + 1] < 10)
					{
					e[i] = c[i] + d[i] + f[i + 1];
					}
					else
					{
						e[i] = c[i] + d[i] + f[i + 1] - 10;
						f[i] = 1;
					}

			}
		}
		int tmp = 0;
		for (i = 0;i <= n;i++)
		{
			if (e[i] != 0)
			{
				tmp = 1;
				break;
			}
		}
		int m;
		for (i = 0;i <= n;i++)
		{
			if (e[i] != 0)
			{
				m = i;
				break;
			}
		}


		if (tmp == 1)
		{
		  for (i = m;i <= n;i++)
		  {
				System.out.printf("%d",e[i]);

		  }
		}
		else
		{
			System.out.print("0");
		}


		return 0;


	}









}
