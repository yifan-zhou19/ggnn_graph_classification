package <missing>;

public class GlobalMembers
{
	public static int mycompare(Object e1, Object e2)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int * p1,*p2;
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
		int p;
		int count;
		int n;
		int[] a = new int[1001];
		int[] b = new int[1001];
		int s1;
		int s2;
		int e1;
		int e2;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n != 0)
		{

			for (i = 0;i < n;i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0;i < n;i++)
			{
				b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			count = 0;
			qsort(a,n,(Integer.SIZE / Byte.SIZE),mycompare);
			qsort(b,n,(Integer.SIZE / Byte.SIZE),mycompare);
			s1 = s2 = 0;
			e1 = e2 = n - 1;
			for (p = 0;p < n;p++)
			{
				if (a[s1] > b[s2])
				{
					count++;
					s1++;
					s2++;
				}
				else
				{
					if (a[e1] > b[e2])
					{
						e1--;
						e2--;
						count++;
					}
					else
					{
						if (a[e1] < b[s2])
						{
							count--;
						}
						e1--;
						s2++;
					}
				}
			}
			System.out.print(count * 200);
			System.out.print("\n");
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		return 0;
	}


}

