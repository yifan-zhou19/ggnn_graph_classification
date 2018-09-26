package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[4];
		int[] b = new int[4];
		int T;
		int i;
		int j;
		int[] c = new int[4];
		for (a[0] = 1;a[0] < 6;a[0]++)
		{
			for (a[1] = 1;a[1] < 6;a[1]++)
			{
				for (a[2] = 1;a[2] < 6;a[2]++)
				{
					for (a[3] = 1;a[3] < 6;a[3]++)
					{
						if ((a[0] + a[1] == a[2] + a[3]) + (a[0] + a[3] > a[1] + a[2]) + (a[0] + a[2] < a[1]) == 3 && a[0] != a[1] && a[0] != a[2] && a[0] != a[3] && a[1] != a[2] && a[1] != a[3] && a[2] != a[3])
						{
							for (i = 0;i < 4;i++)
							{
								c[i] = a[i];
							}

							for (i = 0;i < 4;i++)
							{
								b[i] = a[i];
								for (j = i;j < 4;j++)
								{
									if (b[i] < a[j])
									{
										T = a[j];
										a[j] = b[i];
										b[i] = T;
									}
								}
							}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
							goto finish;
						}
					}
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	finish:
		for (i = 0;i < 4;i++)
		{
			for (j = 0;j < 4;j++)
			{
				if (b[i] == c[j])
				{
					if (j == 0)
					{
						System.out.print("z ");
						System.out.print(b[i] * 10);
						System.out.print("\n");
					}
					else if (j == 1)
					{
						System.out.print("q ");
						System.out.print(b[i] * 10);
						System.out.print("\n");
					}
					else if (j == 2)
					{
						System.out.print("s ");
						System.out.print(b[i] * 10);
						System.out.print("\n");
					}
					else if (j == 3)
					{
						System.out.print("l ");
						System.out.print(b[i] * 10);
						System.out.print("\n");
					}
					break;
				}
			}
		}




						return 0;

	}
}
