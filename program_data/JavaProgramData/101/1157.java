package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		int[] b = new int[3];
		for (i = 0;i < 3;i++)
		{
			for (j = 0;j < 3;j++)
			{
				if (i != j)
				{
					for (k = 0;k < 3;k++)
					{
						if (k != i && k != j)
						{
							b[0] = (j > i) + (i == k);
							b[1] = (i > j) + (i > k);
							b[2] = (k > j) + (j > i);
							if (b[0] == 2 - i && b[1] == 2 - j && b[2] == 2 - k)
							{
								if (i == 0)
								{
									if (j == 1)
									{
										System.out.print("ABC");
									}
									else
									{
										System.out.print("ACB");
									}
								}
								if (j == 0)
								{
									if (i == 1)
									{
										System.out.print("BAC");
									}
									else
									{
										System.out.print("BCA");
									}
								}
								if (k == 0)
								{
									if (i == 1)
									{
										System.out.print("CAB");
									}
									else
									{
										System.out.print("CBA");
									}
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
