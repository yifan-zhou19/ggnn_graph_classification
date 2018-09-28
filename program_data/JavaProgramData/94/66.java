package <missing>;

public class GlobalMembers
{
	//******************************************
	//???????????
	//??????
	//?????2010.11.19
	//??????????????
	//******************************************
	public static int Main()
	{
		int[] a = new int[500]; //????????
		int N; //???????????i,j?m, n,????temp
		int i;
		int j;
		int temp;
		int m;
		int n;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < N; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < N - 1; i++)
		{
			for (j = 0;j < N - i - 1;j++)
			{
				if (a[j] > a[j + 1])
				{
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				} //??????????
			}
		}
		for (m = 0; m < N; m++)
		{
			if ((a[m] % 2) != 0)
			{
				System.out.print(a[m]);
				break;
			} //?????????
		}
		for (n = m + 1; n < N; n++)
		{
			if ((a[n] % 2) != 0)
			{
				System.out.print(",");
				System.out.print(a[n]);
			}
		} //???????????
		System.out.print("\n");
		return 0;
	}
}

