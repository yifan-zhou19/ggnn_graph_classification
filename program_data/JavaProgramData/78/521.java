package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A = 0;
		int B = 0;
		int C = 0;
		char[] d = {'0', '0', '0', '0', '0', '0'};
		int z = 0;
		int q = 0;
		int s = 0;
		int l = 0;
		int i = 0;
		for (z = 1;z <= 5;z++)
		{
			for (q = 1;q <= 5;q++)
			{
				if (z == q)
				{
					continue;
				}
				for (s = 1;s <= 5;s++)
				{
					if (z == s || q == s)
					{
						continue;
					}
					for (l = 1;l <= 5;l++)
					{
						A = 0;
						B = 0;
						C = 0;
						if (z == l || q == l || s == l)
						{
							continue;
						}

						if ((z + q) == (s + l) && (z + l) > (s + q) && (z + s) < q)
						{
							d[z] = 'z';
							d[q] = 'q';
							d[s] = 's';
							d[l] = 'l';

						}
					}
				}
			}
		}
		for (i = 5;i > 0;i--)
		{
			if (d[i] != '0')
			{
				System.out.print(d[i]);
				System.out.print(" ");
				System.out.print(i * 10);
				System.out.print("\n");
			}
		}
		return 0;
	}
}
