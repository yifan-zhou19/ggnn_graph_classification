package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[100000][2];
		int i = 0;
		int j = 0;
		int k;
		int[] b = new int[100000];
		int[] count = new int[100000];
		int t = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		do
		{
			a[i][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			i++;
		} while (a[i - 1][0] != 0 || a[i - 1][1] != 0); //????????????0
		k = i - 1; //?????????
		for (i = 0; i < k; i++)
		{
			b[a[i][0]]++; //????????????????
		}
		while (j < n)
		{
			if (b[j] == 0) //????????????
			{
				for (i = 0; i < k; i++)
				{
					if (a[i][1] == j)
					{
						count[j]++; //??????????????????
					}
				}
				if (count[j] == n - 1)
				{
					t++;
					System.out.print(j);
					System.out.print("\n");
				}
				j++;
			}
			else
			{
				j++;
			}
		}
		if (t == 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}

}

