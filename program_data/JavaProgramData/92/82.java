package <missing>;

public class GlobalMembers
{
	public static int Compare(Object e1, Object e2)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p1,*p2;
		int p1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p2;
		int p2;
		p1 = (int)e1;
		p2 = (int)e2;
		return (p2) - p1;
	}

	public static int Main()
	{
		int[] a = new int[1001];
		int[] b = new int[1001];
		int n;
		int i;
		int l1;
		int l2;
		int r1;
		int r2;
		int ying;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (n == 0)
			{
				break;
			}
			else
			{
				ying = 0;
				l1 = 0;
				l2 = 0;
				r2 = n - 1;
				r1 = n - 1;
				for (i = 0;i < n;i++)
				{
					a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
				for (i = 0;i < n;i++)
				{
					b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
				qsort(a,n,(Integer.SIZE / Byte.SIZE),Compare);
				qsort(b,n,(Integer.SIZE / Byte.SIZE),Compare);
				while (l1 < r1 && l2 < r2)
				{
					if (a[l1] > b[l2])
					{
						ying++;
						l1++;
						l2++;
					}
					else
					{
						if (a[l1] < b[l2])
						{
							ying--;
							l2++;
							r1--;
						}
						else
						{
							if (a[r1] > b[r2])
							{
								ying++;
								r1--;
								r2--;
							}
							else
							{
								if (a[r1] == b[r2])
								{
									if (b[l2] > a[r1])
									{
										ying--;
									}
									l2++;
									r1--;
								}
								else
								{
									ying--;
									r1--;
									l2++;
								}
							}
						}
					}
				}
				if (a[l1] > b[l2])
				{
					ying++;
				}
				if (a[l1] < b[l2])
				{
					ying--;
				}
				System.out.print(200 * ying);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

