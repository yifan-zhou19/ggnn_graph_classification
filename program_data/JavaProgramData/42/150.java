package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int j;
		int t = 0;
		int s;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] J = new int[100000];
		for (i = 0 ; i < n ; i++)
		{
			J[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 0 ; j < n - t ; j++)
		{
			if (J[j] != k)
			{
			  continue;
			}
			t++;
			for (s = j + 1 ; s <= n - t; s++)
			{
				J[s - 1] = J[s];
			}
			j--;
		}
		for (m = 0 ; m < n - t - 1 ; m++)
		{
			 System.out.print(J[m]);
			 System.out.print(" ");
		}
		System.out.print(J[n - t - 1]);
		System.out.print("\n");
		return 0;
	}

}

