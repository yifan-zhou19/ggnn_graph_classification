package <missing>;

public class GlobalMembers
{
	public static int pfCompare(void elem1, void elem2)
	{
		return *(int)elem2 - (int)elem1;
	}
	public static int Main()
	{
		while (true)
		{
			int n;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (0 == n)
			{
				break;
			}
			else
			{
				int m = 0;
				int p = 0;
				int q = 0;
				int[] a = new int[n];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *b = (int *)malloc(n* sizeof(int));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				int b = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
				int i = 0;
				while (i < n)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						a[i] = Integer.parseInt(tempVar2);
					}
					i++;
				}
				i = 0;
				while (i < n)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						b[i] = tempVar3;
					}
					i++;
				}
				qsort(a,n,(Integer.SIZE / Byte.SIZE),pfCompare);
				qsort(b,n,(Integer.SIZE / Byte.SIZE),pfCompare);
				i = 0;
				while (i < n)
				{
					if (a[i] > b[i])
					{
						m++;
					}
					else if (a[i] < b[i])
					{
						while (a[n - 1] > b[n - 1])
						{
							m++;
							n--;
						}

							p++;
						q = n - 1;
						while (q > i)
						{
							a[q] = a[q - 1];
							q--;
						}
					}
					else
					{
							while (a[n - 1] > b[n - 1])
							{
							m++;
							n--;
							}
							if (a[i] != a[n - 1])
							{
						q = n - 1;
						while (q > i)
						{
							a[q] = a[q - 1];
							q--;
						}
						p++;
							}
							else
							{
							break;
							}
					}
				i++;
				}
				int l = 200 * m - 200 * p;
				System.out.printf("%d\n",l);
			}

		}
		return 0;
	}

}

