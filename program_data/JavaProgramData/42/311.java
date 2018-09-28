package <missing>;

public class GlobalMembers
{
	/*DELETE NUMBERS
	Author:??
	Date:10/31*/
	public static int Main()
	{
		int[] a = new int[100000];
		int i;
		int n;
		int k;
		int j;
		int count = 0;

			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
			k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0, j = 0; j < n; j++)
		{
			if (a[j] != k)
			{
				a[i] = a[j];
				i++;
			}
			else
			{
				count++; //?????????                                        //???????????
			}
		}
		for (i = 0; i < n - count - 1; i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		if (i == n - count - 1)
		{
			System.out.print(a[i]);
		}
		return 0;
	}

}

