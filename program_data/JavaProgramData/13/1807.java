package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		// ????????
		// ??? ??? ???????
		// ???k??? ???k-1?????? ????? ????????
		// ??????
		int n;
		int i;
		int j;
		int k;
		int p;
		int t;
		int[] a = new int[20002];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		p = 0;
		for (i = 1; i <= n - 1; i++)
		{
			k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			t = 0;
			for (j = 0; j <= p; j++)
			{
				if (a[j] == k)
				{
					t = 1;
					break;
				}
			}
			if (t == 1)
			{
				continue;
			}
			else
			{
				p = p + 1;
				a[p] = k;
			}
		}
		System.out.print(a[0]);
		for (i = 1; i <= p; i++)
		{
			System.out.print(" ");
			System.out.print(a[i]);
		}
		System.out.print("\n");
		return 0;
	}
}

