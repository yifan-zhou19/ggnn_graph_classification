package <missing>;

public class GlobalMembers
{
	public static int comp(Object a, Object b)
	{
	return *(int)a - (int)b;
	}
	public static int Main()
	{
		int n;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (n == 0)
			{
				break;
			}
			int[] a = new int[n];
			int[] b = new int[n];
			int i;
			int j;
			for (i = 0;i < n;i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0;i < n;i++)
			{
				b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			qsort(a,n,(Integer.SIZE / Byte.SIZE),comp);
			qsort(b,n,(Integer.SIZE / Byte.SIZE),comp);
			int first1 = 0;
			int first2 = 0;
			int last1 = n - 1;
			int last2 = n - 1;
			int sum = 0;
			while (first2 <= last2)
			{
					if (a[last1] > b[last2])
					{
						sum = sum + 200;
						last1--;
						last2--;
						continue;
					}
					if (a[last1] < b[last2])
					{
						sum = sum - 200;
						first1++;
						last2--;
						continue;
					}
					if (a[last1] == b[last2])
					{
						if (a[first1] < b[first2])
						{
							sum = sum - 200;
							last2--;
							first1++;
							continue;
						}
						if (a[first1] > b[first2])
						{
							sum = sum + 200;
							first2++;
							first1++;
							continue;
						}
						if (a[first1] == b[first2])
						{
						if (a[first1] < b[last2])
						{
							sum = sum - 200;
						}
						if (a[first1] == b[last2])
						{
							sum = sum;
						}
						if (a[first1] > b[last2])
						{
							sum = sum + 200;
						}
						first1++;
						last2--;
						continue;
						}
					}
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

