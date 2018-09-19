package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int s = 0;
		int lena;
		int lenb;
		int x;
		int y;
		int[] a = new int[16];
		int[] b = new int[20];


		while (true)
		{
			while (scanf("%d", a[i]))
			{
				if ((a[i] == 0) || (a[i] == -1))
				{
					break;
				}
				else
				{
					i++;
					continue;
				}
			}

			if (a[0] == -1)
			{
				break;
			}
			else
			{
				lena = i;

				for (x = 0;x < lena;x++)
				{
					for (y = x + 1;y <= lena;y++)
					{
						if ((a[x] == 2 * a[y]) || (a[y] == 2 * a[x]))
						{
							s++;
						}
					}
				}

				b[j] = s;
				s = 0;
			}
			j++;
			for (i = 0;i < 16;i++)
			{
				a[i] = 0;
			}
			i = 0;
		}

		for (i = 0;i < j;i++)
		{
			System.out.printf("%d\n",b[i]);
		}
		return 0;
	}

}
