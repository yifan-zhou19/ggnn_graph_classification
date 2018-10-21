package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int rn;
		int[] a = new int[1001];
		int[] b = new int[1001];
		int t;
		int i;
		int j;
		int as;
		int ae;
		int bs;
		int be;
		int c;
		while (true)
		{
			rn = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (rn == 0)
			{
				break;
			}
			for (i = 0;i < rn; i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0;i < rn; i++)
			{
				b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0; i < rn - 1; i++)
			{
				for (j = i + 1; j < rn; j++)
				{
					if (a[i] < a[j])
					{
						t = a[i];
						a[i] = a[j];
						a[j] = t;
					}
				}
			}
			for (i = 0; i < rn - 1; i++)
			{
				for (j = i + 1; j < rn; j++)
				{
					if (b[i] < b[j])
					{
						t = b[i];
						b[i] = b[j];
						b[j] = t;
					}
				}
			}
			as = 0;
			ae = rn - 1;
			bs = 0;
			be = rn - 1;
			c = 0;
			while (as <= ae != 0 && bs <= be)
			{
				if (a[ae] > b[be])
				{
					c++;
					ae--;
					be--;
					continue;
				}
				if (a[ae] < b[be])
				{
					c--;
					ae--;
					bs++;
					continue;
				}
				if (a[as] > b[bs])
				{
					c++;
					as++;
					bs++;
					continue;
				}
				if (a[as] < b[bs])
				{
					c--;
					ae--;
					bs++;
					continue;
				}
				if (a[as] == b[bs])
				{
					if (a[ae] < b[bs])
					{
						c--;
					}
					ae--;
					bs++;
					continue;
				}
			}
			System.out.print(c * 200);
			System.out.print("\n");
		}
		return 0;
	}
}

