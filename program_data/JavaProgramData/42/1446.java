package <missing>;

public class GlobalMembers
{
	//**************************
	//* ??? ????????*
	//* ??? 1200012878      *
	//* 11?2?                *
	//**************************
	public static int Main()
	{
		int n;
		int[] a = new int[100001];
		int k;
		int count;
		int i;
		int j;
		int m;
		int d;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		count = 0;
		for (i = 0; i <= n - 1; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 0; j <= n - 1 - count; j++)
		{
			if (a[j] == k)
			{
				for (d = j ; d < n - 1 - count; d++)
				{
					a[d] = a[d + 1];
				}
				count++;
				j = j - 1;
			}
		}
		for (m = 0; m <= n - 1 - count; m++)
		{
			if (m == n - 1 - count)
			{
				System.out.print(a[m]);
			}
			else
			{
				System.out.print(a[m]);
				System.out.print(" ");
			}
		}
		return 0;
	}

}

