package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[100000]);
	public static int Main()
	{
		char[][] b = new char[100][100];
		a = new Scanner(System.in).nextLine();
		int l = a.length();
		int n = 0;
		int k = 0;
		int i;
		for (i = 0;i < l;i++)
		{
			if (a.charAt(i) != ' ' && a.charAt(i) != ',')
			{
				b[n][k] = a.charAt(i);
				k++;
			}
			else
			{
				b[n][k] = '\0';
				n++;
				k = 0;
			}
		}
		b[n][k] = '\0';
		int[] len = new int[100];
		int m = 0;
		for (i = 0;i <= n;i++)
		{
			len[m] = String.valueOf(b[i]).length();
			m++;
		}
		int ma = len[0];
		int pan = 0;
		for (i = 0;i < m;i++)
		{
			if (ma != len[i])
			{
				pan = 1;
				break;
			}
		}
		if (pan == 0)
		{
			System.out.printf("%s\n",b[0]);
			System.out.printf("%s\n",b[0]);

		}
		else
		{
			int max = len[0];
			int min = len[0];
			int pp;
			for (pp = 0;pp <= n;pp++)
			{
				if (len[pp] > max)
				{
					int e;
					e = max;
					max = len[pp];
					len[pp] = e;
				}
			}
			for (pp = 0;pp <= n;pp++)
			{
				if (len[pp] < min && len[pp] != 0)
				{
					int e1;
					e1 = min;
					min = len[pp];
					len[pp] = e1;
				}
			}
			for (pp = 0;pp <= n;pp++)
			{
				if (String.valueOf(b[pp]).length() == max)
				{
					System.out.printf("%s\n",b[pp]);
					break;
				}
			}
			for (pp = 0;pp <= n;pp++)
			{
				if (String.valueOf(b[pp]).length() == min)
				{
					System.out.printf("%s\n",b[pp]);
					break;
				}
			}
		}
		return 0;
	}



}
