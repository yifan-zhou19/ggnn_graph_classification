package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[3]);
		int i;
		int j;
		int k;
		int l;
		int[] b = new int[3];
		for (i = 0;i < 3;i++)
		{
			for (j = 0;j < 3;j++)
			{
				for (k = 0;k < 3;k++)
				{
					if (i == j || i == k || j == k)
					{
						continue;
					}
					b[0] = ((i < j) + (i == k) + i);
					b[1] = ((i > j) + (i > k) + j);
					b[2] = ((k > j) + (j > i) + k);
					if ((b[0] + b[1] + b[2]) == 6)
					{
						a = tangible.StringFunctions.changeCharacter(a, i, 'A');
						a = tangible.StringFunctions.changeCharacter(a, j, 'B');
						a = tangible.StringFunctions.changeCharacter(a, k, 'C');
					}
				}
			}
		}
				for (l = 0;l < 3;l++)
				{
						System.out.print(a.charAt(l));
				}
							return 0;
	}
}

