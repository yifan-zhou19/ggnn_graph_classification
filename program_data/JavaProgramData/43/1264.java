package <missing>;

public class GlobalMembers
{
	//*******************************
	//* Name:Goldbach
	//* Author:Sun Zeyu
	//* Editting time:2013.10.17
	//* Function:Goldbach
	//*******************************
	public static int Main()
	{
		int m;
		int x;
		int[] a = new int[2000];
		int i;
		int k = 0;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (x = 3;x < m;x++)
		{
			for (i = 2;i <= x / 2;i++)
			{
				if (x % i == 0)
				{
					break;
				}
			}
			if (i > x / 2)
			{
				a[k] = x;
				k++;
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			for (j = i;j < k;j++)
			{
				if (a[i] + a[j] == m)
				{
					System.out.print(a[i]);
					System.out.print(' ');
					System.out.print(a[j]);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

