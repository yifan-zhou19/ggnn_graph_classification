package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[1002];
		int[] b = new int[1002];
		int first1;
		int first2;
		int last1;
		int last2;
		int prize;
		int i;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (n == 0)
			{
				break;
			}
			first1 = first2 = 0;
			last1 = last2 = n - 1;
			prize = 0;
			for (i = 0; i < n; i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i] = Integer.parseInt(tempVar);
				}
			}
			for (i = 0; i < n; i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					b[i] = Integer.parseInt(tempVar2);
				}
			}
			sort(a, a + n);
			sort(b, b + n);
			while (first1 <= last1)
			{
				if (a[first1] > b[first2])
				{
					prize += 200;
					first1++;
					first2++;
				}
				else if (a[first1] < b[first2])
				{
					prize -= 200;
					first1++;
					last2--;
				}
				else
				{
					while (first1 <= last1)
					{
						if (a[last1] > b[last2])
						{
							prize += 200;
							last1--;
							last2--;
						}
						else if (a[last1] <= b[last2])
						{
							if (a[first1] < b[last2])
							{
								prize -= 200;
							}
							else if (a[first1] > b[last2])
							{
								prize += 200;
							}
							first1++;
							last2--;
							break;
						}
					}
				}
			}
			System.out.print(prize);
			System.out.print("\n");
		}
		return 0;
	}
}

