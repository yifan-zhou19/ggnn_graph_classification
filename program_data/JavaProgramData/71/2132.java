package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[][] a = new int[201][10];
		int i;
		int j;
		int g;
		int b;
		int c;
		int x;
		int y;
		int m;
		int d;
		int e;
		int f;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i][1] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][2] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i][3] = Integer.parseInt(tempVar4);
			}
		}

		for (i = 1;i <= n;i++)
		{
			g = a[i][1] - (a[i][1] / 4) * 4;
			b = a[i][1] - (a[i][1] / 100) * 100;
			c = a[i][1] - (a[i][1] / 400) * 400;
			if (b != 0 && g == 0)
			{
				a[i][4] = 1;
			}
			else if (b == 0 && c == 0)
			{
				a[i][4] = 1;
			}
			else
			{
				a[i][4] = 0;
			};

			if (a[i][2] > a[i][3])
			{
				x = a[i][3];
				y = a[i][2];
			}
			else
			{
				x = a[i][2];
				y = a[i][3];
			};


			if (x == 1)
			{
			m = 0;
			}
			else if (x == 2)
			{
			m = 31;
			}
			else if (x == 3)
			{
			m = 31 + 28 + a[i][4];
			}
			else if (x == 4)
			{
			m = 31 + 28 + a[i][4] + 31;
			}
			else if (x == 5)
			{
			m = 31 + 28 + a[i][4] + 31 + 30;
			}
			else if (x == 6)
			{
			m = 31 + 28 + a[i][4] + 31 + 30 + 31;
			}
			else if (x == 7)
			{
			m = 31 + 28 + a[i][4] + 31 + 30 + 31 + 30;
			}
			else if (x == 8)
			{
			m = 31 + 28 + a[i][4] + 31 + 30 + 31 + 30 + 31;
			}
			else if (x == 9)
			{
			m = 31 + 28 + a[i][4] + 31 + 30 + 31 + 30 + 31 + 31;
			}
			else if (x == 10)
			{
			m = 31 + 28 + a[i][4] + 31 + 30 + 31 + 30 + 31 + 31 + 30;
			}
			else if (x == 11)
			{
			m = 31 + 28 + a[i][4] + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
			}

			if (y == 2)
			{
			d = 31;
			}
			else if (y == 3)
			{
			d = 31 + 28 + a[i][4];
			}
			else if (y == 4)
			{
			d = 31 + 28 + a[i][4] + 31;
			}
			else if (y == 5)
			{
			d = 31 + 28 + a[i][4] + 31 + 30;
			}
			else if (y == 6)
			{
			d = 31 + 28 + a[i][4] + 31 + 30 + 31;
			}
			else if (y == 7)
			{
			d = 31 + 28 + a[i][4] + 31 + 30 + 31 + 30;
			}
			else if (y == 8)
			{
			d = 31 + 28 + a[i][4] + 31 + 30 + 31 + 30 + 31;
			}
			else if (y == 9)
			{
			d = 31 + 28 + a[i][4] + 31 + 30 + 31 + 30 + 31 + 31;
			}
			else if (y == 10)
			{
			d = 31 + 28 + a[i][4] + 31 + 30 + 31 + 30 + 31 + 31 + 30;
			}
			else if (y == 11)
			{
			d = 31 + 28 + a[i][4] + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
			}
			else if (y == 12)
			{
			d = 31 + 28 + a[i][4] + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
			}

			e = d - m;
			f = e - (e / 7) * 7;

			if (f == 0)
			{
			System.out.print("YES\n");
			}
			else
			{
			System.out.print("NO\n");
			}
		}

	}
}

