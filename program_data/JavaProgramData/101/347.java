package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int i2;
		int j2;
		int k2;
		for (i = 0;i <= 2;i++)
		{
			for (j = 0;j < 2;j++)
			{
				for (k = 0;k < 2;k++)
				{
					i2 = j2 = k2 = 0;
					if (i == j || i == k || j == k)
					{
						continue;
					}
					if (j > i)
					{
						i2++;
					}
					if (i == k)
					{
						i2++;
					}
					if (i > j)
					{
						j2++;
					}
					if (i > k)
					{
						j2++;
					}
					if (k > j)
					{
						k2++;
					}
					if (j > j)
					{
						k2++;
					}
					if (i + i2 == 2 && j + j2 == 2 && k + k2 == 2)
					{
						if (i > j && j > k)
						{
							System.out.print("CBA");
						}
						if (i > k && k > j)
						{
							System.out.print("BCA");
						}
						if (j > i && i > k)
						{
							System.out.print("CAB");
						}
						if (j > k && k > i)
						{
							System.out.print("ACB");
						}
						if (k > i && i > j)
						{
							System.out.print("BAC");
						}
						if (k > j && j > i)
						{
							System.out.print("ABC");
						}
					}
				}
			}
		}
	}

}
