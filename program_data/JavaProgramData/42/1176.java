package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[200000];
		int n = 0;
		int i = 0;
		int m = 0;
		int j = 0;
		int k = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			if (a[i] == m)
			{
				k += 1;
				for (j = i;j < n - k + 1;j++)
				{
					a[j] = a[j + 1];
				}
			}
			if (a[i] == m)
			{
				i = i - 1;
			}
				//k+=1;
		}
			for (i = 0;i < n - k;i++)
			{
				if (i == n - k - 1)
				{
				System.out.print(a[i]);
				System.out.print("\n");
				}
				else
				{
					System.out.print(a[i]);
					System.out.print(" ");
				}
			}
			return 0;
	}


}

