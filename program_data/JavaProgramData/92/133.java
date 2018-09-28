package <missing>;

public class GlobalMembers
{
	public static int cmp(Object elem1, Object elem2)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p1,*p2;
		int p1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p2;
		int p2;
		p1 = (int)elem1;
		p2 = (int)elem2;
		return p2 - p1;
	}
	public static int Main()
	{
		int mon = 0;
		int[] a = new int[1001];
		int[] b = new int[1001];
		int n;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (n == 0)
			{
				break;
			}
			mon = 0;
			int i;
			for (i = 0;i < n;i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0;i < n;i++)
			{
				b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			int k;
			int l;
			int j;
			qsort(a,n,(Integer.SIZE / Byte.SIZE),cmp);
			qsort(b,n,(Integer.SIZE / Byte.SIZE),cmp);
			k = 0;
			l = n - 1;
			j = n - 1;
			for (i = 0;i <= j;i++)
			{
				if (a[k] > b[i])
				{
					mon += 200;
					k++;
					continue;
				}
				else if (a[k] < b[i])
				{
					mon -= 200;
					l--;
					continue;
				}
				else
				{
					if (a[l] > b[j])
					{
						l--;
						j--;
						i--;
						mon += 200;
						continue;
					}
					else if (a[l] < b[j])
					{
						l--;
						mon -= 200;
						continue;
					}
					else
					{
						if (a[l] == b[i])
						{
							l--;
							continue;
						}
						else
						{
							mon -= 200;
							l--;
							continue;
						}
					}
				}

			}
			System.out.print(mon);
			System.out.print("\n");
		}
		return 0;
	}

}

