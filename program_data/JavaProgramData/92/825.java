package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int i;
		int j;
		int al;
		int ar;
		int bl;
		int br;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (n == 0)
			{
				break;
			}
			for (i = 0; i < n; i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0; i < n; i++)
			{
				b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			sort(a, a[n]);
			sort(b, b[n]);

			int total = 0;
			al = bl = 0;
			ar = br = n - 1;
			while (al <= ar)
			{
				if (a[al] > b[bl])
				{
					total += 200;
					al++;
					bl++;
				}
				else if (a[ar] > b[br])
				{
					total += 200;
					ar--;
					br--;
				}
				else
				{
					if (a[al] < b[br])
					{
						total -= 200;
						al++;
						br--;
					}
					else
					{
						if (a[al] > b[br])
						{
							total += 200;
						}
						al++;
						br--;
					}
				}
			}
			System.out.print(total);
			System.out.print("\n");
		}
		return 0;
	}
}

