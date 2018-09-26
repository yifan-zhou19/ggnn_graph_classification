package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] a = new int[1001];
	public static int[] b = new int[1001];


	public static int mycompare(Object p1, Object p2)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a1,*a2;
		int a1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a2;
		int a2;
		a1 = (int)p1;
		a2 = (int)p2;
		return a2 - a1;
	}

	public static int Main()
	{
		int i;
		int j;
		int k1;
		int k2;
		int la;
		int lb;
		int ra;
		int rb;
		int total;

		while (true)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (n == 0)
			{
				break;
			}

			for (i = 0;i < n;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i] = Integer.parseInt(tempVar);
				}
			}
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					b[i] = Integer.parseInt(tempVar2);
				}
			}

			qsort(a,n,(Integer.SIZE / Byte.SIZE),mycompare);
			qsort(b,n,(Integer.SIZE / Byte.SIZE),mycompare);

			total = 0;
			la = 0;
			lb = 0;
			ra = n - 1;
			rb = n - 1;

			while (la <= ra)
			{
				if (a[la] > b[lb])
				{
					total = total + 200;
					la++;
					lb++;
				}
				else
				{
					if (a[la] < b[lb])
					{
						total = total - 200;
						lb++;
						ra--;
					}
					else
					{

						for (k1 = ra,k2 = rb;la <= k1; k1--,k2--)
						{
							if (a[k1] > b[k2])
							{
								total = total + 200;
								ra--;
								rb--;
							}
							else
							{
								if (a[k1] < b[lb])
								{
									total = total - 200;
								}
								ra = k1;
								rb = k2;
								ra--;
								lb++;
								break;
							}
						}
					}
				}
			}
			System.out.print(total);
			System.out.print("\n");
		}
		return 0;
	}


}

