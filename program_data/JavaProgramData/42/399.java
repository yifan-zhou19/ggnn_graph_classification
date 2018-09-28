package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100000];
		int i;
		int j;
		int n = 0;
		int k = 0;
		int num = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)

		{
				  if (a[i] == num)

				  {
					  for (j = i;j < n - 1;j++)
					  {
						 a[j] = a[j + 1];
					  }
					 a[n - k - 1] = 0;
					  k = k + 1;
					  i = i - 1;
				  }
		}

		for (i = 0;i < n - k - 1;i++)
		{
				System.out.print(a[i]);
				System.out.print(" ");
		}
		System.out.print(a[n - k - 1]);
		return 0;
	}


}

