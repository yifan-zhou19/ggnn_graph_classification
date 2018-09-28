package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int N; //N?????????cutnum??????
		 int cutnum;
		 int sum = 0; //sum??????????
		 int j = 0;

		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		final int n = N; //?n?????

		int[] a = new int[n];

		for (int i = 0; i < n; i++)
		{
			 a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		cutnum = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		while (j < n - sum) //?j????????????
		{
			 if (a[j] == cutnum) //??a[j]?????????sum?1
			 {
				 sum++;
					for (int k = j; k < n - 1; k++)
					{
							 a[k] = a[k + 1]; //????????
					}
				 j--;
			 }
			else
			{
				j++;
			}
		}

		for (int l = 0; l < n - sum - 1; l++) //??????
		{
			 System.out.print(a[l]);
			 System.out.print(" ");
		}
		System.out.print(a[n - sum - 1]);
		System.out.print("\n");

		return 0;
	}
}

