package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			for (k = i + 1;k < n;k++)
			{
			 while ((a[k] == a[i]) && (k < n)) //?a?i???????????
			 {
				  for (t = k;t < n - 1;t++) //???????
				  {
			  a[t] = a[t + 1];
				  }
			  n--;
			 }
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print(a[n - 1]);
		return 0;

	}

}

