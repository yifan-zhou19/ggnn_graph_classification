package <missing>;

public class GlobalMembers
{
	//*????1000012912_004.cpp
	//*??????
	//*?????2010.10.27
	//*??????????
	public static int Main()
	{
		int n; //????
		int i;
		int j;
		int k;
		int m;
		int[] a = new int[20000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++) //???????
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = 0; j < n; j++)
		{
			for (k = j + 1; k < n; k++)
			{
				if (a[j] == a[k]) //??j+1????k+1????
				{
					for (m = k + 1; m < n; m++) //?????????
					{
						a[m - 1] = a [m];
					}
					n -= 1; //?????
					k -= 1;
				}
			}
		}
		for (i = 0; i < n - 1; i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print(a[n - 1]);
		return 0;
	}
}

