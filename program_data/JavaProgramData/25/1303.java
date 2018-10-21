package <missing>;

public class GlobalMembers
{
	//*********************************
	//* ??? 2?N??               *
	//* ??? ??                   *
	//* ??? 2013.11.15             *
	//*********************************

	public static int Main()
	{
		int N;
		int[] a = new int[50];
		int len = 1;
		a[0] = 1;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 0; i < N; i++)
		{
			for (int j = 0; j < len; j++)
			{
				a[j] *= 2;
			}

			for (int m = 0; m < len; m++)
			{
				if (a[m] > 9)
				{
					a[m] -= 10;
					a[m + 1] += 1;
					if (m == len - 1)
					{
						len++;
					}
				}
			}
		}

		for (int k = len - 1; k >= 0; k--)
		{
			System.out.print(a[k]);
		}
		return 0;
	}









}

