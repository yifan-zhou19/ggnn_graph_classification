package <missing>;

public class GlobalMembers
{
	public static int max(int a,int b)
	{
		return (a > b != 0?a:b);
	}
	public static int min(int a,int b)
	{
		return (a < b != 0?a:b);
	}
	public static int Main()
	{
		int i = 0;
		int j;
		int ex;
		int[] lenth = new int[200];
		int imin = 100;
		int imax = 0;
		int k = 0;
		char[][] s = new char[200][50];
		char c;
		while (true)
		{
			c = System.in.read();
			if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
			{
				ex = 1;
				lenth[k]++;
				s[k][i++] = c;
			}
			else if (ex == 1)
			{
				imax = max(imax, lenth[k]);
				imin = min(imin, lenth[k]);
				ex = 0;
				k++;
				i = 0;
			}
			if (c == '\n')
			{
			break;
			}
		}
		for (i = 0;;i++)
		{
			if (lenth[i] == imax)
			{
				for (j = 0;j < lenth[i];j++)
				{
				System.out.print(s[i][j]);
				}
				System.out.print('\n');
				break;
			}

		}
		for (i = 0;;i++)
		{
			if (lenth[i] == imin)
			{
				for (j = 0;j < lenth[i];j++)
				{
				System.out.print(s[i][j]);
				}
				System.out.print('\n');
				break;
			}
		}
		return 0;
	}

}
