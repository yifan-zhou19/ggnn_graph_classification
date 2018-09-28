package <missing>;

public class GlobalMembers
{
	//*******************************
	//*???n-gram????        **
	//*?????? 1300012965     **
	//*???20131211              **
	//*******************************
	public static int Main()
	{
		String a = new String(new char[501]);
		int[] f = new int[501];
		int[] g = new int[501];
		int i;
		int j;
		int n;
		int m;
		int nlen;
		int co = 0;
		int count = 0;
		int t;
		int t1;
		String p;
		String q;
		for (int x = 0; x <= 500; x++)
		{
			g[x] = x; //???????
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		nlen = a.length(); //????
		for (i = 0; i <= nlen - n; i++)
		{
			count = 0;
			p = a.charAt(i);
			for (j = i; j <= nlen - n; j++)
			{
				co = 0;
				q = a.charAt(j);
				for (int k = 0; k <= n - 1; k++)
				{
					if (*(p.Substring(k)) == *(q.Substring(k)))
					{
						co++; //?????
					}
				}
				if (co == n) //????????
				{
					count++; //???1
				}
			}
			f[i] = count;
		}
		for (int x = 0; x <= nlen - n - 1; x++)
		{
			for (int y = 0; y <= nlen - n - x - 1; y++)
			{
				if (f[y] < f[y + 1])
				{
					t = f[y];
					f[y] = f[y + 1];
					f[y + 1] = t; //??
					t1 = g[y];
					g[y] = g[y + 1];
					g[y + 1] = t1; //?????????
				}
			}
		}
		if (f[0] == 1)
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		else
		{
			System.out.print(f[0]);
			System.out.print("\n");
			for (int y = 0; y <= n - 1; y++)
			{
				System.out.print(a.charAt(g[0]++));
			}
			System.out.print("\n");
			for (int s = 1; s <= nlen - n; s++)
			{
				if (f[s] == f[0])
				{
					for (int y = 0; y <= n - 1; y++)
					{
						System.out.print(a.charAt(g[s]++));
					}
					System.out.print("\n");
				}
				else
				{
					break;
				}
			}
		}
		return 0;
	}
}

