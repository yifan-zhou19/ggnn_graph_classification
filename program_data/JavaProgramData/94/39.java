package <missing>;

public class GlobalMembers
{
	/*
	@ ??????.cpp
	@ 1000012895
	@ ???
	@ 2010/10/31
	*/
	public static int Main()
	{
		int N;
		int[] a = new int[501];
		int[] b = new int[501];
		int i;
		int j;
		int k;
		int temp1;
		int temp2 = 0;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= N; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		j = 1;
		for (i = 1; i <= N; i++)
		{
			if (a[i] % 2 != 0)
			{
				b[j] = a[i];
				j++;
			}
		}
		j--;
		for (i = 1; i < j; i++)
		{
			for (k = 1; k < j - i + 1; k++)
			{
				if (b[k] > b[k + 1])
				{
					temp1 = b[k];
					b[k] = b[k + 1];
					b[k + 1] = temp1;
				}
			}
		}
		for (i = 1; i <= j; i++)
		{
			if (temp2 == 0)
			{
				System.out.print(b[i]);
			}
			else
			{
				System.out.print(',');
				System.out.print(b[i]);
			}
			temp2++;
		}
		return 0;
	}
}

