package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int l1;
		int l2;
		int t;
		int[] t1 = new int[1000];
		int[] t2 = new int[1000];
		int[][] c = new int[1000][1000];
		int[] x = new int[1000];

		String a1 = new String(new char[10000]);
		String a2 = new String(new char[10000]);
		a1 = new Scanner(System.in).nextLine();


		l1 = a1.length();

		n = 0;
		t = -1;
		for (i = 0;i <= l1;i++)
		{
			if (a1.charAt(i) == ',' || a1.charAt(i) == '\0')
			{
			n++;
			if (i - t == 2)
			{
				t1[n] = a1.charAt(i - 1) - '0';
			}
			else if (i - t == 3)
			{
				t1[n] = a1.charAt(i - 1) - '0' + (a1.charAt(i - 2) - '0') * 10;
			}
			else if (i - t == 4)
			{
				t1[n] = a1.charAt(i - 1) - '0' + (a1.charAt(i - 2) - '0') * 10 + (a1.charAt(i - 3) - '0') * 100;
			}
			t = i;
			}
		}

		n = 0;
		t = -1;
		a2 = new Scanner(System.in).nextLine();
		l2 = a2.length();
		for (i = 0;i <= l2;i++)
		{
			if (a2.charAt(i) == ',' || a2.charAt(i) == '\0')
			{
				n++;
			if (i - t == 2)
			{
				t2[n] = a2.charAt(i - 1) - '0';
			}
			else if (i - t == 3)
			{
				t2[n] = a2.charAt(i - 1) - '0' + (a2.charAt(i - 2) - '0') * 10;
			}
			else if (i - t == 4)
			{
				t2[n] = a2.charAt(i - 1) - '0' + (a2.charAt(i - 2) - '0') * 10 + (a2.charAt(i - 3) - '0') * 100;
			}
			t = i;
			}
		}

		for (i = 0;i < 1000;i++)
		{
			for (j = 0;j < 1000;j++)
			{
				c[i][j] = 0;
			}
		}

		for (i = 1;i <= n;i++)
		{
			for (j = t1[i];j < t2[i];j++)
			{
				c[i][j] = 1;
			}
		}

		for (i = 1;i < 1000;i++)
		{
			x[i] = 0;
		}
		for (i = 1;i < 1000;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (c[j][i] == 1)
				{
					x[i]++;
				}
			}
		}

		m = 0;
		for (i = 1;i < 1000;i++)
		{
			if (x[i] > m)
			{
				m = x[i];
			}
		}


			System.out.printf("%d %d",n,m);
	}



}
