package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[4]; //????a[4]???????????sum????????i,k??????
		int sum = 0;
		int i = 0;
		int k = 0;
		String rank = new String(new char[4]); //?????rank[4]?????????????????
		rank = tangible.StringFunctions.changeCharacter(rank, 0, 'z');
		rank = tangible.StringFunctions.changeCharacter(rank, 1, 'q');
		rank = tangible.StringFunctions.changeCharacter(rank, 2, 's');
		rank = tangible.StringFunctions.changeCharacter(rank, 3, 'l');
		for (a[0] = 1;a[0] <= 5;a[0]++)
		{
			for (a[1] = 1;a[1] <= 5;a[1]++)
			{
				if (a[0] == a[1])
				{
					continue;
				}
				for (a[2] = 1;a[2] <= 5;a[2]++)
				{
					if (a[0] == a[2] || a[1] == a[2])
					{
						continue;
					}
					for (a[3] = 1;a[3] <= 5;a[3]++)
					{
						if (a[0] == a[3] || a[1] == a[3] || a[2] == a[3])
						{
							continue;
						}
						sum = ((a[0] + a[1]) == (a[2] + a[3])) + ((a[0] + a[3]) > (a[1] + a[2])) + ((a[0] + a[2]) < a[1]);
						if (sum == 3)
						{
							for (k = 5;k > 0;k--)
							{
								for (i = 0;i < 4;i++)
								{
									if (a[i] == k)
									{
										System.out.print(rank.charAt(i));
										System.out.print(' ');
										System.out.print(a[i] * 10);
										System.out.print("\n");
									}
								}
							}
						}
					}
				}
			}
		}
		System.in.read();
		System.in.read();
		return 0;
	}
}

