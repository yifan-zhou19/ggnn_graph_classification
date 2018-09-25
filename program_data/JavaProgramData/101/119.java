package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] r = new int[4];
		int A;
		int B;
		int C;
		int i;
		int j;
		final String a = "ABC";
		for (r[1] = 1; r[1] <= 3; r[1]++)
		{
			for (r[2] = 1; r[2] <= 3; r[2]++)
			{
				for (r[3] = 1; r[3] <= 3; r[3]++)
				{
					if (r[1] + r[2] + r[3] != 6 || r[1] * r[2] * r[3] != 6)
					{
						continue;
					}
					A = (r[2] > r[1]) + (r[3] == r[1]);
					B = (r[1] > r[2]) + (r[1] > r[3]);
					C = (r[3] > r[2]) + (r[2] > r[1]);
					if (r[1] + A == 3 && r[2] + B == 3 && r[3] + C == 3)
					{
						for (i = 1; i <= 3; i++)
						{
							for (j = 1; j <= 3; j++)
							{
								if (r[j] == i)
								{
									System.out.print(a.charAt(j - 1));
									break;
								}
							}
						}
					}
				}
			}
		}
		return 0;
	}
}
