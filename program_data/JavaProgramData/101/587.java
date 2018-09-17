package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[3];
		int[] b = new int[3];
		int i = 0;
		int k = 0;
		String rank = new String(new char[3]);
		rank = tangible.StringFunctions.changeCharacter(rank, 0, 'A');
		rank = tangible.StringFunctions.changeCharacter(rank, 1, 'B');
		rank = tangible.StringFunctions.changeCharacter(rank, 2, 'C');
		for (a[0] = 0;a[0] < 3;a[0]++)
		{
			for (a[1] = 0;a[1] < 3;a[1]++)
			{
				for (a[2] = 0;a[2] < 3;a[2]++)
				{
					b[0] = (a[1] > a[0]) + (a[2] == a[0]);
					b[1] = (a[0] > a[1]) + (a[0] > a[2]);
					b[2] = (a[2] > a[1]) + (a[1] > a[0]);
					if (a[0] + b[0] == 2 && a[1] + b[1] == 2 && a[2] + b[2] == 2)
					{
						for (k = 0;k <= 2;k++)
						{
							for (i = 0;i < 3;i++)
							{
								if (a[i] == k)
								{
									System.out.print(rank.charAt(i));
								}
							}
						}
						System.out.print("\n");
					}
				}
			}
		}
		System.in.read();
		System.in.read();
		return 0;
	}
}

