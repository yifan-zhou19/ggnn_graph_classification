package <missing>;

public class GlobalMembers
{
	//*********************************
	//    ??????????        *
	//    ??????                *
	//    ?????2012.10           *
	//*********************************
	public static int Main() //?????
	{
		int[] a = new int[500]; //????
		int[] b = new int[500];
		int N; //????????N?????i,j,k?????p
		int i = 1;
		int j = 1;
		int k = 1;
		int p;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= N;i++) //?a[]??
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i <= N;i++) //?????????b[]
		{
			if (a[i] % 2 == 1)
			{
				b[j] = a[i];
				j++;
			}
		}
		for (i = 1;i <= j - 2;i++) //????????b[]??
		{
			for (k = 1;k <= j - 1 - i;k++)
			{
				if (b[k] > b[k + 1])
				{
					p = b[k];
					b[k] = b[k + 1];
					b[k + 1] = p;
				}
			}
		}
		for (i = 1;i <= j - 2;i++) //???????
		{
			System.out.print(b[i]);
			System.out.print(",");
		}
		System.out.print(b[j - 1]);
		System.out.print("\n");
		return 0;
	}
}

