package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[10001];
		int[] b = new int[10001];
		int t = 0;
		for (int i = 2; i < m; i++) // ????????m???????a?
		{
			for (int j = 2; j < m; j++)
			{
				if (i * j > m || a[i * j] != 0)
				{
					continue;
				}
				a[i * j] = i * j;
				//cout << a[i*j]<< "   ";
				b[t] = i * j;
				//cout << b[t] << "  ";
				t++;

			}
		}

		int x;
		int[] p = new int[10001];
		int[] q = new int[10001];
		int p1;
		int q1;
		for (int i = 3; i <= m / 2; i = i + 2)
		{
			x = m - i; // x ,i ?????
			//????????????
			for (int j = 0; j < t; j++)
			{
				p[j] = b[j] - i;
				q[j] = b[j] - x;
			}
			p1 = 0;
			q1 = 0;
			for (int j = 0; j < t; j++)
			{
				if (p[j] != 0)
				{
					p1++;
				}
				if (q[j] != 0)
				{
					q1++;
				}
			}
			if (p1 == t && q1 == t)
			{
				System.out.print(i);
				System.out.print(" ");
				System.out.print(x);
				System.out.print("\n");
			}

		}
		return 0;
	}



}

