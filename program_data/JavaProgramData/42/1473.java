package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[100000];
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n;)
		{
			if (a[i] == k)
			{
				for (j = i + 1; j < n ; j++)
				{
					a[j - 1] = a[j];
				}
				n--;
			}
			else
			{
				i++;
			}
		}
		for (int m = 0; m < n - 1; m++)
		{
			System.out.print(a[m]);
			System.out.print(" ");
		}
		System.out.print(a[n - 1]);
		return 0;
	}

}

