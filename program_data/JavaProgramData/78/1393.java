package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int i;
		char[] name = {'0', '0', '0', '0', '0', '0'};
		for (z = 1;z <= 5;z++)
		{
			  for (q = 1;q <= 5;q++)
			  {
				 for (s = 1;s <= 5;s++)
				 {
					for (l = 1;l <= 5;l++)
					{
						if (z + q == s + l && z + l > s + q && z + s < q && (z - q) * (z - s) * (z - l) * (q - s) * (q - l) * (s - l) != 0)
						{
							name[z] = 'z';
							name[q] = 'q';
							name[s] = 's';
							name[l] = 'l';
						}
					}

				 }

			  }
		}
		for (i = 5;i >= 1;i--)
		{
			if (name[i] != '0')
			{
				System.out.print(name[i]);
				System.out.print(' ');
				System.out.print(i * 10);
				System.out.print("\n");
			}
		}
		return 0;
	}
}
