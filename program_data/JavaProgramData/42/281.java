package <missing>;

public class GlobalMembers
{
	//*****************************************************
	// ?? - ???????? 
	// ??   1000012818
	// 2010 10 30
	//******************************************************
	public static int Main()
	{
		int n; //???????
		int k;
		int m;
		int i;
		int j;
		int[] a = new int[100001];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = n;
		for (i = 0; i <= n - 1; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		i = 0;
		while (i <= n - 1)
		{
			if (a[i] == k) //???????????????
			{
				for (j = i; j <= n - 1; j++)
				{
					a[j] = a[j + 1]; //????????????????
				}
				m = m - 1; //???????
				i--; //???????????????
			}
			i++;
		}
		for (i = 0; i <= m - 1; i++)
		{
			if (i == m - 1)
			{
				System.out.print(a[i]);
				System.out.print("\n");
			}
			else
			{
				System.out.print(a[i]);
				System.out.print(" ");
			}
		}
		return 0;
	}
}

