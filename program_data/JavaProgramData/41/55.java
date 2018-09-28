package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int i;
		int j;
		int counter;
		int[] chang = new int[6];
		int[] panduan = new int[6];
		for (i = 0;i <= 5;i++)
		{
			chang[i] = 0;
		}
		char cc;
		for (a = 1;a <= 5;a++)
		{
			for (b = 1;b <= 5;b++)
			{
				for (c = 1;c <= 5;c++)
				{
					for (d = 1;d <= 5;d++)
					{
						e = 15 - a - b - c - d;
						if ((a != b) && (a != c) & (a != d) && (a != e) && (b != c) && (b != d) && (b != e) && (c != d) && (c != e) && (d != e) && (e != 2) && (e != 3))
						{
							chang[1] = a;
							chang[2] = b;
							chang[3] = c;
							chang[4] = d;
							chang[5] = e;
							for (i = 0;i <= 5;i++)
							{
								panduan[i] = 0;
							}
							if (e == 1)
							{
								panduan[a]++;
							}
							if (b == 2)
							{
								panduan[b]++;
							}
							if (a == 5)
							{
								panduan[c]++;
							}
							if (c != 1)
							{
								panduan[d]++;
							}
							if (d == 1)
							{
								panduan[e]++;
							}
							if ((panduan[1] == 1) && (panduan[2] == 1) && (panduan[3] == 0) && (panduan[4] == 0) && (panduan[5] == 0))
							{
								for (i = 1;i <= 4;i++)
								{
									System.out.print(chang[i]);
									System.out.print(" ");
								}
								System.out.print(chang[5]);
							}
						}
					}
				}
			}
		}
		return 0;
	}
}
