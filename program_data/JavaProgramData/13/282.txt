package <missing>;

public class GlobalMembers
{
	// ???????
	public static int Main()
	{
		int n; // ???????num[20000]?a????????i,j,k???????
		int a;
		int i;
		int j;
		int k = 1;
		int[] num = new int[20000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		num[0] = a; // ???????num[0]
		for (i = 1; i < n; i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0; j < k; j++)
			{
				if (a == num[j])
				{
					break; // ???????????????
				}
			}
			if (j == k) // ??????
			{
				num[k] = a; // ????????
				k = k + 1;
			}
		}
		for (i = 0; i <= k - 2; i++)
		{
			System.out.print(num[i]);
			System.out.print(" ");
		}
		System.out.print(num[k - 1]);
		return 0;
	}



}

