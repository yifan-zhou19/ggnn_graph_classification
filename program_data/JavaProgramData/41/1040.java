package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[5];
		int[] b = new int[5];
		int i;
		int j;
		int k;
		for (a[0] = 1; a[0] <= 5; a[0]++)
		{
			for (a[1] = 1; a[1] <= 5; a[1]++)
			{
				for (a[2] = 1; a[2] <= 5; a[2]++)
				{
					for (a[3] = 1; a[3] <= 5; a[3]++)
					{
						for (a[4] = 1; a[4] <= 5; a[4]++)
						{
							k = 0;
							int flag = 1;
							for (i = 0; i < 4; i++)
							{
								for (j = i + 1; j < 5; j++)
								{
									if (a[i] == a[j])
									{
										flag = 0;
									}
								}
							}
							if (flag == 1 && a[4] != 2 && a[4] != 3)
							{
								b[0] = (a[4] == 1);
								b[1] = (a[1] == 2);
								b[2] = (a[0] == 5);
								b[3] = (a[2] != 1);
								b[4] = (a[3] == 1);
								if (b[0] + b[1] + b[2] + b[3] + b[4] == 2)
								{
									for (i = 0; i < 5; i++)
									{
										if ((a[i] == 1 || a[i] == 2) && b[i] == 1)
										{
											k++;
										}
									}
									if (k == 2)
									{
										System.out.print(a[0]);
										System.out.print(" ");
										System.out.print(a[1]);
										System.out.print(" ");
										System.out.print(a[2]);
										System.out.print(" ");
										System.out.print(a[3]);
										System.out.print(" ");
										System.out.print(a[4]);
										System.out.print("\n");
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
