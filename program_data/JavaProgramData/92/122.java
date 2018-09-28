package <missing>;

public class GlobalMembers
{
	public static int cmp(Object elem1, Object elem2)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int * p1,*p2;
		int p1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p2;
		int p2;
		p1 = (int) elem1;
		p2 = (int) elem2;
		if (p1 < p2)
		{
			return 1;
		}
		if (p1 == p2)
		{
			return 0;
		}
		if (p1 > p2)
		{
			return -1;
		}
	}


	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[1005];
		int[] b = new int[1005];
		int p1;
		int p2;
		int end1;
		int end2;
		int win;
		while (true)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (n == 0)
			{
				break;
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b,0,(Integer.SIZE / Byte.SIZE));
			for (i = 0;i < n;i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0;i < n;i++)
			{
				b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}

			qsort(a, n,(Integer.SIZE / Byte.SIZE),cmp);
			qsort(b, n,(Integer.SIZE / Byte.SIZE),cmp);

			win = 0;


			for (p1 = 0, p2 = 0, end1 = n - 1, end2 = n - 1 ; p1 <= end1 != 0 && p2 <= end2 ;)
			{
				if (a[p1] > b[p2])
				{
					win++;
					p1++;
					p2++;
				}
				if (a[p1] < b[p2])
				{
					win--;
					end1--;
					p2++;
				}
				if (a[p1] == b[p2])
				{
					if (a[end1] > b[end2])
					{
						win++;
						end1--;
						end2--;
					}
					else if (a[end1] == b[end2])
					{
						if (a[end1] == b[p2])
						{
							end1--;
							p2++;
						}
						else
						{
							win--;
							end1--;
							p2++;
						}
					}
					else
					{
						win--;
						end1--;
						p2++;
					}
				}
			}
			System.out.print(win * 200);
			System.out.print("\n");

		}
		return 0;
	}

}

