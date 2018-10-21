package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[20001];
		int n;
		int i;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (a[j] == a[i])
				{
					for (k = j;k < n - 1;k++)
					{
						 a[k] = a[k + 1];
					}
				j = j - 1;
				n = n - 1;
				}
			}
		}


		for (i = 0;i < n - 1;i++)
		{
			  System.out.print(a[i]);
			  System.out.print(" ");
		}
		System.out.print(a[n - 1]);
		System.out.print("\n");

	return 0;
	}

}

