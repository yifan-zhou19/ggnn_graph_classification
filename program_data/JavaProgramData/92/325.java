package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1000];
	public static int[] b = new int[1000];
	public static int n;

	public static int mycompare(Object p1, Object p2)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a1;
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
		int z;
		int total;
		int num1;
		int num2;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n == 0)
			{
				break;
			}

			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
			}

			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b[i] = Integer.parseInt(tempVar3);
				}
			}

			qsort(a,n,(Integer.SIZE / Byte.SIZE),mycompare);
			qsort(b,n,(Integer.SIZE / Byte.SIZE),mycompare);
			total = 0;
			i = 0;
			j = 0;
			num1 = n - 1;
			num2 = n - 1;

			while (i <= num1)
			{
				if (a[i] > b[j])
				{
					total = total + 200;
					i++;
					j++;
				}
				else
				{
					if (a[i] < b[j])
					{
						total = total - 200;
						num1--;
						j++;
					}
					else
					{
						for (k1 = num1,k2 = num2;k1 > i;k1--,k2--)
						{
							if (a[k1] > b[k2])
							{
								total = total + 200;
								num1--;
								num2--;
							}
							else
							{
								if (a[k1] < b[j])
								{
									total = total - 200;
								}
								num1 = k1;
								num2 = k2;
								j++;
								break;
							}
						}
						num1--;
					}


				}
			}
			System.out.print(total);
			System.out.print("\n");
		}
		return 0;
	}



}

