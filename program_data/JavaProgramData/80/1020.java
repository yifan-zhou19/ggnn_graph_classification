package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int[] a = new int[2];
		int[] b = new int[12];
		int[] d = new int[2];
		int sd0;
		int sd;
		int ed0;
		int ed;
		d[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sd = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ed = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int ld;

		if (d[0] == d[1])
		{
			if ((d[0] & 400 == 0) || (d[0] % 4 == 0 && d[0] % 100 != 0))
			{
					ld = 29;
			}
				else
				{
					ld = 28;
				}
			if (a[0] == a[1])
			{
				System.out.print(ed - sd);
				System.out.print("\n");
			}
			else
			{
				int s = 0;
				for (j = a[0];j <= a[1] - 1;j++)
				{
					switch (j)
					{
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
						b[j] = 31;
						break;
					case 2:
						b[j] = ld;
						break;
					case 4:
					case 6:
					case 9:
					case 11:
						b[j] = 30;
						break;
					}
					s += b[j];
				}
				System.out.print(s - sd + ed);
				System.out.print("\n");
			}
		}


		else
		{
			int z = 0;
			int D = 0;
			int[] c = new int[2];
			for (i = d[0];i <= d[1] - 1;i++)
			{
				if ((i % 400 == 0) || (i % 4 == 0 && i % 100 != 0))
				{
					z++;
				}
			}
			for (k = 0;k <= 1;k++)
			{
				for (int x = 0;x <= a[k] - 1;x++)
				{
					if ((d[k] & 400 == 0) || (d[k] % 4 == 0 && d[k] % 100 != 0))
					{
					ld = 29;
					}
				else
				{
					ld = 28;
				}
					switch (x)
					{
					case 0:
						b[x] = 0;
						break;
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
						b[x] = 31;
						break;
					case 2:
						b[x] = ld;
						break;
					case 4:
					case 6:
					case 9:
					case 11:
						b[x] = 30;
						break;
					}
					c[k] += b[x];
				}
			}

			D = (d[1] - d[0] - z) * 365 + z * 366 - c[0] - sd + c[1] + ed;
			System.out.print(D);
			System.out.print("\n");
		}

		return 0;
	}
}

