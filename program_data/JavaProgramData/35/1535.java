package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[8][8];
		int i;
		int j;
		int k;
		int b;
		int c;
		int d;
		int f = 0;
		int n;
		int m;
			 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 System.in.read();
			 m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
			for (i = 0;i < n;i++)
			{
				b = a[i][0],c = 0; //??i?????
				for (j = 1;j < m;j++)
				{
					if (a[i][j] > b)
					{
						b = a[i][j];
						c = j; //?????????????????
					}
				}
					d = a[0][c];
					for (k = 0;k < n;k++)
					{
						if (a[k][c] < d)
						{
							d = a[k][c];

						} //??????????
					}
						if (d == a[i][c])
						{
							System.out.print(i);
							System.out.print("+");
							System.out.print(c);
							System.out.print("\n");
						}
						else
						{
							f++;
						}
			}
			if (f == n)
			{
				System.out.print("No");
				System.out.print("\n");
			}
			return 0;
	}
}

