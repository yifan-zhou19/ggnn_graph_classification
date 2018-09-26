package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		char[] a = {0, 0, 0, 0, 0, 0};
		for (z = 1;z <= 5;z++)
		{
			for (q = 1;q <= 5;q++)
			{
				for (s = 1;s <= 5;s++)
				{
					for (l = 1;l <= 5;l++)
					{
						if ((z == q) || (q == s) || (s == l) || (z == s) || (q == l))
						{
							continue;
						}
						if ((z + q == s + l) && (z + l > s + q) && (z + s < q))
						{
							a[z] = 'z';
							a[q] = 'q';
							a[s] = 's';
							a[l] = 'l';

							for (int i = 5;i >= 1;i--)
							{
								if (a[i] == 0)
								{
									continue;
								}
								System.out.print(a[i]);
								System.out.print(" ");
								System.out.print(i * 10);
								System.out.print("\n");
							}
						}
					}
				}
			}
		}
	   return 0;
	}
}
